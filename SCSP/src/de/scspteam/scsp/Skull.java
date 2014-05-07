package de.scspteam.scsp;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Skull {
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, JavaPlugin plugin) {
		Player player = (Player)sender;
		ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		
		if (args.length == 0) {
			SkullMeta meta = (SkullMeta) i.getItemMeta();
	        meta.setOwner(sender.getName());
	        i.setItemMeta(meta);
	        player.getInventory().addItem(i);
	        return true;
		}
		if (args.length == 1) {
			SkullMeta meta = (SkullMeta) i.getItemMeta();
			meta.setOwner(args[0]);
			i.setItemMeta(meta);
			player.getInventory().addItem(i);
			return true;
		}
		
		if (args.length > 1) {
			return false;
		}
		return false;
	}
}
