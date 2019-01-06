package net.Dkamps18.Hello;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.Dkamps18.Hello.Commands.hello;
import net.Dkamps18.Hello.Commands.particles;

public class core extends JavaPlugin implements Listener {
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		getConfig().options().copyDefaults(true);
		saveConfig();
		getCommand("hello").setExecutor(new hello(this));
		getCommand("particleattack").setExecutor(new particles(this));
		System.out.println("[Dkamps18-Hello] Loaded plugin or something like that");	
	}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		p.sendMessage(ChatColor.GOLD + getConfig().getString("message"));
    }
	
	@EventHandler
	public void sleep(PlayerBedEnterEvent event) { 
		Player p = event.getPlayer();
		p.sendMessage(ChatColor.GOLD + getConfig().getString("sleepmessage"));
	}
	
	@EventHandler
	public void ride(VehicleEnterEvent event) { 
		Entity p = event.getEntered();
		p.sendMessage(ChatColor.GREEN + getConfig().getString("ridemessage"));
	}
}
