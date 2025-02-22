package com.sprk.day4;

public class CricketPlayerMain {
	
	public static void main(String[] args) {
		CricketPlayer virat = new CricketPlayer("Virat Kohli", 1987);
		virat.addScores();
		
		CricketPlayer david = new CricketPlayer("David Warner", 1984);
		david.addScores();
		
		System.out.println(virat);
		System.out.println(david);
	}

}
