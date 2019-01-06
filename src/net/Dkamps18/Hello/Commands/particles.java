package net.Dkamps18.Hello.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.Dkamps18.Hello.core;

public class particles implements CommandExecutor {
	@SuppressWarnings("unused")
	private final core plugin;

	public particles(core plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("particleattack")) { 
			Player p = (Player) sender;
			sender.sendMessage(ChatColor.GOLD + "PARTICLE ATTACK");
			p.spawnParticle(Particle.VILLAGER_HAPPY, p.getLocation().add(1,2,0), 50);			
		}
		return true;
	}
}
