package com.sprk.day4.inheritance.derived;

import java.util.Arrays;
import java.util.Scanner;

import com.sprk.day4.inheritance.base.Player;

public class CricketPlayer extends Player{


	private double[] scores;

	public CricketPlayer() {
		System.out.println("Default constructor of CricketPlayer is called");
		
	}
	
	public CricketPlayer(String name, int birthYear, String team) {
		
		// calling base class constructor from derived class constructor
		super(name,birthYear,team);
		System.out.println("Paramterized constructor of CricketPlayer is called");
		scores = new double[5];
	}
	
	// Take input in scores
	public void addScores() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+scores.length+" scores for "+name+": ");
		for(int i = 0; i<scores.length;i++)
		{
			scores[i] = sc.nextDouble();
		}
	}
	
	
	private double calculateAverage() {
		double sum = 0,avg;
		
		// Enhance For Loop / ForEach Loop
		for(double singleScore : scores) {
			sum = sum+singleScore;
		}
		avg = sum / scores.length;
				
		return avg;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCricketPlayer [\n\tscores=" + Arrays.toString(scores) +",\n\tAverage Score="+ calculateAverage()+"\n]";
		
	}

}
