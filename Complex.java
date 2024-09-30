/*Print the sum, difference and product of two complex numbers by 
creating a class, named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.
Use Constructors to initialize the data members.@GRS*/
package Assignment_30;

import java.util.Scanner;

public class Complex {

	private double real, imag;

	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public Complex add(Complex other) {
		return new Complex(real + other.real, imag + other.imag);
	}

	public Complex subtract(Complex other) {
		return new Complex(real - other.real, imag - other.imag);
	}

	public Complex multiply(Complex other) {
		return new Complex(real * other.real - imag * other.imag, real * other.imag + imag * other.real);
	}

	public String toString() {
		return real + " + " + imag + "i";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter real part of first complex number: ");
		double real1 = in.nextDouble();
		System.out.println("Enter imaginary part of first complex number: ");
		double imag1 = in.nextDouble();

		System.out.println("Enter real part of second complex number: ");
		double real2 = in.nextDouble();
		System.out.println("Enter imaginary part of second complex number: ");
		double imag2 = in.nextDouble();

		Complex complex = new Complex(real1, imag1);
		Complex complex1 = new Complex(real2, imag2);

		System.out.println("Sum: " + complex.add(complex1));
		System.out.println("Difference: " + complex.subtract(complex1));
		System.out.println("Product: " + complex.multiply(complex1));
	}
}
