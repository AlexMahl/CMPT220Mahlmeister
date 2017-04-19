
public class Circle extends GeometricObject2 {
  //Field 
  private double radius;

  /**Default constructor*/
  public Circle() {
  }

  /**Construct circle with a specified radius*/
  public Circle(double radius) {
    this.radius = radius;
  }

  /**Construct a circle with specified radius, filled, and color*/
  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  /**Return radius*/
  public double getRadius() {
    return radius;
  }

  /**Set a new radius*/
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**Implement the getArea method defined in GeometricObject*/
  public double getArea() {
    return radius*radius*Math.PI;
  }
 

  /**Implement the getPerimeter method defined in GeometricObject*/
  public double getPerimeter() {
    return 2*radius*Math.PI;
  }
  
  //Get diameter
  public double getDiameter() {
    return radius * 2; 
  }

  /**Override the equals() method defined in the Object class*/
  public boolean equals(Circle circle) {
    return this.radius == circle.getRadius();
  }
  //String 
  @Override
  public String toString() {
    return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() + "\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();

  }
}

