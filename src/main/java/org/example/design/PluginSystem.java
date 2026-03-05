package org.example.design;

/**
 * 13. How would you design a plugin system where new plugins can be added without modifying the core system?
 *
 * Problem: Design a plugin system using Observer, Adapter, and Factory Method patterns.
 *
 * Approach: Plugins subscribe to events (Observer), Adapter integrates incompatible plugins, Factory Method creates plugins.
 * This is a classic extensibility and design patterns problem.
 */
interface Plugin {
    void onEvent(String event);
}

class PluginAdapter implements Plugin {
    private final Object legacyPlugin;
    public PluginAdapter(Object legacyPlugin) { this.legacyPlugin = legacyPlugin; }
    public void onEvent(String event) {
        System.out.println("Adapting event for legacy plugin: " + event + " [" + legacyPlugin.getClass().getSimpleName() + "]");
    }
}

abstract class PluginFactory {
    public abstract Plugin createPlugin();
}

class MyPluginFactory extends PluginFactory {
    public Plugin createPlugin() { return event -> System.out.println("MyPlugin received: " + event); }
}

class PluginManager {
    private final java.util.List<Plugin> plugins = new java.util.ArrayList<>();
    public void registerPlugin(Plugin plugin) { plugins.add(plugin); }
    public void fireEvent(String event) { for (Plugin p : plugins) p.onEvent(event); }
}

public class PluginSystem {
    public static void main(String[] args) {
        PluginManager manager = new PluginManager();
        manager.registerPlugin(new MyPluginFactory().createPlugin());
        manager.registerPlugin(new PluginAdapter(new Object()));
        manager.fireEvent("Plugin event!");
    }
}

