package com.flm;


public class Circle extends GeometricShape {
	public int radius;
	
	 @Override
	public void calculateArea() {
		double area = Math.PI*radius*radius;
		System.out.println("Area of Cicle is : "+area);
	}
	 
	 @Override
	public void calculatePerimeter() {
		double perimeter = Math.PI*2*radius;
		System.out.println("Perimeter of Cicle is : "+perimeter);
	}

}
