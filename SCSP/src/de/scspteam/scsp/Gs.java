package de.scspteam.scsp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;

public class Gs
{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		   //kommando "Gs"
		if(cmd.getName().equalsIgnoreCase("gs")){
			
				
			sender.sendMessage(ChatColor.GREEN + "Hallo, "+sender.getName());	
			sender.sendMessage(ChatColor.GREEN + "[Skate큦 Community Server] " + ChatColor.DARK_RED + "Diese kommandos kannst du nutzen: ");	
			sender.sendMessage(ChatColor.BLUE + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs erklaerung" );	
			sender.sendMessage(ChatColor.BLUE + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs ask" );
			if(sender.hasPermission("gs.allow"))
			{
				sender.sendMessage(ChatColor.BLUE + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs allow" );
			}
			return true;	
			} else {
				sender.sendMessage(ChatColor.BLUE + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "funktioniert." );
				return  true;
			}
	}
}
