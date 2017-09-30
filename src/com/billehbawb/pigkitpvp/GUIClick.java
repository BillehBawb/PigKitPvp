package com.billehbawb.pigkitpvp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class GUIClick implements Listener {

	private Main instance;

	public GUIClick(Main instance) {
		this.instance = instance;
	}

	@EventHandler
	public void onGuiClick(InventoryClickEvent event) {

		Player player = (Player) event.getWhoClicked();

		try {
			if (event.getInventory().getTitle().contains("Enchantment Shop (Main)")) {
				if (event.getSlot() == 10) {
					Inventory swordGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Sword)");
					player.openInventory(swordGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sharpness");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Aspect");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking");
					book3.setItemMeta(book3Meta);

					swordGui.setItem(0, purpleStainedGlassPane);
					swordGui.setItem(1, purpleStainedGlassPane);
					swordGui.setItem(2, purpleStainedGlassPane);
					swordGui.setItem(3, purpleStainedGlassPane);
					swordGui.setItem(4, purpleStainedGlassPane);
					swordGui.setItem(5, purpleStainedGlassPane);
					swordGui.setItem(6, purpleStainedGlassPane);
					swordGui.setItem(7, purpleStainedGlassPane);
					swordGui.setItem(8, purpleStainedGlassPane);
					swordGui.setItem(9, blackStainedGlassPane);
					swordGui.setItem(10, book1);
					swordGui.setItem(11, blackStainedGlassPane);
					swordGui.setItem(12, blackStainedGlassPane);
					swordGui.setItem(13, book2);
					swordGui.setItem(14, blackStainedGlassPane);
					swordGui.setItem(15, blackStainedGlassPane);
					swordGui.setItem(16, book3);
					swordGui.setItem(17, blackStainedGlassPane);
					swordGui.setItem(18, purpleStainedGlassPane);
					swordGui.setItem(19, purpleStainedGlassPane);
					swordGui.setItem(20, purpleStainedGlassPane);
					swordGui.setItem(21, purpleStainedGlassPane);
					swordGui.setItem(22, backButton);
					swordGui.setItem(23, purpleStainedGlassPane);
					swordGui.setItem(24, purpleStainedGlassPane);
					swordGui.setItem(25, purpleStainedGlassPane);
					swordGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getSlot() == 13) {
					Inventory armorGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Armor)");
					player.openInventory(armorGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Protection");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Protection");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking");
					book3.setItemMeta(book3Meta);

					armorGui.setItem(0, purpleStainedGlassPane);
					armorGui.setItem(1, purpleStainedGlassPane);
					armorGui.setItem(2, purpleStainedGlassPane);
					armorGui.setItem(3, purpleStainedGlassPane);
					armorGui.setItem(4, purpleStainedGlassPane);
					armorGui.setItem(5, purpleStainedGlassPane);
					armorGui.setItem(6, purpleStainedGlassPane);
					armorGui.setItem(7, purpleStainedGlassPane);
					armorGui.setItem(8, purpleStainedGlassPane);
					armorGui.setItem(9, blackStainedGlassPane);
					armorGui.setItem(10, book1);
					armorGui.setItem(11, blackStainedGlassPane);
					armorGui.setItem(12, blackStainedGlassPane);
					armorGui.setItem(13, book2);
					armorGui.setItem(14, blackStainedGlassPane);
					armorGui.setItem(15, blackStainedGlassPane);
					armorGui.setItem(16, book3);
					armorGui.setItem(17, blackStainedGlassPane);
					armorGui.setItem(18, purpleStainedGlassPane);
					armorGui.setItem(19, purpleStainedGlassPane);
					armorGui.setItem(20, purpleStainedGlassPane);
					armorGui.setItem(21, purpleStainedGlassPane);
					armorGui.setItem(22, backButton);
					armorGui.setItem(23, purpleStainedGlassPane);
					armorGui.setItem(24, purpleStainedGlassPane);
					armorGui.setItem(25, purpleStainedGlassPane);
					armorGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getSlot() == 16) {
					Inventory bowGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Bow)");
					player.openInventory(bowGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Infinity");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Power");
					book2.setItemMeta(book2Meta);

					bowGui.setItem(0, purpleStainedGlassPane);
					bowGui.setItem(1, purpleStainedGlassPane);
					bowGui.setItem(2, purpleStainedGlassPane);
					bowGui.setItem(3, purpleStainedGlassPane);
					bowGui.setItem(4, purpleStainedGlassPane);
					bowGui.setItem(5, purpleStainedGlassPane);
					bowGui.setItem(6, purpleStainedGlassPane);
					bowGui.setItem(7, purpleStainedGlassPane);
					bowGui.setItem(8, purpleStainedGlassPane);
					bowGui.setItem(9, blackStainedGlassPane);
					bowGui.setItem(10, blackStainedGlassPane);
					bowGui.setItem(11, book1);
					bowGui.setItem(12, blackStainedGlassPane);
					bowGui.setItem(13, blackStainedGlassPane);
					bowGui.setItem(14, blackStainedGlassPane);
					bowGui.setItem(15, book2);
					bowGui.setItem(16, blackStainedGlassPane);
					bowGui.setItem(17, blackStainedGlassPane);
					bowGui.setItem(18, purpleStainedGlassPane);
					bowGui.setItem(19, purpleStainedGlassPane);
					bowGui.setItem(20, purpleStainedGlassPane);
					bowGui.setItem(21, purpleStainedGlassPane);
					bowGui.setItem(22, backButton);
					bowGui.setItem(23, purpleStainedGlassPane);
					bowGui.setItem(24, purpleStainedGlassPane);
					bowGui.setItem(25, purpleStainedGlassPane);
					bowGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (Sword)")) {
				if (event.getSlot() == 10) {
					Inventory sharpnessGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Sharpness)");
					player.openInventory(sharpnessGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sharpness 1");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sharpness 2");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sharpness 3");
					book3.setItemMeta(book3Meta);

					sharpnessGui.setItem(0, purpleStainedGlassPane);
					sharpnessGui.setItem(1, purpleStainedGlassPane);
					sharpnessGui.setItem(2, purpleStainedGlassPane);
					sharpnessGui.setItem(3, purpleStainedGlassPane);
					sharpnessGui.setItem(4, purpleStainedGlassPane);
					sharpnessGui.setItem(5, purpleStainedGlassPane);
					sharpnessGui.setItem(6, purpleStainedGlassPane);
					sharpnessGui.setItem(7, purpleStainedGlassPane);
					sharpnessGui.setItem(8, purpleStainedGlassPane);
					sharpnessGui.setItem(9, blackStainedGlassPane);
					sharpnessGui.setItem(10, book1);
					sharpnessGui.setItem(11, blackStainedGlassPane);
					sharpnessGui.setItem(12, blackStainedGlassPane);
					sharpnessGui.setItem(13, book2);
					sharpnessGui.setItem(14, blackStainedGlassPane);
					sharpnessGui.setItem(15, blackStainedGlassPane);
					sharpnessGui.setItem(16, book3);
					sharpnessGui.setItem(17, blackStainedGlassPane);
					sharpnessGui.setItem(18, purpleStainedGlassPane);
					sharpnessGui.setItem(19, purpleStainedGlassPane);
					sharpnessGui.setItem(20, purpleStainedGlassPane);
					sharpnessGui.setItem(21, purpleStainedGlassPane);
					sharpnessGui.setItem(22, backButton);
					sharpnessGui.setItem(23, purpleStainedGlassPane);
					sharpnessGui.setItem(24, purpleStainedGlassPane);
					sharpnessGui.setItem(25, purpleStainedGlassPane);
					sharpnessGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getSlot() == 13) {
					Inventory fireAspectGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (F Aspect)");
					player.openInventory(fireAspectGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Aspect 1");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Aspect 2");
					book2.setItemMeta(book2Meta);

					fireAspectGui.setItem(0, purpleStainedGlassPane);
					fireAspectGui.setItem(1, purpleStainedGlassPane);
					fireAspectGui.setItem(2, purpleStainedGlassPane);
					fireAspectGui.setItem(3, purpleStainedGlassPane);
					fireAspectGui.setItem(4, purpleStainedGlassPane);
					fireAspectGui.setItem(5, purpleStainedGlassPane);
					fireAspectGui.setItem(6, purpleStainedGlassPane);
					fireAspectGui.setItem(7, purpleStainedGlassPane);
					fireAspectGui.setItem(8, purpleStainedGlassPane);
					fireAspectGui.setItem(9, blackStainedGlassPane);
					fireAspectGui.setItem(10, blackStainedGlassPane);
					fireAspectGui.setItem(11, book1);
					fireAspectGui.setItem(12, blackStainedGlassPane);
					fireAspectGui.setItem(13, blackStainedGlassPane);
					fireAspectGui.setItem(14, blackStainedGlassPane);
					fireAspectGui.setItem(15, book2);
					fireAspectGui.setItem(16, blackStainedGlassPane);
					fireAspectGui.setItem(17, blackStainedGlassPane);
					fireAspectGui.setItem(18, purpleStainedGlassPane);
					fireAspectGui.setItem(19, purpleStainedGlassPane);
					fireAspectGui.setItem(20, purpleStainedGlassPane);
					fireAspectGui.setItem(21, purpleStainedGlassPane);
					fireAspectGui.setItem(22, backButton);
					fireAspectGui.setItem(23, purpleStainedGlassPane);
					fireAspectGui.setItem(24, purpleStainedGlassPane);
					fireAspectGui.setItem(25, purpleStainedGlassPane);
					fireAspectGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getSlot() == 16) {
					Inventory unbreakingGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (SUnbreak)");
					player.openInventory(unbreakingGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking 1");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking 2");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking 3");
					book3.setItemMeta(book3Meta);

					unbreakingGui.setItem(0, purpleStainedGlassPane);
					unbreakingGui.setItem(1, purpleStainedGlassPane);
					unbreakingGui.setItem(2, purpleStainedGlassPane);
					unbreakingGui.setItem(3, purpleStainedGlassPane);
					unbreakingGui.setItem(4, purpleStainedGlassPane);
					unbreakingGui.setItem(5, purpleStainedGlassPane);
					unbreakingGui.setItem(6, purpleStainedGlassPane);
					unbreakingGui.setItem(7, purpleStainedGlassPane);
					unbreakingGui.setItem(8, purpleStainedGlassPane);
					unbreakingGui.setItem(9, blackStainedGlassPane);
					unbreakingGui.setItem(10, book1);
					unbreakingGui.setItem(11, blackStainedGlassPane);
					unbreakingGui.setItem(12, blackStainedGlassPane);
					unbreakingGui.setItem(13, book2);
					unbreakingGui.setItem(14, blackStainedGlassPane);
					unbreakingGui.setItem(15, blackStainedGlassPane);
					unbreakingGui.setItem(16, book3);
					unbreakingGui.setItem(17, blackStainedGlassPane);
					unbreakingGui.setItem(18, purpleStainedGlassPane);
					unbreakingGui.setItem(19, purpleStainedGlassPane);
					unbreakingGui.setItem(20, purpleStainedGlassPane);
					unbreakingGui.setItem(21, purpleStainedGlassPane);
					unbreakingGui.setItem(22, backButton);
					unbreakingGui.setItem(23, purpleStainedGlassPane);
					unbreakingGui.setItem(24, purpleStainedGlassPane);
					unbreakingGui.setItem(25, purpleStainedGlassPane);
					unbreakingGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory enchantGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Main)");
					player.openInventory(enchantGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sword Enchants");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Armor Enchants");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Bow Enchants");
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
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (Armor)")) {
				if (event.getSlot() == 10) {
					Inventory protectionGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Prot)");
					player.openInventory(protectionGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Protection 1");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Protection 2");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Protection 3");
					book3.setItemMeta(book3Meta);

					protectionGui.setItem(0, purpleStainedGlassPane);
					protectionGui.setItem(1, purpleStainedGlassPane);
					protectionGui.setItem(2, purpleStainedGlassPane);
					protectionGui.setItem(3, purpleStainedGlassPane);
					protectionGui.setItem(4, purpleStainedGlassPane);
					protectionGui.setItem(5, purpleStainedGlassPane);
					protectionGui.setItem(6, purpleStainedGlassPane);
					protectionGui.setItem(7, purpleStainedGlassPane);
					protectionGui.setItem(8, purpleStainedGlassPane);
					protectionGui.setItem(9, blackStainedGlassPane);
					protectionGui.setItem(10, book1);
					protectionGui.setItem(11, blackStainedGlassPane);
					protectionGui.setItem(12, blackStainedGlassPane);
					protectionGui.setItem(13, book2);
					protectionGui.setItem(14, blackStainedGlassPane);
					protectionGui.setItem(15, blackStainedGlassPane);
					protectionGui.setItem(16, book3);
					protectionGui.setItem(17, blackStainedGlassPane);
					protectionGui.setItem(18, purpleStainedGlassPane);
					protectionGui.setItem(19, purpleStainedGlassPane);
					protectionGui.setItem(20, purpleStainedGlassPane);
					protectionGui.setItem(21, purpleStainedGlassPane);
					protectionGui.setItem(22, backButton);
					protectionGui.setItem(23, purpleStainedGlassPane);
					protectionGui.setItem(24, purpleStainedGlassPane);
					protectionGui.setItem(25, purpleStainedGlassPane);
					protectionGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getSlot() == 13) {
					Inventory fireProtGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (F Prot)");
					player.openInventory(fireProtGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Protection 1");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Protection 2");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Protecton 3");
					book3.setItemMeta(book3Meta);

					fireProtGui.setItem(0, purpleStainedGlassPane);
					fireProtGui.setItem(1, purpleStainedGlassPane);
					fireProtGui.setItem(2, purpleStainedGlassPane);
					fireProtGui.setItem(3, purpleStainedGlassPane);
					fireProtGui.setItem(4, purpleStainedGlassPane);
					fireProtGui.setItem(5, purpleStainedGlassPane);
					fireProtGui.setItem(6, purpleStainedGlassPane);
					fireProtGui.setItem(7, purpleStainedGlassPane);
					fireProtGui.setItem(8, purpleStainedGlassPane);
					fireProtGui.setItem(9, blackStainedGlassPane);
					fireProtGui.setItem(10, book1);
					fireProtGui.setItem(11, blackStainedGlassPane);
					fireProtGui.setItem(12, blackStainedGlassPane);
					fireProtGui.setItem(13, book2);
					fireProtGui.setItem(14, blackStainedGlassPane);
					fireProtGui.setItem(15, blackStainedGlassPane);
					fireProtGui.setItem(16, book3);
					fireProtGui.setItem(17, blackStainedGlassPane);
					fireProtGui.setItem(18, purpleStainedGlassPane);
					fireProtGui.setItem(19, purpleStainedGlassPane);
					fireProtGui.setItem(20, purpleStainedGlassPane);
					fireProtGui.setItem(21, purpleStainedGlassPane);
					fireProtGui.setItem(22, backButton);
					fireProtGui.setItem(23, purpleStainedGlassPane);
					fireProtGui.setItem(24, purpleStainedGlassPane);
					fireProtGui.setItem(25, purpleStainedGlassPane);
					fireProtGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getSlot() == 16) {
					Inventory unbreakingGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (A Unbreak)");
					player.openInventory(unbreakingGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking 1");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking 2");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking 3");
					book3.setItemMeta(book3Meta);

					unbreakingGui.setItem(0, purpleStainedGlassPane);
					unbreakingGui.setItem(1, purpleStainedGlassPane);
					unbreakingGui.setItem(2, purpleStainedGlassPane);
					unbreakingGui.setItem(3, purpleStainedGlassPane);
					unbreakingGui.setItem(4, purpleStainedGlassPane);
					unbreakingGui.setItem(5, purpleStainedGlassPane);
					unbreakingGui.setItem(6, purpleStainedGlassPane);
					unbreakingGui.setItem(7, purpleStainedGlassPane);
					unbreakingGui.setItem(8, purpleStainedGlassPane);
					unbreakingGui.setItem(9, blackStainedGlassPane);
					unbreakingGui.setItem(10, book1);
					unbreakingGui.setItem(11, blackStainedGlassPane);
					unbreakingGui.setItem(12, blackStainedGlassPane);
					unbreakingGui.setItem(13, book2);
					unbreakingGui.setItem(14, blackStainedGlassPane);
					unbreakingGui.setItem(15, blackStainedGlassPane);
					unbreakingGui.setItem(16, book3);
					unbreakingGui.setItem(17, blackStainedGlassPane);
					unbreakingGui.setItem(18, purpleStainedGlassPane);
					unbreakingGui.setItem(19, purpleStainedGlassPane);
					unbreakingGui.setItem(20, purpleStainedGlassPane);
					unbreakingGui.setItem(21, purpleStainedGlassPane);
					unbreakingGui.setItem(22, backButton);
					unbreakingGui.setItem(23, purpleStainedGlassPane);
					unbreakingGui.setItem(24, purpleStainedGlassPane);
					unbreakingGui.setItem(25, purpleStainedGlassPane);
					unbreakingGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory enchantGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Main)");
					player.openInventory(enchantGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sword Enchants");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Armor Enchants");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Bow Enchants");
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
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (Bow)")) {
				if (event.getSlot() == 11) {
					if (player.getItemInHand().getType() != Material.BOW) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your bow to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 200) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 200)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 200);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 15) {
					Inventory powerGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Power)");
					player.openInventory(powerGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Power 1");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Power 2");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Power 3");
					book3.setItemMeta(book3Meta);

					powerGui.setItem(0, purpleStainedGlassPane);
					powerGui.setItem(1, purpleStainedGlassPane);
					powerGui.setItem(2, purpleStainedGlassPane);
					powerGui.setItem(3, purpleStainedGlassPane);
					powerGui.setItem(4, purpleStainedGlassPane);
					powerGui.setItem(5, purpleStainedGlassPane);
					powerGui.setItem(6, purpleStainedGlassPane);
					powerGui.setItem(7, purpleStainedGlassPane);
					powerGui.setItem(8, purpleStainedGlassPane);
					powerGui.setItem(9, blackStainedGlassPane);
					powerGui.setItem(10, book1);
					powerGui.setItem(11, blackStainedGlassPane);
					powerGui.setItem(12, blackStainedGlassPane);
					powerGui.setItem(13, book2);
					powerGui.setItem(14, blackStainedGlassPane);
					powerGui.setItem(15, blackStainedGlassPane);
					powerGui.setItem(16, book3);
					powerGui.setItem(17, blackStainedGlassPane);
					powerGui.setItem(18, purpleStainedGlassPane);
					powerGui.setItem(19, purpleStainedGlassPane);
					powerGui.setItem(20, purpleStainedGlassPane);
					powerGui.setItem(21, purpleStainedGlassPane);
					powerGui.setItem(22, backButton);
					powerGui.setItem(23, purpleStainedGlassPane);
					powerGui.setItem(24, purpleStainedGlassPane);
					powerGui.setItem(25, purpleStainedGlassPane);
					powerGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory enchantGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Main)");
					player.openInventory(enchantGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sword Enchants");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Armor Enchants");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Bow Enchants");
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
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (Sharpness)")) {
				if (event.getSlot() == 10) {
					if (player.getItemInHand().getType() != Material.IRON_SWORD) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your sword to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 100) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 100)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 100);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 13) {
					if (player.getItemInHand().getType() != Material.IRON_SWORD) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your sword to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 200) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 200)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 200);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 16) {
					if (player.getItemInHand().getType() != Material.IRON_SWORD) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your sword to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 300) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 300)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 300);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory swordGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Sword)");
					player.openInventory(swordGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sharpness");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Aspect");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking");
					book3.setItemMeta(book3Meta);

					swordGui.setItem(0, purpleStainedGlassPane);
					swordGui.setItem(1, purpleStainedGlassPane);
					swordGui.setItem(2, purpleStainedGlassPane);
					swordGui.setItem(3, purpleStainedGlassPane);
					swordGui.setItem(4, purpleStainedGlassPane);
					swordGui.setItem(5, purpleStainedGlassPane);
					swordGui.setItem(6, purpleStainedGlassPane);
					swordGui.setItem(7, purpleStainedGlassPane);
					swordGui.setItem(8, purpleStainedGlassPane);
					swordGui.setItem(9, blackStainedGlassPane);
					swordGui.setItem(10, book1);
					swordGui.setItem(11, blackStainedGlassPane);
					swordGui.setItem(12, blackStainedGlassPane);
					swordGui.setItem(13, book2);
					swordGui.setItem(14, blackStainedGlassPane);
					swordGui.setItem(15, blackStainedGlassPane);
					swordGui.setItem(16, book3);
					swordGui.setItem(17, blackStainedGlassPane);
					swordGui.setItem(18, purpleStainedGlassPane);
					swordGui.setItem(19, purpleStainedGlassPane);
					swordGui.setItem(20, purpleStainedGlassPane);
					swordGui.setItem(21, purpleStainedGlassPane);
					swordGui.setItem(22, backButton);
					swordGui.setItem(23, purpleStainedGlassPane);
					swordGui.setItem(24, purpleStainedGlassPane);
					swordGui.setItem(25, purpleStainedGlassPane);
					swordGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (F Aspect)")) {
				if (event.getSlot() == 11) {
					if (player.getItemInHand().getType() != Material.IRON_SWORD) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your sword to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 50) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 50)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 50);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 15) {
					if (player.getItemInHand().getType() != Material.IRON_SWORD) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your sword to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 100) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 100)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 100);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory swordGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Sword)");
					player.openInventory(swordGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sharpness");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Aspect");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking");
					book3.setItemMeta(book3Meta);

					swordGui.setItem(0, purpleStainedGlassPane);
					swordGui.setItem(1, purpleStainedGlassPane);
					swordGui.setItem(2, purpleStainedGlassPane);
					swordGui.setItem(3, purpleStainedGlassPane);
					swordGui.setItem(4, purpleStainedGlassPane);
					swordGui.setItem(5, purpleStainedGlassPane);
					swordGui.setItem(6, purpleStainedGlassPane);
					swordGui.setItem(7, purpleStainedGlassPane);
					swordGui.setItem(8, purpleStainedGlassPane);
					swordGui.setItem(9, blackStainedGlassPane);
					swordGui.setItem(10, book1);
					swordGui.setItem(11, blackStainedGlassPane);
					swordGui.setItem(12, blackStainedGlassPane);
					swordGui.setItem(13, book2);
					swordGui.setItem(14, blackStainedGlassPane);
					swordGui.setItem(15, blackStainedGlassPane);
					swordGui.setItem(16, book3);
					swordGui.setItem(17, blackStainedGlassPane);
					swordGui.setItem(18, purpleStainedGlassPane);
					swordGui.setItem(19, purpleStainedGlassPane);
					swordGui.setItem(20, purpleStainedGlassPane);
					swordGui.setItem(21, purpleStainedGlassPane);
					swordGui.setItem(22, backButton);
					swordGui.setItem(23, purpleStainedGlassPane);
					swordGui.setItem(24, purpleStainedGlassPane);
					swordGui.setItem(25, purpleStainedGlassPane);
					swordGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (SUnbreak)")) {
				if (event.getSlot() == 10) {
					if (player.getItemInHand().getType() != Material.IRON_SWORD) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your sword to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 50) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 50)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 50);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.DURABILITY, 1);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 13) {
					if (player.getItemInHand().getType() != Material.IRON_SWORD) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your sword to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 100) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 100)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 100);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.DURABILITY, 2);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 16) {
					if (player.getItemInHand().getType() != Material.IRON_SWORD) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your sword to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 150) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 150)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 150);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.DURABILITY, 3);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory swordGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Sword)");
					player.openInventory(swordGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sharpness");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Aspect");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking");
					book3.setItemMeta(book3Meta);

					swordGui.setItem(0, purpleStainedGlassPane);
					swordGui.setItem(1, purpleStainedGlassPane);
					swordGui.setItem(2, purpleStainedGlassPane);
					swordGui.setItem(3, purpleStainedGlassPane);
					swordGui.setItem(4, purpleStainedGlassPane);
					swordGui.setItem(5, purpleStainedGlassPane);
					swordGui.setItem(6, purpleStainedGlassPane);
					swordGui.setItem(7, purpleStainedGlassPane);
					swordGui.setItem(8, purpleStainedGlassPane);
					swordGui.setItem(9, blackStainedGlassPane);
					swordGui.setItem(10, book1);
					swordGui.setItem(11, blackStainedGlassPane);
					swordGui.setItem(12, blackStainedGlassPane);
					swordGui.setItem(13, book2);
					swordGui.setItem(14, blackStainedGlassPane);
					swordGui.setItem(15, blackStainedGlassPane);
					swordGui.setItem(16, book3);
					swordGui.setItem(17, blackStainedGlassPane);
					swordGui.setItem(18, purpleStainedGlassPane);
					swordGui.setItem(19, purpleStainedGlassPane);
					swordGui.setItem(20, purpleStainedGlassPane);
					swordGui.setItem(21, purpleStainedGlassPane);
					swordGui.setItem(22, backButton);
					swordGui.setItem(23, purpleStainedGlassPane);
					swordGui.setItem(24, purpleStainedGlassPane);
					swordGui.setItem(25, purpleStainedGlassPane);
					swordGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (Prot)")) {
				if (event.getSlot() == 10) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 100) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 100)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 100);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 13) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 200) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 200)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 200);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 16) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 300) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 300)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 300);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory armorGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Armor)");
					player.openInventory(armorGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Protection");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Protection");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking");
					book3.setItemMeta(book3Meta);

					armorGui.setItem(0, purpleStainedGlassPane);
					armorGui.setItem(1, purpleStainedGlassPane);
					armorGui.setItem(2, purpleStainedGlassPane);
					armorGui.setItem(3, purpleStainedGlassPane);
					armorGui.setItem(4, purpleStainedGlassPane);
					armorGui.setItem(5, purpleStainedGlassPane);
					armorGui.setItem(6, purpleStainedGlassPane);
					armorGui.setItem(7, purpleStainedGlassPane);
					armorGui.setItem(8, purpleStainedGlassPane);
					armorGui.setItem(9, blackStainedGlassPane);
					armorGui.setItem(10, book1);
					armorGui.setItem(11, blackStainedGlassPane);
					armorGui.setItem(12, blackStainedGlassPane);
					armorGui.setItem(13, book2);
					armorGui.setItem(14, blackStainedGlassPane);
					armorGui.setItem(15, blackStainedGlassPane);
					armorGui.setItem(16, book3);
					armorGui.setItem(17, blackStainedGlassPane);
					armorGui.setItem(18, purpleStainedGlassPane);
					armorGui.setItem(19, purpleStainedGlassPane);
					armorGui.setItem(20, purpleStainedGlassPane);
					armorGui.setItem(21, purpleStainedGlassPane);
					armorGui.setItem(22, backButton);
					armorGui.setItem(23, purpleStainedGlassPane);
					armorGui.setItem(24, purpleStainedGlassPane);
					armorGui.setItem(25, purpleStainedGlassPane);
					armorGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (F Prot)")) {
				if (event.getSlot() == 10) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 50) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 50)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 50);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 1);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 1);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 1);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 1);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 13) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 100) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 100)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 100);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 16) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 150) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 150)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 150);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 3);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 3);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 3);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 3);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory armorGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Armor)");
					player.openInventory(armorGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Protection");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Protection");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking");
					book3.setItemMeta(book3Meta);

					armorGui.setItem(0, purpleStainedGlassPane);
					armorGui.setItem(1, purpleStainedGlassPane);
					armorGui.setItem(2, purpleStainedGlassPane);
					armorGui.setItem(3, purpleStainedGlassPane);
					armorGui.setItem(4, purpleStainedGlassPane);
					armorGui.setItem(5, purpleStainedGlassPane);
					armorGui.setItem(6, purpleStainedGlassPane);
					armorGui.setItem(7, purpleStainedGlassPane);
					armorGui.setItem(8, purpleStainedGlassPane);
					armorGui.setItem(9, blackStainedGlassPane);
					armorGui.setItem(10, book1);
					armorGui.setItem(11, blackStainedGlassPane);
					armorGui.setItem(12, blackStainedGlassPane);
					armorGui.setItem(13, book2);
					armorGui.setItem(14, blackStainedGlassPane);
					armorGui.setItem(15, blackStainedGlassPane);
					armorGui.setItem(16, book3);
					armorGui.setItem(17, blackStainedGlassPane);
					armorGui.setItem(18, purpleStainedGlassPane);
					armorGui.setItem(19, purpleStainedGlassPane);
					armorGui.setItem(20, purpleStainedGlassPane);
					armorGui.setItem(21, purpleStainedGlassPane);
					armorGui.setItem(22, backButton);
					armorGui.setItem(23, purpleStainedGlassPane);
					armorGui.setItem(24, purpleStainedGlassPane);
					armorGui.setItem(25, purpleStainedGlassPane);
					armorGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (A Unbreak)")) {
				if (event.getSlot() == 10) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 50) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 50)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 50);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.DURABILITY, 1);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.DURABILITY, 1);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.DURABILITY, 1);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.DURABILITY, 1);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 13) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 100) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 100)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 100);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.DURABILITY, 2);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.DURABILITY, 2);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.DURABILITY, 2);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.DURABILITY, 2);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 16) {
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 150) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 150)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 150);
					instance.saveConfig();
					player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.DURABILITY, 3);
					player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.DURABILITY, 3);
					player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.DURABILITY, 3);
					player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.DURABILITY, 3);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory armorGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Armor)");
					player.openInventory(armorGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Protection");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Fire Protection");
					book2.setItemMeta(book2Meta);

					ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book3Meta = book3.getItemMeta();
					book3Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Unbreaking");
					book3.setItemMeta(book3Meta);

					armorGui.setItem(0, purpleStainedGlassPane);
					armorGui.setItem(1, purpleStainedGlassPane);
					armorGui.setItem(2, purpleStainedGlassPane);
					armorGui.setItem(3, purpleStainedGlassPane);
					armorGui.setItem(4, purpleStainedGlassPane);
					armorGui.setItem(5, purpleStainedGlassPane);
					armorGui.setItem(6, purpleStainedGlassPane);
					armorGui.setItem(7, purpleStainedGlassPane);
					armorGui.setItem(8, purpleStainedGlassPane);
					armorGui.setItem(9, blackStainedGlassPane);
					armorGui.setItem(10, book1);
					armorGui.setItem(11, blackStainedGlassPane);
					armorGui.setItem(12, blackStainedGlassPane);
					armorGui.setItem(13, book2);
					armorGui.setItem(14, blackStainedGlassPane);
					armorGui.setItem(15, blackStainedGlassPane);
					armorGui.setItem(16, book3);
					armorGui.setItem(17, blackStainedGlassPane);
					armorGui.setItem(18, purpleStainedGlassPane);
					armorGui.setItem(19, purpleStainedGlassPane);
					armorGui.setItem(20, purpleStainedGlassPane);
					armorGui.setItem(21, purpleStainedGlassPane);
					armorGui.setItem(22, backButton);
					armorGui.setItem(23, purpleStainedGlassPane);
					armorGui.setItem(24, purpleStainedGlassPane);
					armorGui.setItem(25, purpleStainedGlassPane);
					armorGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Enchantment Shop (Power)")) {
				if (event.getSlot() == 10) {
					if (player.getItemInHand().getType() != Material.BOW) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your bow to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 100) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 100)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 100);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 1);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 13) {
					if (player.getItemInHand().getType() != Material.BOW) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your bow to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 200) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 200)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 200);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 2);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getSlot() == 16) {
					if (player.getItemInHand().getType() != Material.BOW) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You must be holding your bow to enchant!");
						return;
					}
					if (instance.getConfig().getInt("coins." + player.getUniqueId()) < 300) {
						player.closeInventory();
						player.sendMessage(ChatColor.RED + "You do not have enough coins! (Need 300)");
						return;
					}
					instance.getConfig().set("coins." + player.getUniqueId(),
							instance.getConfig().getInt("coins." + player.getUniqueId()) - 300);
					instance.saveConfig();
					player.getItemInHand().addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 3);
					player.sendMessage(ChatColor.RED + "Successfully enchanted!");
					player.playSound(player.getLocation(), Sound.ANVIL_USE, 5, 5);
				}
				if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Back")) {
					Inventory bowGui = Bukkit.createInventory(null, 27,
							ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Enchantment Shop (Bow)");
					player.openInventory(bowGui);

					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);

					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);

					ItemStack backButton = new ItemStack(Material.STAINED_GLASS_PANE);
					ItemMeta backButtonMeta = backButton.getItemMeta();
					backButtonMeta.setDisplayName(ChatColor.RED + "Back");
					backButton.setItemMeta(backButtonMeta);
					backButton.setDurability((short) 4);

					ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book1Meta = book1.getItemMeta();
					book1Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Infinity");
					book1.setItemMeta(book1Meta);

					ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
					ItemMeta book2Meta = book2.getItemMeta();
					book2Meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Power");
					book2.setItemMeta(book2Meta);

					bowGui.setItem(0, purpleStainedGlassPane);
					bowGui.setItem(1, purpleStainedGlassPane);
					bowGui.setItem(2, purpleStainedGlassPane);
					bowGui.setItem(3, purpleStainedGlassPane);
					bowGui.setItem(4, purpleStainedGlassPane);
					bowGui.setItem(5, purpleStainedGlassPane);
					bowGui.setItem(6, purpleStainedGlassPane);
					bowGui.setItem(7, purpleStainedGlassPane);
					bowGui.setItem(8, purpleStainedGlassPane);
					bowGui.setItem(9, blackStainedGlassPane);
					bowGui.setItem(10, blackStainedGlassPane);
					bowGui.setItem(11, book1);
					bowGui.setItem(12, blackStainedGlassPane);
					bowGui.setItem(13, blackStainedGlassPane);
					bowGui.setItem(14, blackStainedGlassPane);
					bowGui.setItem(15, book2);
					bowGui.setItem(16, blackStainedGlassPane);
					bowGui.setItem(17, blackStainedGlassPane);
					bowGui.setItem(18, purpleStainedGlassPane);
					bowGui.setItem(19, purpleStainedGlassPane);
					bowGui.setItem(20, purpleStainedGlassPane);
					bowGui.setItem(21, purpleStainedGlassPane);
					bowGui.setItem(22, backButton);
					bowGui.setItem(23, purpleStainedGlassPane);
					bowGui.setItem(24, purpleStainedGlassPane);
					bowGui.setItem(25, purpleStainedGlassPane);
					bowGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Cosmetics")) {
				if (event.getSlot() == 11){
					if (!(player.hasPermission("pig.trails"))){
						player.sendMessage(ChatColor.RED + "You do not have permission to access the particle trails!");
						return;
					}
					
					Inventory trailGui = Bukkit.createInventory(null, 27, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Arrow Trails");
					player.openInventory(trailGui);
					
					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);
					
					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);
					
					ItemStack smoke = new ItemStack(Material.SKULL);
					ItemMeta smokeMeta = smoke.getItemMeta();
					smokeMeta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Smoke Arrow Trail");
					smoke.setItemMeta(smokeMeta);
					smoke.setDurability((short) 1);
					
					ItemStack fire = new ItemStack(Material.LAVA_BUCKET);
					ItemMeta fireMeta = fire.getItemMeta();
					fireMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Fire Arrow Trail");
					fire.setItemMeta(fireMeta);
					
					ItemStack sparks = new ItemStack(Material.RED_ROSE);
					ItemMeta sparksMeta = sparks.getItemMeta();
					sparksMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Green Sparks Trail");
					sparks.setItemMeta(sparksMeta);
					
					trailGui.setItem(0, purpleStainedGlassPane);
					trailGui.setItem(1, purpleStainedGlassPane);
					trailGui.setItem(2, purpleStainedGlassPane);
					trailGui.setItem(3, purpleStainedGlassPane);
					trailGui.setItem(4, purpleStainedGlassPane);
					trailGui.setItem(5, purpleStainedGlassPane);
					trailGui.setItem(6, purpleStainedGlassPane);
					trailGui.setItem(7, purpleStainedGlassPane);
					trailGui.setItem(8, purpleStainedGlassPane);
					trailGui.setItem(9, blackStainedGlassPane);
					trailGui.setItem(10, smoke);
					trailGui.setItem(11, blackStainedGlassPane);
					trailGui.setItem(12, blackStainedGlassPane);
					trailGui.setItem(13, fire);
					trailGui.setItem(14, blackStainedGlassPane);
					trailGui.setItem(15, blackStainedGlassPane);
					trailGui.setItem(16, sparks);
					trailGui.setItem(17, blackStainedGlassPane);
					trailGui.setItem(18, purpleStainedGlassPane);
					trailGui.setItem(19, purpleStainedGlassPane);
					trailGui.setItem(20, purpleStainedGlassPane);
					trailGui.setItem(21, purpleStainedGlassPane);
					trailGui.setItem(22, purpleStainedGlassPane);
					trailGui.setItem(23, purpleStainedGlassPane);
					trailGui.setItem(24, purpleStainedGlassPane);
					trailGui.setItem(25, purpleStainedGlassPane);
					trailGui.setItem(26, purpleStainedGlassPane);
				}
				if (event.getSlot() == 15){
					if (!(player.hasPermission("pig.effects"))){
						player.sendMessage(ChatColor.RED + "You do not have permission to access the kill effects!");
						return;
					}
					
					Inventory effectGui = Bukkit.createInventory(null, 27, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Kill Effects");
					player.openInventory(effectGui);
					
					ItemStack purpleStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 10);
					
					ItemStack blackStainedGlassPane = new ItemStack(Material.STAINED_GLASS_PANE);
					purpleStainedGlassPane.setDurability((short) 7);
					
					ItemStack blood = new ItemStack(Material.REDSTONE);
					ItemMeta bloodMeta = blood.getItemMeta();
					bloodMeta.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Blood Kill Effect");
					blood.setItemMeta(bloodMeta);
					
					ItemStack lightning = new ItemStack(Material.NETHER_STAR);
					ItemMeta lightningMeta = lightning.getItemMeta();
					lightningMeta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Lightning Kill Effect");
					lightning.setItemMeta(lightningMeta);
					
					ItemStack heart = new ItemStack(Material.RED_ROSE);
					ItemMeta heartMeta = heart.getItemMeta();
					heartMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Heart Kill Effect");
					heart.setItemMeta(heartMeta);
					
					effectGui.setItem(0, purpleStainedGlassPane);
					effectGui.setItem(1, purpleStainedGlassPane);
					effectGui.setItem(2, purpleStainedGlassPane);
					effectGui.setItem(3, purpleStainedGlassPane);
					effectGui.setItem(4, purpleStainedGlassPane);
					effectGui.setItem(5, purpleStainedGlassPane);
					effectGui.setItem(6, purpleStainedGlassPane);
					effectGui.setItem(7, purpleStainedGlassPane);
					effectGui.setItem(8, purpleStainedGlassPane);
					effectGui.setItem(9, blackStainedGlassPane);
					effectGui.setItem(10, blood);
					effectGui.setItem(11, blackStainedGlassPane);
					effectGui.setItem(12, blackStainedGlassPane);
					effectGui.setItem(13, lightning);
					effectGui.setItem(14, blackStainedGlassPane);
					effectGui.setItem(15, blackStainedGlassPane);
					effectGui.setItem(16, heart);
					effectGui.setItem(17, blackStainedGlassPane);
					effectGui.setItem(18, purpleStainedGlassPane);
					effectGui.setItem(19, purpleStainedGlassPane);
					effectGui.setItem(20, purpleStainedGlassPane);
					effectGui.setItem(21, purpleStainedGlassPane);
					effectGui.setItem(22, purpleStainedGlassPane);
					effectGui.setItem(23, purpleStainedGlassPane);
					effectGui.setItem(24, purpleStainedGlassPane);
					effectGui.setItem(25, purpleStainedGlassPane);
					effectGui.setItem(26, purpleStainedGlassPane);
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Arrow Trails")) {
				if (event.getSlot() == 10){
					instance.getConfig().set(player.getUniqueId() + ".trail", "smoke");
					player.closeInventory();
					player.sendMessage(ChatColor.RED + "Arrow trail selected!");
				}
				if (event.getSlot() == 13){
					instance.getConfig().set(player.getUniqueId() + ".trail", "fire");
					player.closeInventory();
					player.sendMessage(ChatColor.RED + "Arrow trail selected!");
				}
				if (event.getSlot() == 16){
					instance.getConfig().set(player.getUniqueId() + ".trail", "sparks");
					player.closeInventory();
					player.sendMessage(ChatColor.RED + "Arrow trail selected!");
				}
				event.setCancelled(true);
			}
			if (event.getInventory().getTitle().contains("Kill Effects")) {
				if (event.getSlot() == 10){
					instance.getConfig().set(player.getUniqueId() + ".effect", "blood");
					player.closeInventory();
					player.sendMessage(ChatColor.RED + "Kill effect selected!");
				}
				if (event.getSlot() == 13){
					instance.getConfig().set(player.getUniqueId() + ".effect", "lightning");
					player.closeInventory();
					player.sendMessage(ChatColor.RED + "Kill effect selected!");
				}
				if (event.getSlot() == 16){
					instance.getConfig().set(player.getUniqueId() + ".effect", "hearts");
					player.closeInventory();
					player.sendMessage(ChatColor.RED + "Kill effect selected!");
				}
				event.setCancelled(true);
			}
		} catch (Exception e) {

		}
	}
}
