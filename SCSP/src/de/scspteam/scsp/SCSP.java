package de.scspteam.scsp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SCSP extends JavaPlugin 
{
	//Wenn das Plugin erfolgreich geladen wurde
	@Override
	public void onEnable()
	{
		System.out.println("[Skate's Community Server] Plugin geladen!");
	}
	
	//Wenn das Plugin erfolgreich entladen wurde
	@Override
	public void onDisable()
	{
		System.out.println("[Skate's Community Server] Plugin entladen!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{	
		if(cmd.getName().equalsIgnoreCase("info"))
		{
			return Info.onCommand(sender, cmd, label, args);
		}
		return false;
	}
}
