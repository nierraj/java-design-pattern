package com.structural.flyweight.example2;

import java.util.HashMap;

class PlayerFactory {

	private static final HashMap<String, Player> hm = new HashMap<String, Player>();

	// Method to get a player
	public static Player getPlayer(String type) {
		Player p = hm.get(type);

		if (p == null) {

			if ("Terrorist".equalsIgnoreCase(type)) {
				System.out.println("Terroist object created.");
				p = new Terrorist();
			} else if ("CounterTerrorist".equalsIgnoreCase(type)) {
				System.out.println("Counter Terrorist object created.");
				p = new CounterTerrorist();
			}
			hm.put(type, p);
		}
		return p;
	}
}