package com.flm;

public abstract class GeometricShape {
	
	public void calculate() {
		System.out.println("----Geometric Calculations----");
	}
	
	abstract void calculateArea();
	abstract void calculatePerimeter();

}
