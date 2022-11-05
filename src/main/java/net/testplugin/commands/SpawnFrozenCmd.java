package net.testplugin.commands;

import io.lumine.mythic.api.mobs.entities.MythicEntity;
import net.testplugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnFrozenCmd extends command implements CommandExecutor {
    Plugin plugin;
    public SpawnFrozenCmd(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    void execute(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
    }
}
