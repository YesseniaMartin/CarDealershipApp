package com.skilldistillery.dealership.entities;

import com.skilldistillery.dealership.app.CarLotTester;

public class CarLot extends CarLotTester {
	private Car[] cars;
	private int count;

	public CarLot() {
		super();
		cars = new Car[10];
		count = 0;
	}

	public void addCar(Car car) {
		int count = 0;
		if (count < cars.length) {
			cars[count] = car;
			count++;
		} else {
			System.out.println("Cannot add more than 10 cars.");
		}
	}

	public Car[] getListOfCarsInInventory() {
		Car[] inInventory = new Car[count];
		Car car1 = new Car("Toyota", "Camry", "Blue", 20000.0);
		car1.displayCar();
		Car car2 = new Car("Nissan", "Altima", "Black", 23000.0);
		car2.displayCar();
		return inInventory;
	}

	public Car[] getListOfCarsInInventoryInCarLot2() {
		Car[] inInventory = new Car[count];
		Car car1 = new Car("Nissan", "Altima", "Black", 26000.0);
		car1.displayCar();
		Car car2 = new Car("Toyota", "Camry", "Blue", 24000.0);
		car2.displayCar();
		Car car3 = new Car("Nissan", "Altima", "Black", 25000.0);
		car3.displayCar();
		return inInventory;
	}

	private int findSpecificModelCarInLot(String desiredMake, String desiredModel) {

		for (int i = 0; i < cars.length; i++) {
			Car car = cars[i];
			if (car.getMake().equalsIgnoreCase(desiredMake) && car.getModel().equalsIgnoreCase(desiredModel)) {
				return i;
			}
		}

		return -1;

	}

	public Car purchaseCar(String desiredMake, String desiredModel) {
		int i = findSpecificModelCarInLot(desiredMake, desiredModel);
		if (i != -1) {
			Car purchasedCar = cars[i];
			for (int j = i; j < count - 1; j++) {
				cars[j] = cars[j + 1];
			}
			cars[count - 1] = null;
			count--;
			return purchasedCar;
		}
		return null;

	}

}
