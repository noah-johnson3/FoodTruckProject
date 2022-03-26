package com.skilldistillery.foodtruck.entities;

import java.util.Random;

public class FoodTruck {

	private static int nextTruckId = 100;
	private int Id;
	private String truckName;
	private String foodType;
	private double rating;

	
	public FoodTruck() {
		
	}

	public FoodTruck(String truckName, String foodType, double rating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.Id = nextTruckId;
		nextTruckId++;
	}
	
	
	public int getId() {
		return Id;
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
	
	public String toString() {
		return "FoodTruck [truckName = " + truckName + ", foodType = " + foodType + ", rating = " + rating
				+ " truck ID = " + Id + "]";
	}

}
