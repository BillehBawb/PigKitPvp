package com.billehbawb.pigkitpvp;

import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	private static Main instance;

	public static Main getInstance() {
		return instance;
	}

	public void onEnable() {
		instance = this;
		Bukkit.getPluginManager().registerEvents(new GUIClick(this), this);
		Bukkit.getPluginManager().registerEvents(new Death(this), this);
		Bukkit.getPluginManager().registerEvents(new InventoryClick(), this);
		Bukkit.getPluginManager().registerEvents(new Join(this), this);
		Bukkit.getPluginManager().registerEvents(new ArrowTrail(this), this);
		Bukkit.getPluginManager().registerEvents(new Leave(), this);
		getCommand("shopenchant").setExecutor(new OpenGUI());
		getCommand("coins").setExecutor(new Coins(this));
		getCommand("givecoins").setExecutor(new GiveCoins(this));
		getCommand("cosmetics").setExecutor(new Cosmetics());

		Permission enchantShop = new Permission("enchant.shop");
		Bukkit.getPluginManager().addPermission(enchantShop);
		Permission giveCoins = new Permission("admin.coins");
		Bukkit.getPluginManager().addPermission(giveCoins);
		Permission pigCosmetics = new Permission("pig.cosmetics");
		Bukkit.getPluginManager().addPermission(pigCosmetics);
		Permission pigTrails = new Permission("pig.trails");
		Bukkit.getPluginManager().addPermission(pigTrails);
		Permission pigEffects = new Permission("pig.effects");
		Bukkit.getPluginManager().addPermission(pigEffects);

		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
