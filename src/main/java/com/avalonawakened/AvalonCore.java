package com.avalonawakened;

import com.avalonawakened.commands.CmdExecutor;
import com.avalonawakened.commands.CmdTabExecutor;
import com.avalonawakened.listeners.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class AvalonCore extends JavaPlugin {

    public AvalonCore plugin;
    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Enabling Plugin!!!!");

        // Register Listeners
        Bukkit.getPluginManager().registerEvents(new PlayerListener(),this);

        // Load Commands
        plugin.getCommand("example").setExecutor(new CmdExecutor());
        plugin.getCommand("example").setTabCompleter(new CmdTabExecutor());
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
