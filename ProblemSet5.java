package edu.monmouth;

import edu.monmouth.*;

public class ProblemSet5 {

	public static void main(String[] args) {
		// validate invalid values are set to zero
		try {
		Rectangle invalidRectangle = new Rectangle(-9, -8);
		System.out.println("invalidRectangle length: " + invalidRectangle.getLength() + 
				" width: " + invalidRectangle.getWidth());
		} catch(ShapeException e) {
			System.out.println("Your length or width is less than 0");
		}
		try {
		Circle invalidCircle = new Circle(-7);
		System.out.println("invalidCircle radius: " + invalidCircle.getRadius());
		} catch(ShapeException e) {
			System.out.println("Your radius is less than 0");
			
		}
		// create valid Rectangles and Circles
		try {
		Rectangle smallRectangle = new Rectangle(3, 4);
		Rectangle largeRectangle = new Rectangle(300, 400);
		
		Circle smallCircle = new Circle(5);
		Circle largeCircle = new Circle(50);
		
		// declare a reference to a Shape that refers to a concrete class
		Shape rectangle = new Rectangle(8, 12);
		Shape circle = new Circle(10);
		
		// invoke the toString() method
		System.out.println(smallRectangle);
		System.out.println(largeRectangle);
		System.out.println(smallCircle);
		System.out.println(largeCircle);
		System.out.println(rectangle);
		System.out.println(circle);
		
		// pass Rectangle & Circle references to printArea()
		printArea(smallRectangle);
		printArea(largeRectangle);
		printArea(smallCircle);
		printArea(largeCircle);
		printArea(rectangle);
		printArea(circle);
	}
		catch(ShapeException e) {
			System.out.println("");}
		}
	
	static void printArea(Shape shape) {
		System.out.println(shape.area());
	}

}
