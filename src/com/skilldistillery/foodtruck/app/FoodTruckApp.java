package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		// array of 5 food trucks
		// scanner for name, food type, etc
		// display trucks ID
		Scanner userInput = new Scanner(System.in);
		FoodTruck[] foodTrucksArray = new FoodTruck[5];
		FoodTruckApp applicationToRun = new FoodTruckApp();

		applicationToRun.run(userInput, foodTrucksArray, applicationToRun);

	}

	public void run(Scanner kb, FoodTruck[] foodTrucks, FoodTruckApp app) {
		makeTrucks(kb, foodTrucks, app);
		makeMenu(kb, foodTrucks, app);
	}

	public void makeTrucks(Scanner kb, FoodTruck[] foodTrucks, FoodTruckApp app) {

		for (int index = 0; index < foodTrucks.length; index++) {

			System.out.println("What is the name of the food truck?");
			String nameOfTruck = kb.nextLine();

			if (nameOfTruck.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("What type of food does " + nameOfTruck + " serve?");
			String foodType = kb.nextLine();
			System.out.println("on a scale of 1-10 how good was the food?");
			double truckRating = kb.nextDouble();
			kb.nextLine();

			foodTrucks[index] = new FoodTruck(nameOfTruck, foodType, truckRating);

			System.out.println(foodTrucks[index]);
		}
	}

	private void greetings() {
		System.out.println("Hello user please select one of the following options");

	}
	// TO DO: menu outside of for loop
	// running the program
	// greeting method
	// making the trucks(basically the code above)
	// method after exiting ( menu method )
	// goodbye method

	public void makeMenu(Scanner userInput, FoodTruck[] foodTrucks, FoodTruckApp app) {
		System.out.println("Please select an option in the menu");
		System.out.println("1. Name of Food Trucks");
		System.out.println("2. Average Rating of all Food Trucks");
		System.out.println("3. Best rated Food Truck info");
		int choice = userInput.nextInt();
		userInput.nextLine();

		if (choice == 1) {

			for (int index = 0; index < foodTrucks.length; index++) {
				if (foodTrucks[index] == null) {

				} else {

					System.out.println(foodTrucks[index]);

				}
			}
		}
		if (choice == 2) {
			int tempValue = 0;
			int total = 0;

			for (FoodTruck foodTruck : foodTrucks) {
				if (foodTruck != null) {
					tempValue++;
					total += (int) foodTruck.getRating();

				}

			}
			double average = total / tempValue;
			System.out.println("the average rating of all food trucks is : " + average);
		}
		
		if(choice == 3) {
			
			double highestRating = 0;
			double currentRating = 0;
			
			FoodTruck bestTruck = new FoodTruck();
			
			for (FoodTruck foodTruck : foodTrucks) {
				
				if(foodTruck != null) {
					
					currentRating = foodTruck.getRating();
					
					if(currentRating > highestRating) {
						
					highestRating = currentRating;
					bestTruck = foodTruck;
					
					}
					
				}
				
				
			}
			System.out.println("the highest rated Food Truck is : " + bestTruck.toString() );
		}
	}
}