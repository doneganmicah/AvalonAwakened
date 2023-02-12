package com.avalonawakened.commands;

import com.avalonawakened.enums.LOG_TYPE;
import com.avalonawakened.utilities.MyLogger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CmdExecutor implements CommandExecutor {

    MyLogger logger = new MyLogger();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            // Player only Commands
            if(command.getName().equalsIgnoreCase("example")) {
                //if(sender.hasPermission("permission.example")) {
                    return ExampleCommand.execute(player);
                //}
            }
        } else {
            // Console Commands
            //if(consoleCommand)
            //else
            logger.log(LOG_TYPE.WARNING, "Player only command, you are console");
            return true;
        }


        return false;
    }
}
