package com.sprk.day4;

import java.util.Arrays;
import java.util.Scanner;

public class FootballPlayer {

	private String name;

	private int birthYear;

	private int[] goals;

	public FootballPlayer() {
		System.out.println("Empty Player Created");
		goals = new int[5];
	}
	
	public FootballPlayer(String name, int birthYear) {
		System.out.println("Playe object created ");
		this.name = name;
		this.birthYear = birthYear;
		goals = new int[5];
	}
	
	// Take input in scores
	public void addGoals() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+goals.length+" scores for "+name+": ");
		for(int i = 0; i<goals.length;i++)
		{
			goals[i] = sc.nextInt();
		}
	}
	
	private int calculateAge() {
		return 2025 - birthYear;
	}
	
	private double calculateAverage() {
		double sum = 0,avg;
		
		// Enhance For Loop / ForEach Loop
		for(double goal : goals) {
			sum +=goal;
		}
		avg = sum / goals.length;
				
		return avg;
	}

	@Override
	public String toString() {
		return "FootballPlayer [\nname=" + name + ",\nbirthYear=" + birthYear+",\nAge="+calculateAge() + ",\nscores=" + Arrays.toString(goals) +",\nAverage Score="+ calculateAverage()+"\n]";
		
	}
	
	

}
