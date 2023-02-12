package com.avalonawakened.utilities;
import com.avalonawakened.AvalonCore;
import com.avalonawakened.enums.LOG_TYPE;
import org.apache.logging.log4j.message.Message;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

public class MyLogger {

    String prefix = "[AvalonCore]::"; // The prefix for the plugin
    ConsoleCommandSender console = Bukkit.getConsoleSender(); // instance of the consoleSender

    public MyLogger() {
    }

    /*******************************************************************************************************************
     * Send a plugin specific message to the console
     * used for normal logs, debug logs, error, warnings, and fatal errors
     * @param type the log type of the message
     * @param msg the message to be sent to the console
     ******************************************************************************************************************/
    public void log(LOG_TYPE type, String msg) {
        switch (type) {
            case LOG: // A normal log msg
                console.sendMessage(prefix + "[Log] "+ msg);
                break;
            case DEBUG: // used for debug messages
                console.sendMessage(prefix +  ChatColor.LIGHT_PURPLE + "[Debug] " +  msg);
                break;
            case ERROR: // When an error occurred
                console.sendMessage(prefix + ChatColor.RED + "[ERROR] " + msg);
                break;
            case FATAL: // When a fatal error occurred
                console.sendMessage(prefix + ChatColor.DARK_RED + "[FATAL] " + msg);
                break;
            case WARNING: // When a warning occurred
                console.sendMessage(prefix + ChatColor.YELLOW + "[Warning] " + msg);
                break;
            default:

        }
    }

}
