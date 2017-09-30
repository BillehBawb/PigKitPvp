package com.billehbawb.pigkitpvp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Cosmetics implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (!(sender instanceof Player)){
			return false;
		}
		
		Player player = (Player) sender;
		
		if (!(player.hasPermission("pig.cosmetics"))){
			return false;
		}
		
		Inventory cosmeticsGui = Bukkit.createInventory(null, 27,
				ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Cosmetics");
		player.openInventory(cosmeticsGui);

		ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
		purpleStainedGlassPane.setDurability((short) 10);

		ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
		purpleStainedGlassPane.setDurability((short) 7);

		ItemStack trails = new ItemStack(Material.ARROW);
		ItemMeta trailsMeta = trails.getItemMeta();
		trailsMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Arrow Trails");
		trails.setItemMeta(trailsMeta);

		ItemStack effects = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta effectsMeta = effects.getItemMeta();
		effectsMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Kill Effects");
		effects.setItemMeta(effectsMeta);

		cosmeticsGui.setItem(0, purpleStainedGlassPane);
		cosmeticsGui.setItem(1, purpleStainedGlassPane);
		cosmeticsGui.setItem(2, purpleStainedGlassPane);
		cosmeticsGui.setItem(3, purpleStainedGlassPane);
		cosmeticsGui.setItem(4, purpleStainedGlassPane);
		cosmeticsGui.setItem(5, purpleStainedGlassPane);
		cosmeticsGui.setItem(6, purpleStainedGlassPane);
		cosmeticsGui.setItem(7, purpleStainedGlassPane);
		cosmeticsGui.setItem(8, purpleStainedGlassPane);
		cosmeticsGui.setItem(9, blackStainedGlassPane);
		cosmeticsGui.setItem(10, blackStainedGlassPane);
		cosmeticsGui.setItem(11, trails);
		cosmeticsGui.setItem(12, blackStainedGlassPane);
		cosmeticsGui.setItem(13, blackStainedGlassPane);
		cosmeticsGui.setItem(14, blackStainedGlassPane);
		cosmeticsGui.setItem(15, effects);
		cosmeticsGui.setItem(16, blackStainedGlassPane);
		cosmeticsGui.setItem(17, blackStainedGlassPane);
		cosmeticsGui.setItem(18, purpleStainedGlassPane);
		cosmeticsGui.setItem(19, purpleStainedGlassPane);
		cosmeticsGui.setItem(20, purpleStainedGlassPane);
		cosmeticsGui.setItem(21, purpleStainedGlassPane);
		cosmeticsGui.setItem(22, purpleStainedGlassPane);
		cosmeticsGui.setItem(23, purpleStainedGlassPane);
		cosmeticsGui.setItem(24, purpleStainedGlassPane);
		cosmeticsGui.setItem(25, purpleStainedGlassPane);
		cosmeticsGui.setItem(26, purpleStainedGlassPane);
		
		return false;
	}
}
