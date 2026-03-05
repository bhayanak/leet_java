# LeetCode Solutions — Java

3 018 solved LeetCode problems in Java, organised by difficulty.

# Check Demo at : https://bhayanak.github.io/leet_java/

## Structure

```
src/main/java/org/leetcode/
├── easy/      730 problems
├── medium/    1 554 problems
└── hard/      734 problems
```

Every file follows a consistent Javadoc format:
- **Class level** — problem statement, examples, constraints, approach, time/space complexity
- **Method level** — concise algorithm explanation with `@Explanation`

## Build

```bash
./gradlew compileJava   # compile only
./gradlew build         # compile
./gradlew docs          # generate Javadoc
```

## Docs Page

A single-file static HTML page listing all problems:

```bash
python3 scripts/gen_docs.py       # writes docs/index.html
open docs/index.html              # open in browser
```

Features:
- **Easy / Medium / Hard tabs** with problem counts
- **Search bar** — filters cards in real time
- **Problem cards** — click to expand description
- **Show Solution** — reveals approach, complexity, and explanation
- No external dependencies — pure HTML/CSS/JS

## Notes

- Regenerate `docs/index.html` after any Javadoc update.
