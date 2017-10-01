package com.billehbawb.pigkitpvp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Leave implements Listener {
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event){
		event.setQuitMessage(null);
	}
}
