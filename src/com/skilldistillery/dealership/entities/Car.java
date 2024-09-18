package com.skilldistillery.dealership.entities;

public class Car {
	private String make;
	private String model;
	private String color;
	private double purchasePrice;

	public Car() {
		super();
	}
	public Car(String make, String model, String color, double purchasePrice) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.purchasePrice = purchasePrice;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}


	public void displayCar() {
		String carData = toString();
		System.out.println(carData);
	}

	public String toString() {
		String output = "make = " + make + ", model = " + model + ", color = " + color + ", purchasePrice = "
				+ purchasePrice;
		return output;
	}
}