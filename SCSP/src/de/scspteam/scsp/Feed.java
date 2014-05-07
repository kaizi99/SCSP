package de.scspteam.scsp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Feed
{
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, JavaPlugin plugin)
{	
	//Command Info: fuelt den hunger wieder auf
	if(cmd.getName().equalsIgnoreCase("feed"))
	{
		Player player = (Player) sender;
		//Wird der Befehl aus der Konsole gemacht?
		if(!(sender instanceof Player))
		{
			System.out.println("Dieser Befehl kann von der Konsole nicht ausgefuert werden.");
			return true;
		}
		
		if(args.length == 1)
		{
			Player ziel = plugin.getServer().getPlayer(args[0]);
			if(ziel == null)
			{
				sender.sendMessage(ChatColor.RED + "Dieser Spieler befindet sich nicht auf dem Server.");
				return true;
			}
			ziel.setFoodLevel(20);
			ziel.sendMessage(ChatColor.GREEN + "Spieler " + sender.getName() + " hat dein Hunger aufgefuellt.");
			sender.sendMessage(ChatColor.GREEN + "Du hast den Hunger von " + args[0] + " beendet!");
			return true;
		}
		
		if(args.length > 1)
		{
			return false;
		}
		
		//Playerobjekt wird erstellt und dem Sender des Commands zugewiesen
		player.setFoodLevel(20);
		player.sendMessage(ChatColor.GREEN + "Dein Hunger wurde aufgefuellt.");

		return true;
	}
	return false;

}
}
