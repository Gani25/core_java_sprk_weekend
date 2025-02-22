package com.sprk.day4;

public class FootballMain {
	
	public static void main(String[] args) {
		FootballPlayer sunil = new FootballPlayer("Sunil Chetri",1985);
		
		sunil.addGoals();
		
		FootballPlayer messi = new FootballPlayer("Lionel Messi", 1981);
		messi.addGoals();
		
		System.out.println(sunil);
		System.out.println(messi);
		
	}

}
