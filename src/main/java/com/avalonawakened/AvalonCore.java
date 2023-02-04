package com.avalonawakened;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AvalonCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Enabling Plugin!!!!");
        Bukkit.getPluginManager().registerEvents(new PlayerListener(),this);
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
