package com.flm;

public class Rectangle extends GeometricShape {
	public int length;
	public int width;
	@Override
	void calculateArea() {
		int area = length*width;
		System.out.println("Area of Rectangle is : "+area);
	}
	@Override
	void calculatePerimeter() {
		int perimeter = 2*(length+width);
		System.out.println("Area of Rectangle is : "+perimeter);
	}
	
}