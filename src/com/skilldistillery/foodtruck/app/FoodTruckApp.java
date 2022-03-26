package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private boolean keepGoing = true;

	public static void main(String[] args) {

		// array of 5 food trucks
		// scanner for name, food type, etc
		// display trucks ID
		
	

//	public FoodTruck input() {

		Scanner kb = new Scanner(System.in);
		FoodTruck[] foodTrucks = new FoodTruck[4];
		
		System.out.println("What is the name of the food truck?");
		String nameOfTruck = kb.nextLine();
		System.out.println("What type of food does " + nameOfTruck + " serve?");
		String foodType = kb.nextLine();
		System.out.println("on a scale of 1-10 how good was the food?");
		double truckRating = kb.nextDouble();
		kb.nextLine();

		foodTrucks[0] = new FoodTruck(nameOfTruck, foodType, truckRating, foodTrucks[0].getNextTruckId());
		System.out.println(foodTrucks[0]);
	}

}

//FoodTruck[] foodTrucks = new FoodTruck[4];
//
//FoodTruckApp app = new FoodTruckApp();
//
//for (int i = 0; i < foodTrucks.length; i++) {
//	
//	foodTrucks[i] = app.input(	foodTrucks[i], app	);

//		Scanner userInput = new Scanner(System.in);
//
//		System.out.println("What is the name of the food truck?");
//		String nameOfTruck = userInput.nextLine();
//
//		if (nameOfTruck.equals("quit")) {
//			keepGoing = false;
//			return null;
//		}
//
//		if (keepGoing) {
//			truckVariable.setTruckName(nameOfTruck);
//
//			System.out.println("What type of food does " + nameOfTruck + " serve?");
//			String foodOfTruck = userInput.nextLine();
//			truckVariable.setFoodType(foodOfTruck);
//
//			System.out.println("What rating would you give " + nameOfTruck + " on a scale of 1-10?"
//					+ "\n 1 Being eating out of a garbage can,"
//					+ "\n 10 being Gordon Ramsey would not curse at the person who made it.");
//
//			double ratingOfTruck = userInput.nextDouble();
//			userInput.nextLine();
//			truckVariable.setRating(ratingOfTruck);
//
//		}
//		System.out.println("The name of the first Food Truck is: " + nameOfTruck);
//
//		return truckVariable;