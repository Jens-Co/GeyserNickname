package com.alysaa.geysernickname;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.geysermc.floodgate.FloodgatePlayer;


public class NickNamer extends JavaPlugin {
    public FloodgatePlayer floodgatePlayer;

    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new SpigotJoinListener(), this);
        getLogger().info("Has been enabled");

    }

    public void onDisable() {

    }
}
