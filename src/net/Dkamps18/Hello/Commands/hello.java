package net.Dkamps18.Hello.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.Dkamps18.Hello.core;

public class hello implements CommandExecutor {
	private final core plugin;

	public hello(core plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("hello")) { 
			sender.sendMessage(ChatColor.GOLD + plugin.getConfig().getString("message"));
		}
		return true;
	}
}
