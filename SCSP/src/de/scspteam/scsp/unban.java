package de.scspteam.scsp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class unban {
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, JavaPlugin plugin)
	{	
		if(args.length == 1)
		{	
		Player ziel = plugin.getServer().getPlayer(args[0]);
		ziel.setBanned(false);
		sender.sendMessage(ChatColor.GREEN + "Du hast den Spieler " + ChatColor.BLUE + ziel.getName() + ChatColor.GREEN + " entbannt.");
		return true;
		}
		return false;

	}
}
