package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("RPG Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("RPG Plugin disabled!");
    }
}