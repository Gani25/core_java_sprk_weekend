package com.sprk.day4.inheritance.main;

import com.sprk.day4.inheritance.derived.CricketPlayer;

public class CricketMain {
	public static void main(String[] args) {
		CricketPlayer virat = new CricketPlayer("Virat Kohli", 1987, "India");
		
		virat.addScores();
		
		CricketPlayer david = new CricketPlayer("David Warner",1983,"Australia");
		david.addScores();
		System.out.println(virat);
		System.out.println(david);
	}

}
