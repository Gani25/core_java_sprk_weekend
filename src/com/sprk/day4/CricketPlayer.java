package com.sprk.day4;

import java.util.Arrays;
import java.util.Scanner;

public class CricketPlayer {

	private String name;

	private int birthYear;

	private double[] scores;

	public CricketPlayer() {
		System.out.println("Empty Player Created");
		scores = new double[5];
	}
	
	public CricketPlayer(String name, int birthYear) {
		System.out.println("Playe object created ");
		this.name = name;
		this.birthYear = birthYear;
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
	
	private int calculateAge() {
		return 2025 - birthYear;
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
		return "CricketPlayer [\nname=" + name + ",\nbirthYear=" + birthYear+",\nAge="+calculateAge() + ",\nscores=" + Arrays.toString(scores) +",\nAverage Score="+ calculateAverage()+"\n]";
		
	}
	
	

}
