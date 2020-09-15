package com.main;

import java.util.Scanner;

import com.logic.Circle;
import com.logic.Rectangle;
import com.logic.Square;

public class Main {

	public static void main(String[] args) {
		
		String shape;
		Scanner input = new Scanner(System.in);
		System.out.println("Circle\nSquare\nRectangle");
		System.out.println("Enter the shape name ");
		shape = input.next();
		switch(shape) {
		case "circle":
			int radius;
			System.out.println("Enter the radius ");
			radius = input.nextInt();
			Circle circle = new Circle(shape,radius);
			System.out.printf("Area of Circle is %.2f",circle.calculateArea());
			break;
		case "square":
			int side;
			System.out.println("Enter the side of the square ");
			side = input.nextInt();
			Square square = new Square(shape,side);
			System.out.printf("Area of Square is %.2f"+square.calculateArea());
			break;
		case "rectangle":
			int length;
			int breadth;
			System.out.println("Enter the length of rectangle ");
			length = input.nextInt();
			System.out.println("Enter the breadth of rectangle ");
			breadth = input.nextInt();
			Rectangle rectangle = new Rectangle(shape, length, breadth);
			System.out.printf("Area of Rectangle is %.2f"+rectangle.calculateArea());
			break;
		default:
			System.out.println("please choose the right shape");
			
		}

	}

}
