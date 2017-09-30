package com.billehbawb.pigkitpvp;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class GiveCoins implements CommandExecutor {

	private Main instance;

	public GiveCoins(Main instance) {
		this.instance = instance;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		if (!(sender instanceof Player)) {
			return false;
		}

		Player player = (Player) sender;
		
		if (!(player.hasPermission("admin.coins"))) {
			player.sendMessage(ChatColor.RED + "No permission.");
		}

		if (args.length != 2) {
			player.sendMessage(ChatColor.RED + "Incorrect usage! '/givecoins <name> <amount>'");
			return false;
		}

		instance.getConfig().set("coins." + Bukkit.getPlayer(args[0]).getUniqueId(),
				instance.getConfig().getInt("coins." + Bukkit.getPlayer(args[0]).getUniqueId())
						+ Integer.parseInt(args[1]));
		instance.saveConfig();

		player.sendMessage(ChatColor.RED + "Given " + args[0] + " " + args[1] + " coins!");

		return false;
	}
}
