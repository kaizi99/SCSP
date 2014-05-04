package de.scspteam.scsp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Info 
{
	
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{	
		//Command Info: Gibt Version und Entwickler des Plugins heraus
		if(cmd.getName().equalsIgnoreCase("info"))
		{
			//Wird der Befehl aus der Konsole gemacht?
			if(!(sender instanceof Player))
			{
				//Konsole die Nachricht senden
				System.out.println("Version: 0.1");
				System.out.println("Entwickler: kaizi99 und Der_Josh");
				return true;
			}
			
			//Playerobjekt wird erstellt und dem Sender des Commands zugewiesen
			Player player = (Player) sender;
			
			//Dem Spieler die Nachrichten senden
			player.sendMessage("Version: " + ChatColor.BLUE + "0.1");
			player.sendMessage("Entwickler: " + ChatColor.BLUE + "kaizi99 und Der_Josh");
			return true;
		}
		return false;
	}
}
