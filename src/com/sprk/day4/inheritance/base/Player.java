package com.sprk.day4.inheritance.base;

// BASE CLASS
public class Player {
	//protected : Only to base class and to the derived class

	protected String name;
	protected String team;

	protected int birthYear;

	public Player() {

		System.out.println("Default constructor of Player is called");
	}
	
	public Player(String name, int birthYear, String team) {
		
		System.out.println("Paramterized constructor of Player is called");
		this.name = name;
		this.birthYear = birthYear;
		this.team = team;
	}
	
	
	
	private int calculateAge() {
		return 2025 - birthYear;
	}
	
	@Override
	public String toString() {
		return "Player [\n\tname=" + name +",\n\tteam="+team+ ",\n\tbirthYear=" + birthYear+",\n\tAge="+calculateAge() +"\n]";
		
	}

}
