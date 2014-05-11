package de.scspteam.scsp.gs;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Gs_erklaerung {
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		sender.sendMessage(ChatColor.DARK_RED + "Wilkommen, " + sender.getName() + ChatColor.GOLD + "zur erklaerung von dem /gs kommando,      		  " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "erst brauchst du geld welches du dir            		  " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "erwirtschaften musst.                            		  " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "dann kannst du überall auf der welt dir ein     		  " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "grundstück welches dir gefällt suchen        	  		  " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "um weiter zu machen kannst du den /gs auswahl   		  " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "benutzen welcher dein inventar speichert und            " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "dich in eine gs auswahl versetzt                        " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "dort kannst du dann zwei punkte wie bei WorldEdit       " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "markieren und eine anfrage für dein grundstück          " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "senden das geht mit dem /gs anfordern kommando          " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "der preis hiervon ist: Blockanzahl*Entfernung vom spawn " );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "" );
		sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "" );
		
return false;
}
}