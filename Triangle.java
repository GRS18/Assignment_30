/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
 by creating a class named 'Triangle' with parameter in its constructor.@GRS*/
package Assignment_30;

public class Triangle {

	private double sone;
	private double stwo;
	private double sthree;
	private double p;
	private double s;
	private double ar;

	public Triangle(double sone, double stwo, double sthree) {
		this.sone = sone;
		this.stwo = stwo;
		this.sthree = sthree;
	}

	public void perimeter() {
		p = sone + stwo + sthree;
	}

	public void area() {
		s = (sone + stwo + sthree) / 2;

		ar = s * (s - sone) * (s - stwo) * (s - sthree);

		ar = Math.sqrt(ar);

	}

	public void show() {
		System.out.println("Sides of Triangle is : " + sone + " " + stwo + " " + sthree);
		System.out.println("Perimeter of Triangle is : " + p);
		System.out.println("Area of Triangle : " + ar);
	}

	public static void main(String[] args) {

		Triangle triangle = new Triangle(3, 4, 5);
		triangle.perimeter();
		triangle.area();
		triangle.show();

	}

}
