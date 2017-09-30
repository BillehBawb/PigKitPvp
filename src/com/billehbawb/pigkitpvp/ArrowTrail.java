package com.billehbawb.pigkitpvp;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class ArrowTrail implements Listener {

	private Main instance;

	public ArrowTrail(Main instance) {
		this.instance = instance;
	}

	@EventHandler
	public void onProjectileLaunch(ProjectileLaunchEvent e) {

		if (e.getEntityType() == EntityType.ARROW && e.getEntity().getShooter() instanceof Player) {

			Player player = (Player) e.getEntity().getShooter();
			
			final int stop = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(instance, new Runnable() {
                public void run() {
                	if (instance.getConfig().getString(player.getUniqueId() + ".trail").equalsIgnoreCase("smoke")) {
						e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.LARGE_SMOKE, 10);
					}
					if (instance.getConfig().getString(player.getUniqueId() + ".trail").equalsIgnoreCase("fire")) {
						e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.FLAME, 10);
					}
					if (instance.getConfig().getString(player.getUniqueId() + ".trail")
							.equalsIgnoreCase("sparks")) {
						e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.HAPPY_VILLAGER, 10);
					}
                }
            }, 0L, 0L);
			
            Bukkit.getScheduler().scheduleSyncRepeatingTask(instance, new Runnable() {
                public void run() {
                    if (e.getEntity().isOnGround() || e.getEntity() == null) {
                        Bukkit.getScheduler().cancelTask(stop);
                    }
                }
            }, 0L, 0L);
		}
	}
}
