package com.logic;

public class Circle extends Shape {
	
	private int radius;
	final float pi = 3.14f;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return pi*(radius * radius);
	}

}
