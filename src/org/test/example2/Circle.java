package org.test.example2;

/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle extends Figure {    // Save as "Circle.java"
   // Private instance variables
   private double radius;
  
   public Circle(double r, String c) {
      super(c);
      radius = r;
      setColor(c);
   }

   public double getArea() {
      return radius * radius * Math.PI;
   }
}
