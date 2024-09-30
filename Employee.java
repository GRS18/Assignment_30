/* Write a program by creating an 'Employee' class having the following methods and print the final salary.
a.'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
b.'AddSal()' which adds $10 to salary of the employee if it is less than $500.
c.'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
*/
package Assignment_30;

import java.util.Scanner;

public class Employee {

	private int empId;
	private double empSalary;
	private int hrs;

	public void getInfo(int empId, double empSalary, int hrs) {
		this.empId = empId;
		this.empSalary = empSalary;
		this.hrs = hrs;
	}

	public void addSalary() {
		if (empSalary < 500) {
			empSalary = empSalary + 10;
		}
	}

	public void addWork() {
		if (hrs > 6) {
			empSalary = empSalary + 5;
		}
	}

	public void show() {
		System.out.println("Employee id: " + empId);
		System.out.println("Employee Salary: " + empSalary + "$");
		System.out.println("Employee works Hours Per Day: " + hrs + "hr");
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Employee employee = new Employee();

		int empId;
		double empSalary;
		int hrs;

		System.out.println("Enter Employee Id: ");
		empId = in.nextInt();
		System.out.println("Enter Employee Salary(in $): ");
		empSalary = in.nextDouble();
		System.out.println("Enter Employee Work hours per Day: ");
		hrs = in.nextInt();

		employee.getInfo(empId, empSalary, hrs);
		employee.addSalary();
		employee.addWork();
		employee.show();

	}

}
