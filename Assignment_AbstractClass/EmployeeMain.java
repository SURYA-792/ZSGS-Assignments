package Assignment_AbstractClass;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id : ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee type : Salaried(s) / Hourly(h)");
		String type = sc.next();
		System.out.println("Total Hours Days or Hours Worked:");
		int workingTime = sc.nextInt();
		
		Employee employee = type.equals("s") ? new SalariedEmployee(id, name, type, id, workingTime)
				: new HourlyEmployee(id, name, type, workingTime);
		employee.calculatePay();
		employee.getEmployeeDetails();
	}
}

abstract class Employee {

	int id;
	String name;
	String type;
	double totalPay;

	Employee(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	abstract double calculatePay();

	void getEmployeeDetails() {
		System.out.println("Employee id = " + id);
		System.out.println("Employee Name = " + name);
		System.out.println("Employer Type = " + type);
		System.out.println("Employee Total Salary:" + totalPay);
	}
}

class HourlyEmployee extends Employee {

	int totalHoursWorked;

	HourlyEmployee(int id, String name, String type, int workingTime) {
		super(id, name, type);
		this.totalHoursWorked = workingTime;
	}

	double calculatePay() {
		super.totalPay = totalHoursWorked * 200;
		return totalPay;
	}
}

class SalariedEmployee extends Employee {
	int totalDaysWorked;

	SalariedEmployee(int id, String name, String type, int totalDaysWorked, int workingTime) {
		super(id, name, type);
		this.totalDaysWorked = workingTime;
	}

	double calculatePay() {
		super.totalPay = totalDaysWorked * 1500;
		return totalPay;
	}
}
