package de.scspteam.scsp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import de.scspteam.scsp.gs.Gs;
import de.scspteam.scsp.gs.Gs_erklaerung;

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
		if(cmd.getName().equalsIgnoreCase("SCSPinfo"))
		{
			return SCSPInfo.onCommand(sender, cmd, label, args, this);
		}
		if(cmd.getName().equalsIgnoreCase("feed"))
		{
			return Feed.onCommand(sender, cmd, label, args, this);
		}
		if(cmd.getName().equalsIgnoreCase("heal"))
		{	
			return Heal.onCommand(sender, cmd, label, args, this);
		}
		if(cmd.getName().equalsIgnoreCase("skull"))
		{
			return Skull.onCommand(sender, cmd, label, args, this);
		}
		if(cmd.getName().equalsIgnoreCase("kick"))
		{
			return Kick.onCommand(sender, cmd, label, args, this);
		}
		if(cmd.getName().equalsIgnoreCase("ban"))
		{
			return Ban.onCommand(sender, cmd, label, args, this);
		}
		if(cmd.getName().equalsIgnoreCase("gs"))
		{
			return Gs.onCommand(sender, cmd, label, args);
		}
		if(cmd.getName().equalsIgnoreCase("gs erklaerung"))
		{
			return Gs_erklaerung.onCommand(sender, cmd, label, args);
		}
		return false;
	}
}
