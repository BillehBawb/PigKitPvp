package com.billehbawb.pigkitpvp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Coins implements CommandExecutor {
	
	private Main instance;

	public Coins(Main instance) {
		this.instance = instance;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (!(sender instanceof Player)){
			return false;
		}
		
		Player player = (Player) sender;
		
		player.sendMessage(ChatColor.GOLD + "Coins: " + instance.getConfig().getInt("coins." + player.getUniqueId()));
		
		return false;
	}
}
