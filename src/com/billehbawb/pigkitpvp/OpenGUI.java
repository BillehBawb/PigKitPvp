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

public class OpenGUI implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (!(sender instanceof Player)){
			return false;
		}
		
		Player player = (Player) sender;
		
		if (!(player.hasPermission("enchant.shop"))) {
			player.sendMessage(ChatColor.DARK_RED + "No permission.");
			return false;
		}
		
		Inventory enchantGui = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "" + ChatColor.BOLD + "Enchantment Shop (Main)");
		player.openInventory(enchantGui);
		
		ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
		purpleStainedGlassPane.setDurability((short) 10);
		
		ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
		purpleStainedGlassPane.setDurability((short) 7);
		
		ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta book1Meta = book1.getItemMeta();
		book1Meta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Sword Enchants");
		book1.setItemMeta(book1Meta);
		
		ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta book2Meta = book2.getItemMeta();
		book2Meta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Armor Enchants");
		book2.setItemMeta(book2Meta);
		
		ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
		ItemMeta book3Meta = book3.getItemMeta();
		book3Meta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Bow Enchants");
		book3.setItemMeta(book3Meta);
		
		enchantGui.setItem(0, purpleStainedGlassPane);
		enchantGui.setItem(1, purpleStainedGlassPane);
		enchantGui.setItem(2, purpleStainedGlassPane);
		enchantGui.setItem(3, purpleStainedGlassPane);
		enchantGui.setItem(4, purpleStainedGlassPane);
		enchantGui.setItem(5, purpleStainedGlassPane);
		enchantGui.setItem(6, purpleStainedGlassPane);
		enchantGui.setItem(7, purpleStainedGlassPane);
		enchantGui.setItem(8, purpleStainedGlassPane);
		enchantGui.setItem(9, blackStainedGlassPane);
		enchantGui.setItem(10, book1);
		enchantGui.setItem(11, blackStainedGlassPane);
		enchantGui.setItem(12, blackStainedGlassPane);
		enchantGui.setItem(13, book2);
		enchantGui.setItem(14, blackStainedGlassPane);
		enchantGui.setItem(15, blackStainedGlassPane);
		enchantGui.setItem(16, book3);
		enchantGui.setItem(17, blackStainedGlassPane);
		enchantGui.setItem(18, purpleStainedGlassPane);
		enchantGui.setItem(19, purpleStainedGlassPane);
		enchantGui.setItem(20, purpleStainedGlassPane);
		enchantGui.setItem(21, purpleStainedGlassPane);
		enchantGui.setItem(22, purpleStainedGlassPane);
		enchantGui.setItem(23, purpleStainedGlassPane);
		enchantGui.setItem(24, purpleStainedGlassPane);
		enchantGui.setItem(25, purpleStainedGlassPane);
		enchantGui.setItem(26, purpleStainedGlassPane);
		
		return true;
	}
}
