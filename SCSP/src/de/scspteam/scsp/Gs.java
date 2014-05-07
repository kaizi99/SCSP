package de.scspteam.scsp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class Gs
{
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(args.length != 0)
		{
			return false;
		}
		
		Player player = (Player)sender;
		
		player.sendMessage(ChatColor.GREEN + "Hallo, "+player.getName());	
		player.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " + ChatColor.DARK_RED + "Diese kommandos kannst du nutzen: ");	
		player.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs erklaerung" );	
		player.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs ask" );
		if(player.hasPermission("gs.allow"))
		{
			player.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs allow" );
		}
		return  true;
	}
}
