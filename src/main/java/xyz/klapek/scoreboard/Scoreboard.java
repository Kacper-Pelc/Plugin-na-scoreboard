package xyz.klapek.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.klapek.scoreboard.events.ScoreboardEvent;

public final class Scoreboard extends JavaPlugin {
    Scoreboard plugin;

    public Scoreboard getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        System.out.println("plugin na scoreboard sie wlacza");
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ScoreboardEvent(this),this);

    }

    @Override
    public void onDisable() {
        System.out.println("plugin na scoreboard sie wylacza");
    }
}
