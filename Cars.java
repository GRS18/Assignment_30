/*  Write a program that has variables to store Car data like; CarModel, CarName, CarPrice and CarOwner.
The program should include functions to assign user defined values to the above mentioned variable and a
display function to show the values. Write a main that calls these functions.
Now write another runner class that declares three Car objects and displays the data of all three.*/

package Assignment_30;

import java.util.Scanner;

public class Cars {

	private String CarModel;
	private String CarName;
	private String CarOwner;
	Scanner sc = new Scanner(System.in);

	public void AssignValues() {
		System.out.println("Enter the carmodel");
		CarModel = sc.next();
		System.out.println("Enter the carname");
		CarName = sc.next();
		System.out.println("Enter the carowner");
		CarOwner = sc.next();

	}

	public void getValues() {
		System.out.println("Car model: " + CarModel + "\nCar Name: " + CarName + "\nCarOwner: " + CarOwner);
	}

	public static void main(String[] args) {
		Cars cars = new Cars();
		Cars cars1 = new Cars();
		Cars cars2 = new Cars();

		System.out.println("Enter details for car 1");
		cars.AssignValues();
		System.out.println("Enter details for car 2");
		cars1.AssignValues();
		System.out.println("Enter details for car 3");
		cars2.AssignValues();
		System.out.println("===================================");

		cars.getValues();
		System.out.println("===================================");
		cars1.getValues();
		System.out.println("===================================");
		cars2.getValues();

	}
}//@GRS
