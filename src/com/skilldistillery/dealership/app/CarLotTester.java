package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entities.Car;
import com.skilldistillery.dealership.entities.CarLot;

public class CarLotTester {

	public static void main(String[] args) {
		Car car = new Car();
		car.toString();

		System.out.println("Hello, Welcome to The Car Lot Tester!");
		CarLot carLot = new CarLot();
		System.out.println("CARS IN THE CAR LOT: ");
		carLot.getListOfCarsInInventory();

		CarLot carLot2 = new CarLot();
		System.out.println("CARS IN CAR LOT 2: ");
		carLot2.getListOfCarsInInventoryInCarLot2();
	}

	public static void testPurchaseCar() {
		CarLot carLot = new CarLot();
		Car soldCar = carLot.purchaseCar("Toyota", "Camry");
		if (soldCar != null) {
			System.out.println("Congratulations! You purchased: " + soldCar.getMake() + " " + soldCar.getModel());
		} else {
			System.out.println("Sorry, the requested car is not available.");
		}
		soldCar = carLot.purchaseCar("Toyota", "Camry");
		if (soldCar == null) {
			System.out.println("The car is no longer available.");

		}
	}
}
