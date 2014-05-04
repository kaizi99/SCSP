package de.scspteam.scsp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Heal {
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, JavaPlugin plugin)
	{	
		//Command Info: fuelt das leben wieder auf
		if(cmd.getName().equalsIgnoreCase("heal"))
		{
			//Wird der Befehl aus der Konsole gemacht?
			if(!(sender instanceof Player))
			{
				System.out.println("befehl kann aus der konsole nicht ausgefuert werden");
				return true;
			}
			
			if(args.length == 1)
			{
				Player ziel = plugin.getServer().getPlayer(args[0]);
				if(ziel == null)
				{
					sender.sendMessage(ChatColor.RED + "Dieser Spieler existiert momentan nicht");
					return true;
				}
				ziel.setHealth(20.0);
				ziel.sendMessage(ChatColor.GREEN + "Spieler " + sender.getName() + " hat dein Leben aufgefüllt");
				sender.sendMessage(ChatColor.GREEN + "Du hast " + args[0] + " geheilt!");
				return true;
			}
			
			//Playerobjekt wird erstellt und dem Sender des Commands zugewiesen
			Player player = (Player) sender;
			player.setHealth(20.0);
			player.sendMessage(ChatColor.GREEN + "Dein Leben wurde aufgefuellt");

			return true;
		}
		return false;
	}
}