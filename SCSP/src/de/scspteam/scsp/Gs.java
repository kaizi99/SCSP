package de.scspteam.scsp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;

public class Gs
{
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("gs"))
		{
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.GREEN + "Hallo, "+sender.getName());	
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " + ChatColor.DARK_RED + "Diese kommandos kannst du nutzen: ");	
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs erklaerung" );	
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs ask" );
				if(sender.hasPermission("gs.allow"))
				{
					sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs allow" );
				}
				return true;
			} 
			if(args.length == 1 && args[0] == "allow")
			{
				sender.sendMessage("Das ist der Allow Comand!");
				return true;
			}
			return false;
		}
		return false;
	}
}
