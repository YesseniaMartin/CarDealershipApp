package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entities.Car;
import com.skilldistillery.dealership.entities.CarLot;

public class CarLotTester {

	public static void main(String[] args) {
		Car car = new Car();
		car.toString();
		
		CarLot carLot = new CarLot();
		System.out.println("Cars in the Car Lot: ");
		carLot.getListOfCarsInInventory();
		}
	}
