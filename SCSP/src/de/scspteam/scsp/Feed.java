package de.scspteam.scsp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed
{
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
{	
	//Command Info: fuelt den hunger wieder auf
	if(cmd.getName().equalsIgnoreCase("feed"))
	{
		//Wird der Befehl aus der Konsole gemacht?
		if(!(sender instanceof Player))
		{
			System.out.println("befehl kann aus der konsole nicht ausgefuert werden");
			return true;
		}
		
		//Playerobjekt wird erstellt und dem Sender des Commands zugewiesen
		Player player = (Player) sender;
		player.setFoodLevel(20);
		player.sendMessage(ChatColor.GREEN + "dein hunger wurde aufgefuellt");

		return true;
	}
	return false;

}
}
