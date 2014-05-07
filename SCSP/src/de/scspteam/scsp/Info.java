package de.scspteam.scsp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Info {
	
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, JavaPlugin plugin) {	
		PluginDescriptionFile description = plugin.getDescription();
		
		// Command Info: Gibt Version und Entwickler des Plugins heraus
		if (cmd.getName().equalsIgnoreCase("info"))	{
			// Wird der Befehl aus der Konsole gemacht?
			if (!(sender instanceof Player)) {
				// Konsole die Nachricht senden
				System.out.println("Version: " + description.getVersion());
				System.out.println("Entwickler: " + description.getAuthors());
				System.out.println("Website: " + description.getWebsite());
				return true;
			}
			
			// Playerobjekt wird erstellt und dem Sender des Commands zugewiesen
			Player player = (Player) sender;
			
			// Dem Spieler die Nachrichten senden
			player.sendMessage("Version: " + ChatColor.BLUE + description.getVersion());
			player.sendMessage("Entwickler: " + ChatColor.BLUE + description.getAuthors());
			player.sendMessage("Website: " + ChatColor.BLUE + description.getWebsite());
			return true;
		}
		return false;
	}
}
