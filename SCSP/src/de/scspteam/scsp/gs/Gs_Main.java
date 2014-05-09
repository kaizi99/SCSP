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
	//untenHuntenLinks = 2 1 2
	//obenVorneRechts = 1 2 1
	//obenVorneLinks = 2 2 1
	//obenHintenRechts = 1 2 2
	public boolean bereichAuswaehlen(Vector pos1, Vector pos2)
	{
		pos1 = untenVorneRechts;
		pos2 = obenHintenLinks;
		return false;
	}
}
