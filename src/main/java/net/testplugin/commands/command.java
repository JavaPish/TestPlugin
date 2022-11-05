package net.testplugin.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class command implements CommandExecutor {
    abstract void execute(CommandSender sender, String label, String[] args);
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        execute(sender,label,args);
        return true;
    }
}
