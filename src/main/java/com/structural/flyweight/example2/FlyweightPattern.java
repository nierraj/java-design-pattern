package com.structural.flyweight.example2;

public class FlyweightPattern {

	private static final String[] playerType = { "Terrorist", "CounterTerrorist" };
	private static final String[] weapons = { "AK-47", "Maverick", "Gut Knife", "Desert Eagle" };

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Player player = PlayerFactory.getPlayer(getRandomPlayerType());
			player.assignWeapon(getRandomWeapon());
			player.mission();
		}

	}

	private static String getRandomPlayerType() {

		return playerType[(int) (Math.random() * playerType.length)];

	}

	private static String getRandomWeapon() {
		return weapons[(int) (Math.random() * weapons.length)];
	}

}
