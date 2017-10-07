package com.billehbawb.pigkitpvp;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class Death implements Listener {

	private Main instance;

	public Death(Main instance) {
		this.instance = instance;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {

		Player player = event.getEntity();

		if (!(player.getKiller() instanceof Player)) {
			event.setDeathMessage(ChatColor.RED + player.getName() + " sucks lol");
			resetInv(player);
			return;
		}

		Player killer = (Player) player.getKiller();

		resetInv(player);

		NumberFormat format = new DecimalFormat("#0.00");

		instance.getConfig().set("killstreak." + killer.getUniqueId(),
				instance.getConfig().getInt("killstreak." + killer.getUniqueId()) + 1);

		if (instance.getConfig().getInt("killstreak." + player.getUniqueId()) >= 5) {
			instance.getConfig().set("coins." + killer.getUniqueId(),
					instance.getConfig().getInt("coins." + killer.getUniqueId()) + 20);
			killer.sendMessage(ChatColor.GOLD + "+20 coins! (Shutdown)");
			event.setDeathMessage(ChatColor.RED + player.getName() + " was shutdown by " + killer.getName() + "! ("
					+ format.format(killer.getHealth()) + " Health)");
			instance.getConfig().set("killstreak." + player.getUniqueId(), 0);
			instance.saveConfig();
		}

		instance.getConfig().set("killstreak." + player.getUniqueId(), 0);
		instance.saveConfig();

		event.setDeathMessage(ChatColor.RED + player.getName() + " was killed by " + killer.getName() + "! ("
				+ format.format(killer.getHealth()) + " Health)");

		instance.getConfig().set("coins." + killer.getUniqueId(),
				instance.getConfig().getInt("coins." + killer.getUniqueId()) + 15);
		killer.sendMessage(ChatColor.GOLD + "+15 coins!");

		if (instance.getConfig().getInt("killstreak." + killer.getUniqueId()) >= 10) {
			instance.getConfig().set("coins." + killer.getUniqueId(),
					instance.getConfig().getInt("coins." + killer.getUniqueId()) + 17);
			killer.sendMessage(ChatColor.GOLD + "+17 coins! (Killstreak)");
		}

		if (instance.getConfig().getInt("killstreak." + killer.getUniqueId()) % 10 == 0) {
			Bukkit.getServer().broadcastMessage(ChatColor.RED + killer.getName() + " has a killstreak of "
					+ instance.getConfig().getInt("killstreak." + killer.getUniqueId()));
		}

		killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 5*20, 2));
		killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3*20, 1));

		if (instance.getConfig().getString(killer.getUniqueId() + ".effect").equalsIgnoreCase("blood")) {
			final int stop = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(instance, new Runnable() {
				public void run() {
					int i = 0;
					while (i <= 30) {
						player.playEffect(player.getEyeLocation(), Effect.COLOURED_DUST, 10);
					}
				}
			}, 0L, 0L);
			Bukkit.getScheduler().cancelTask(stop);
		}

		if (instance.getConfig().getString(killer.getUniqueId() + ".effect").equalsIgnoreCase("lightning")) {
			player.getWorld().strikeLightningEffect(player.getLocation());
		}

		if (instance.getConfig().getString(killer.getUniqueId() + ".effect").equalsIgnoreCase("hearts")) {
			final int stop = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(instance, new Runnable() {
				public void run() {
					int i = 0;
					while (i <= 30) {
						player.playEffect(player.getEyeLocation(), Effect.HEART, 10);
					}
				}
			}, 0L, 0L);
			Bukkit.getScheduler().cancelTask(stop);
		}

		return;
	}

	public void resetInv(Player player) {
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
