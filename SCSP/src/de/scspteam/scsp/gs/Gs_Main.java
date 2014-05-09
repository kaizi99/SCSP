package de.scspteam.scsp.gs;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Gs_Main 
{
	Player p;
	Vector untenVorneRechts;
	Vector untenVorneLinks;
	Vector untenHintenRechts;
	Vector untenHintenLinks;
	
	Vector obenVorneRechts;
	Vector obenVorneLinks;
	Vector obenHintenRechts;
	Vector obenHintenLinks;
	public Gs_Main(Player p)
	{
		this.p = p;
	}
	
	
	//Berechnungen:
	//untenVorneLinks = 2 2 1
	//untenHintenRechts = 1 1 2
	//untenHintenLinks = 2 1 2
	//obenVorneRechts = 1 2 1
	//obenVorneLinks = 2 2 1
	//obenHintenRechts = 1 2 2
	public boolean bereichAuswaehlen(Vector pos1, Vector pos2)
	{
		untenVorneRechts = pos1;
		obenHintenLinks = pos2;
		untenVorneLinks = new Vector(pos2.getBlockX(), pos2.getBlockY(), pos1.getBlockZ());
		untenHintenRechts = new Vector(pos1.getBlockX(), pos1.getBlockY(), pos2.getBlockZ());
		untenHintenLinks = new Vector(pos2.getBlockX(), pos1.getBlockY(), pos2.getBlockZ());
		obenHintenRechts = new Vector(pos1.getBlockX(), pos1.getBlockY(), pos2.getBlockZ());
		obenVorneLinks = new Vector(pos2.getBlockX(), pos1.getBlockY(), pos1.getBlockZ());
		obenVorneRechts = new Vector(pos1.getBlockX(), pos2.getBlockY(), pos1.getBlockZ());
		return false;
	}
}
