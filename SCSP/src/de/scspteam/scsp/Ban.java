package de.scspteam.scsp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Ban 
{
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args, JavaPlugin plugin)
	{	
		if(args.length == 1)
		{	
		Player target = plugin.getServer().getPlayer(args[0]);
		target.kickPlayer("Sie wurden von diesem Server gebannt!");
		target.setBanned(true);
		sender.sendMessage(ChatColor.GREEN + "Du hast den Spieler " + ChatColor.RED + target.getName() + ChatColor.GREEN + " gebannt");
		return true;
		}
		
		return false;
	}
}
