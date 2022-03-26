package com.skilldistillery.foodtruck.entities;

import java.util.Random;

public class FoodTruck {

	private static int nextTruckId;
	private String truckName;
	private String foodType;
	private double rating;

	public String toString() {
		return "FoodTruck [truckName = " + truckName + ", foodType = " + foodType + ", rating = " + rating + "]";
	}
	public FoodTruck() {
		
	}

	public FoodTruck(String truckName, String foodType, double rating, int nextTruckId) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		Random truckId = new Random();
		int maxNumber = 1000;
		int nextTruckID = truckId.nextInt(maxNumber) +1;
		FoodTruck.nextTruckId = nextTruckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
