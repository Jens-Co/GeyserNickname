package com.alysaa.floodname;

import com.alysaa.floodname.listener.NamerListener;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class FloodNamer extends JavaPlugin implements Listener {
    private static FileConfiguration config;
    public static FloodNamer plugin;

    public void onEnable() {
        plugin = this;
        createFiles();
        getLogger().info("Has been enabled");
            Bukkit.getServer().getPluginManager().registerEvents(new NamerListener(), this);
        }
    public void onDisable() {
        getLogger().info("Has been disabled");
    }
    private void createFiles() {
        File configFile = new File(getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            configFile.getParentFile().mkdirs();
            saveResource("config.yml", false);
        }
        config = new YamlConfiguration();
        try {
            config.load(configFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
