package Assignment_Inheritance;

public class VehicleHierarchy {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.stop();
		Vehicle bike  = new Bike();
		bike.start();
		bike.stop();
		Vehicle car  = new Car();
		car.start();
		car.stop();
	}
}

class Vehicle {
	 int topSpeed = 50;
	public void start() {
		System.out.println("Vehicle Started...");
	}

	public void stop() {
		System.out.println("Vehicle Stoped...");
	}
}

class Bike extends Vehicle {
	 int topSpeed = 150;
	public void start() {
		System.out.println("Bike Started...");
		System.out.println("Bike TopSpeed is: "+topSpeed);
	}

	public void stop() {
		System.out.println("Bike Stoped...");
	}
}

class Car extends Vehicle {
	int topSpeed = 250;
	public void start() {
		System.out.println("Car Started...");
		System.out.println("Car TopSpeed is: "+topSpeed);
	}

	public void stop() {
		System.out.println("Car Stoped...");
	}
}