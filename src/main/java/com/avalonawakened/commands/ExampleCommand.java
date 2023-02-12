package com.avalonawakened.commands;
import com.avalonawakened.enums.LOG_TYPE;
import com.avalonawakened.utilities.MyLogger;
import org.bukkit.entity.Player;

public class ExampleCommand {

    static MyLogger logger = new MyLogger();

    public static boolean execute(Player player) {
        logger.log(LOG_TYPE.DEBUG, "Example command");
        player.sendMessage("Example");
        return true;
    }

}
