package org.test.example2;

import java.util.ArrayList;

public class TestMain  {
	
	 public static void main(String[] args) {   // Program entry point
	      // Declare and Construct an instance of the Circle class called c1
	      Circle c1 = new Circle(1, "blue");  // Use 3rd constructor
	      Circle c2 = new Circle(2, "red");
	      Rectangle rect = new Rectangle(2,4, "green");
	      java.util.List<Figure> figures = new ArrayList<Figure>();
	      figures.add(c1);
	      figures.add(c2);
	      figures.add(rect);
	      for (Figure figure : figures) {
	    	  System.out.printf("The area is: %.2f%n", figure.getArea());
	    	  System.out.println("Color is " + figure.getColor());
	      }
	 
	   }

}
