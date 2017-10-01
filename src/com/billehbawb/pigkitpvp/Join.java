package com.billehbawb.pigkitpvp;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class Join implements Listener {
	
	private Main instance;

	public Join(Main instance) {
		this.instance = instance;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		
		Player player = event.getPlayer();
		
		if (!(player.hasPlayedBefore())){
			instance.getConfig().addDefault("coins." + player.getUniqueId(), 50);
			instance.getConfig().addDefault("killstreak." + player.getUniqueId(), 0);
			instance.getConfig().addDefault(player.getUniqueId() + ".trail", "none");
			instance.getConfig().addDefault(player.getUniqueId() + ".effect", "none");
			instance.saveConfig();
		}
		
		event.setJoinMessage(ChatColor.RED + player.getName() + " has waged war!");
		player.teleport(player.getWorld().getSpawnLocation());
		
		player.getInventory().clear();
		player.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
		player.getInventory().addItem(new ItemStack(Material.BOW));
		player.getInventory().addItem(new ItemStack(Material.FISHING_ROD));
		player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 32));
		player.getInventory().addItem(new ItemStack(Material.ARROW, 64));
		player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
		player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
		player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
	}
}
