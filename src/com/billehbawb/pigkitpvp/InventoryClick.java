package com.billehbawb.pigkitpvp;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.event.player.PlayerDropItemEvent;

public class InventoryClick implements Listener {

	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {

		Player player = (Player) event.getWhoClicked();

		if (event.getSlotType() == SlotType.ARMOR && player.getGameMode() == GameMode.SURVIVAL
				|| event.getSlotType() == SlotType.ARMOR && player.getGameMode() == GameMode.ADVENTURE) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onItemDrop(PlayerDropItemEvent event){
		
		Player player = (Player) event.getPlayer();
		
		if (player.getGameMode() == GameMode.SURVIVAL || player.getGameMode() == GameMode.ADVENTURE){
			event.setCancelled(true);
		}
	}
}
