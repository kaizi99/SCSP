package de.scspteam.scsp.gs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;

public class Gs
{
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("gs"))
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.GREEN + "Hallo, " + sender.getName());	
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " + ChatColor.DARK_RED + "Diese kommandos kannst du nutzen: ");	
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs erklaerung" );	
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs anfordern" );
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs auswahl" );
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs verlassen" );
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs 	loeschen" );
				if(sender.hasPermission("gs.allow"))
				{
					sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs allow" );
				}
				if(sender.hasPermission("gs.erlauben"))
				{
					sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs erlauben" );
				}
				if(sender.hasPermission("gs.tp"))
				{
					sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs tp" );
				}
				if(sender.hasPermission("gs.akzeptieren"))
				{
					sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs akzeptieren" );
				}
				if(sender.hasPermission("gs.verstecken"))
				{
					sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs verstecken" );
				}
				if(sender.hasPermission("gs.ablehnen"))
				{
					sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "/gs ablehnen" );
				}
				return true;
			} 
			if(args.length == 1 && args[0] == "allow")
			{
				sender.sendMessage("Das ist der Allow Comand!");
				return true;
			}
			else
			{
				sender.sendMessage(ChatColor.GOLD + "[Skate큦 Community Server] " +  ChatColor.DARK_RED + "Der Parameter des Commands existiert nicht.");
				return true;
			}
	}
}