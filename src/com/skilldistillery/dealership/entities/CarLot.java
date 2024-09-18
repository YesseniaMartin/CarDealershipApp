package com.skilldistillery.dealership.entities;

public class CarLot {
	
	private Car [] cars;
	private int count;

	public CarLot() {
		super();
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
	
	public Car [] getListOfCarsInInventory() {
		Car [] inInventory = new Car[count];
		Car car1 = new Car("Toyota", "Camry", "Blue", 25000);
		Car car2 = new Car("Nissan", "Altima", "Black", 23000);
		car1.displayCar();
		car2.displayCar();
		return inInventory;
	}

}