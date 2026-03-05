#!/usr/bin/env python3
"""
gen_docs.py — Generate a static HTML docs page from LeetCode Java files.

Usage: python3 scripts/gen_docs.py [output_path]
Default output: docs/index.html

Parses class-level Javadoc from each *.java file and generates an
interactive single-page app with Easy / Medium / Hard tabs.

Each card shows: problem title + difficulty badge.
Clicking a card expands the problem description.
Clicking "Show Solution" reveals the approach + complexity + explanation,
plus a "View Source" link to the raw file on GitHub (or locally).
"""

import os
import re
import json
import sys
from pathlib import Path

ROOT = Path(__file__).parent.parent
SRC  = ROOT / "src/main/java/org/leetcode"
DIFFICULTIES = ["easy", "medium", "hard"]

# ─── Javadoc Parsing ─────────────────────────────────────────────────────────

def extract_class_javadoc(text: str) -> dict:
    """Extract structured info from the first block comment before `public class`."""
    # Grab the block comment just before the class declaration
    m = re.search(r'/\*\*(.*?)\*/\s*(?:public\s+class|public\s+interface)', text, re.DOTALL)
    if not m:
        return {}
    raw = m.group(1)

    def inner(tag_open, tag_close=None):
        if tag_close is None:
            # Plain text after an h2 / p tag
            tag_close = r'<(?:h2|/pre|/p|@see)'
        pattern = re.compile(
            re.escape(tag_open) + r'(.*?)(?=' + tag_close + r')',
            re.DOTALL | re.IGNORECASE,
        )
        found = pattern.search(raw)
        return clean(found.group(1)) if found else ''

    def between(open_h2, close_h2='<h2'):
        p = re.compile(
            r'<h2>' + re.escape(open_h2) + r'</h2>\s*<pre>(.*?)</pre>',
            re.DOTALL | re.IGNORECASE,
        )
        m2 = p.search(raw)
        if m2:
            return clean(m2.group(1))
        # fallback: everything between h2 tags
        p2 = re.compile(
            r'<h2>' + re.escape(open_h2) + r'</h2>(.*?)(?=<h2>|@see|$)',
            re.DOTALL | re.IGNORECASE,
        )
        m3 = p2.search(raw)
        return clean(m3.group(1)) if m3 else ''

    # Title from <b> tag
    title_m = re.search(r'<b>(.*?)</b>', raw, re.IGNORECASE)
    title = clean(title_m.group(1)) if title_m else ''

    # Difficulty from <p><b>Difficulty:</b> ...
    diff_m = re.search(r'Difficulty.*?</b>\s*(.*?)(?:</p>|$)', raw, re.IGNORECASE | re.DOTALL)
    difficulty = clean(diff_m.group(1)) if diff_m else ''

    # Category / Topics
    cat_m = re.search(r'(?:Category|Topics).*?</b>\s*(.*?)(?:</p>|$)', raw, re.IGNORECASE | re.DOTALL)
    category = clean(cat_m.group(1)) if cat_m else ''

    # Problem description (inside <pre>)
    problem_desc = between('Problem Description')
    approach     = between('Approach')
    complexity   = between('Complexity')
    hints        = between('Hints to Solve')

    # @Explanation
    expl_m = re.search(r'@Explanation\s+(.*?)(?:\n\s*\*\s*@|\n\s*\*/)', raw, re.DOTALL)
    explanation = clean(expl_m.group(1)) if expl_m else ''

    # LeetCode @see link
    see_m = re.search(r'@see\s+<a href="(https://leetcode[^"]+)"', raw, re.IGNORECASE)
    leetcode_url = see_m.group(1) if see_m else ''

    return {
        'title':       title,
        'difficulty':  difficulty,
        'category':    category,
        'description': problem_desc,
        'approach':    approach,
        'complexity':  complexity,
        'hints':       hints,
        'explanation': explanation,
        'url':         leetcode_url,
    }


def clean(s: str) -> str:
    """Strip leading/trailing Javadoc asterisks and normalize whitespace."""
    # Remove leading " * " Javadoc lines
    lines = []
    for line in s.splitlines():
        line = re.sub(r'^\s*\*\s?', '', line)
        lines.append(line)
    result = '\n'.join(lines).strip()
    # Collapse excessive blank lines
    result = re.sub(r'\n{3,}', '\n\n', result)
    return result


# ─── File scanner ─────────────────────────────────────────────────────────────

def scan_difficulty(difficulty: str) -> list:
    folder = SRC / difficulty
    problems = []
    for java_file in sorted(folder.glob("*.java")):
        text = java_file.read_text(encoding='utf-8', errors='replace')
        info = extract_class_javadoc(text)
        if not info.get('title') and not info.get('description'):
            # Fallback: use class name as title
            info['title'] = java_file.stem
        info['class_name'] = java_file.stem
        info['difficulty'] = info.get('difficulty') or difficulty.capitalize()
        info['filename'] = java_file.name
        info['rel_path'] = f"../src/main/java/org/leetcode/{difficulty}/{java_file.name}"
        
        # Get the method-level @Explanation if class-level is missing
        if not info.get('explanation'):
            method_expl = re.search(r'@Explanation\s+(.*?)(?:\n[^*]|\*/)', text, re.DOTALL)
            if method_expl:
                info['explanation'] = clean(method_expl.group(1))
        
        problems.append(info)
    return problems


# ─── HTML Generator ──────────────────────────────────────────────────────────

BADGE_COLORS = {
    'easy':   '#00b894',
    'medium': '#f39c12',
    'hard':   '#e74c3c',
}

def esc(s: str) -> str:
    return (s
        .replace('&', '&amp;')
        .replace('<', '&lt;')
        .replace('>', '&gt;')
        .replace('"', '&quot;')
    )


def make_card(prob: dict, idx: int, difficulty: str) -> str:
    card_id = f"{difficulty}_{idx}"
    title = esc(prob.get('title') or prob.get('class_name', ''))
    category = esc(prob.get('category', ''))
    description = esc(prob.get('description', ''))
    approach = esc(prob.get('approach', ''))
    complexity = esc(prob.get('complexity', ''))
    hints = esc(prob.get('hints', ''))
    explanation = esc(prob.get('explanation', ''))
    url = prob.get('url', '')
    rel_path = prob.get('rel_path', '')
    badge_color = BADGE_COLORS.get(difficulty.lower(), '#888')
    diff_label = difficulty.capitalize()

    lc_link = f'<a class="lc-link" href="{url}" target="_blank">LeetCode ↗</a>' if url else ''
    src_link = f'<a class="lc-link" href="{rel_path}" target="_blank">View Source ↗</a>' if rel_path else ''

    solution_section = ''
    if approach or complexity or explanation:
        parts = []
        if hints:
            parts.append(f'<div class="sol-section"><b>💡 Hints</b><pre>{hints}</pre></div>')
        if approach:
            parts.append(f'<div class="sol-section"><b>🧠 Approach</b><p>{approach}</p></div>')
        if complexity:
            parts.append(f'<div class="sol-section"><b>⏱ Complexity</b><p>{complexity}</p></div>')
        if explanation:
            parts.append(f'<div class="sol-section"><b>📝 Explanation</b><p>{explanation}</p></div>')
        solution_section = f'''
            <div class="solution hidden" id="sol_{card_id}">
                {''.join(parts)}
                <div class="sol-links">{lc_link} {src_link}</div>
            </div>
            <button class="btn-solution" onclick="toggleSol('{card_id}')">Show Solution</button>
        '''
    else:
        solution_section = f'<div class="sol-links">{lc_link} {src_link}</div>'

    desc_block = f'<pre class="desc">{description}</pre>' if description else '<p class="no-desc">No description available.</p>'

    return f'''
    <div class="card" id="card_{card_id}" onclick="toggleCard('{card_id}', event)">
        <div class="card-header">
            <span class="badge" style="background:{badge_color}">{diff_label}</span>
            <span class="card-title">{title}</span>
            <span class="card-cat">{category}</span>
            <span class="chevron" id="chev_{card_id}">▸</span>
        </div>
        <div class="card-body hidden" id="body_{card_id}">
            {desc_block}
            {solution_section}
        </div>
    </div>'''


def generate_html(all_problems: dict) -> str:
    tabs_html = '\n'.join(
        f'<button class="tab-btn" id="tab_{d}" onclick="showTab(\'{d}\')">{d.capitalize()} '
        f'<span class="tab-count">({len(all_problems[d])})</span></button>'
        for d in DIFFICULTIES
    )

    panels = []
    for d in DIFFICULTIES:
        cards = '\n'.join(make_card(p, i, d) for i, p in enumerate(all_problems[d]))
        panels.append(f'<div class="panel" id="panel_{d}">\n{cards}\n</div>')

    panels_html = '\n'.join(panels)

    return f'''<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>LeetCode Solutions</title>
  <style>
    :root {{
      --bg: #0f1117;
      --surface: #1a1d27;
      --border: #2d3048;
      --text: #e2e8f0;
      --muted: #94a3b8;
      --accent: #7c6af7;
      --easy: #00b894;
      --medium: #f39c12;
      --hard: #e74c3c;
    }}
    * {{ box-sizing: border-box; margin: 0; padding: 0; }}
    body {{ background: var(--bg); color: var(--text); font-family: 'Segoe UI', sans-serif; }}
    header {{
      background: var(--surface);
      border-bottom: 1px solid var(--border);
      padding: 20px 40px;
      display: flex; align-items: center; gap: 16px;
    }}
    header h1 {{ font-size: 1.5rem; color: var(--accent); letter-spacing: 1px; }}
    header .subtitle {{ color: var(--muted); font-size: 0.9rem; }}

    .search-bar {{
      padding: 8px 16px;
      background: var(--bg); border: 1px solid var(--border);
      border-radius: 8px; color: var(--text); font-size: 0.95rem;
      width: 280px; margin-left: auto;
      outline: none;
    }}
    .search-bar:focus {{ border-color: var(--accent); }}

    .tabs {{
      display: flex; gap: 8px; padding: 20px 40px 0;
    }}
    .tab-btn {{
      background: transparent; border: 1px solid var(--border);
      color: var(--muted); padding: 8px 20px; border-radius: 8px 8px 0 0;
      cursor: pointer; font-size: 0.95rem; transition: all 0.2s;
    }}
    .tab-btn.active {{ background: var(--accent); color: #fff; border-color: var(--accent); }}
    .tab-count {{ font-size: 0.78rem; opacity: 0.8; }}

    .panels {{ padding: 0 40px 40px; }}
    .panel {{ display: none; flex-direction: column; gap: 12px; padding-top: 16px; }}
    .panel.visible {{ display: flex; }}

    .card {{
      background: var(--surface); border: 1px solid var(--border);
      border-radius: 10px; overflow: hidden;
      transition: border-color 0.2s;
      cursor: pointer;
    }}
    .card:hover {{ border-color: var(--accent); }}
    .card-header {{
      display: flex; align-items: center; gap: 12px;
      padding: 14px 20px;
    }}
    .badge {{
      font-size: 0.72rem; padding: 3px 10px; border-radius: 12px;
      color: #fff; font-weight: 600; text-transform: uppercase; letter-spacing: 0.5px;
      flex-shrink: 0;
    }}
    .card-title {{ font-size: 1rem; font-weight: 600; color: var(--text); flex: 1; }}
    .card-cat {{ font-size: 0.78rem; color: var(--muted); }}
    .chevron {{ color: var(--muted); font-size: 0.9rem; transition: transform 0.2s; }}
    .chevron.open {{ transform: rotate(90deg); }}

    .card-body {{ padding: 0 20px 16px; }}
    .hidden {{ display: none !important; }}

    .desc {{
      background: #12151f; border: 1px solid var(--border);
      border-radius: 8px; padding: 14px 16px;
      font-size: 0.85rem; line-height: 1.65;
      white-space: pre-wrap; color: #c3cfe2;
      max-height: 320px; overflow-y: auto;
      margin-bottom: 12px;
    }}
    .no-desc {{ color: var(--muted); font-size: 0.85rem; margin-bottom: 12px; }}

    .btn-solution {{
      background: var(--accent); border: none;
      color: #fff; padding: 8px 18px; border-radius: 6px;
      cursor: pointer; font-size: 0.85rem;
      transition: opacity 0.2s;
    }}
    .btn-solution:hover {{ opacity: 0.8; }}

    .solution {{
      background: #12151f; border: 1px solid var(--border);
      border-radius: 8px; padding: 14px 16px; margin-top: 12px;
    }}
    .sol-section {{ margin-bottom: 12px; }}
    .sol-section b {{ color: var(--accent); font-size: 0.85rem; display: block; margin-bottom: 4px; }}
    .sol-section p, .sol-section pre {{
      font-size: 0.85rem; color: #c3cfe2; line-height: 1.6;
      white-space: pre-wrap;
    }}
    .sol-links {{ display: flex; gap: 12px; margin-top: 10px; }}
    .lc-link {{
      font-size: 0.8rem; color: var(--accent); text-decoration: none;
    }}
    .lc-link:hover {{ text-decoration: underline; }}
  </style>
</head>
<body>
  <header>
    <div>
      <h1>⚡ LeetCode Solutions</h1>
      <div class="subtitle">Easy / Medium / Hard — click a card to read the problem, show solution to reveal approach.</div>
    </div>
    <input class="search-bar" type="text" id="search" placeholder="Search problems..." oninput="filterCards()">
  </header>

  <div class="tabs">{tabs_html}</div>
  <div class="panels">{panels_html}</div>

  <script>
    let currentTab = 'easy';

    function showTab(d) {{
      ['easy','medium','hard'].forEach(t => {{
        const p = document.getElementById('panel_' + t);
        p.classList.remove('visible');
        document.getElementById('tab_' + t).classList.remove('active');
      }});
      const target = document.getElementById('panel_' + d);
      target.classList.add('visible');
      document.getElementById('tab_' + d).classList.add('active');
      currentTab = d;
    }}

    function toggleCard(id, event) {{
      if (event && event.target.classList.contains('btn-solution')) return;
      if (event && event.target.classList.contains('lc-link')) return;
      const body = document.getElementById('body_' + id);
      const chev = document.getElementById('chev_' + id);
      body.classList.toggle('hidden');
      chev.classList.toggle('open');
    }}

    function toggleSol(id) {{
      const sol = document.getElementById('sol_' + id);
      const btn = sol.previousElementSibling;
      sol.classList.toggle('hidden');
      btn.textContent = sol.classList.contains('hidden') ? 'Show Solution' : 'Hide Solution';
    }}

    function filterCards() {{
      const q = document.getElementById('search').value.toLowerCase();
      ['easy','medium','hard'].forEach(d => {{
        const cards = document.querySelectorAll('#panel_' + d + ' .card');
        let any = false;
        cards.forEach(card => {{
          const text = card.innerText.toLowerCase();
          const match = text.includes(q);
          card.style.display = match ? '' : 'none';
          if (match) any = true;
        }});
      }});
    }}

    // Init
    showTab('easy');
  </script>
</body>
</html>
'''


# ─── Main ─────────────────────────────────────────────────────────────────────

def main():
    out_path = Path(sys.argv[1]) if len(sys.argv) > 1 else ROOT / "docs/index.html"
    out_path.parent.mkdir(parents=True, exist_ok=True)

    all_problems = {}
    for d in DIFFICULTIES:
        problems = scan_difficulty(d)
        all_problems[d] = problems
        print(f"  {d.capitalize()}: {len(problems)} problems")

    html = generate_html(all_problems)
    out_path.write_text(html, encoding='utf-8')
    print(f"\n✅ Docs generated → {out_path}")


if __name__ == '__main__':
    main()
