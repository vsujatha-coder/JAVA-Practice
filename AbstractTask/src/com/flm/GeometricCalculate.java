package com.flm;

import java.util.Scanner;

public class GeometricCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		circle.calculate();
		System.out.println("Enter Input for Geometric calculation : \n"
				+ "1.Calculate Area of Circle \n"
				+ "2.Calculate Perimeter of Circle \n"
				+ "3.Calculate Area of Rectangle \n"
				+ "4.Calculate Perimeter of Rectangle");
		
		int input = sc.nextInt();
		
		switch(input) {
		case 1: System.out.println("Enter radius of Circle : ");
			    circle.radius=sc.nextInt();
			    circle.calculateArea();
			    break;
		case 2: System.out.println("Enter radius of Circle : ");
			    circle.radius=sc.nextInt();
			    circle.calculatePerimeter();
			    break;
		case 3: System.out.println("Enter length of Rectangle : ");
				rectangle.length=sc.nextInt();
				System.out.println("Enter width of Rectangle : ");
				rectangle.width=sc.nextInt();
				rectangle.calculateArea();
				break;
		case 4: System.out.println("Enter length of Rectangle : ");
				rectangle.length=sc.nextInt();
				System.out.println("Enter width of Rectangle : ");
				rectangle.width=sc.nextInt();
				rectangle.calculatePerimeter();
				break;
			
		}
		
		sc.close();
	}
	
	

}
