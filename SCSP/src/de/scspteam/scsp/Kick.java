package de.scspteam.scsp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Kick 
{
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, JavaPlugin plugin)
	{
		if(cmd.getName().equalsIgnoreCase("kick"))
		if(args.length == 1)
		{
			Player ziel = Bukkit.getPlayer(args[0]);
			ziel.kickPlayer("Sie wurden von diesem Server gekickt!");
			sender.sendMessage(ChatColor.GREEN + "Du hast den Spieler " + ChatColor.RED + ziel.getName() + ChatColor.GREEN + " gekickt");
			return true;
		}
		return false;
	}
}
