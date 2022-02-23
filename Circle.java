// Program Name: Circle.java
/* Description: 16.4 Program It: Circle Class */
// Programmer: 
// Date: 1/16/2021
/**
 * 
 */

public class Circle
{
  // Define the circle class with two constructors

  // Instance variables should always be declared private. Instance variables
  // should never be accessed directly from another file.
  private double radius;

  // Construct a circle with radius 1
  public Circle()
  {
    radius = 1;
  }

  // Construct a circle with a specified radius
  public Circle(double newRadius)
  {
    radius = newRadius;
  }

  // Return the area of this circle
  public double getArea()
  {
    return radius * radius * Math.PI;
  }

  // Return the perimeter of this circle
  public double getPerimeter()
  {
    return 2 * radius * Math.PI;
  }

  // Set a new radius for this circle
  public void setRadius(double newRadius)
  {
    radius = newRadius;
  }

  public double getDiameter()
  {
    return radius * 2;
  }

  public double getRadius()
  {
    return radius;
  }
}
