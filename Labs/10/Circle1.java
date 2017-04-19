

public class Circle1 extends GeometricObject4 implements Comparable<Circle1> {
  //Field 
  private double radius;

  /**Default constructor*/
  public Circle1() {
  }

  /**Construct circle with a specified radius*/
  public Circle1(double radius) {
    this.radius = radius;
  }

  /**Construct a circle with specified radius, filled, and color*/
  public Circle1(double radius, String color, boolean filled) {
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

  //CompareTo 
  @Override
  public int compareTo(Circle1 o) {
   if (this.equals(o)) 
     return 0; 
   else if (this.radius > o.radius)
    return 1;
   else
     return -1;
  
  
  }
  
  //instanceof Boolean 
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Circle1){
      Circle1 circle2 = ((Circle1)obj);
    if (this.radius == circle2.getRadius()) 
      return true; 
    else 
     return false;
    }return false; 
  }

  //Output to string 
  @Override
  public String toString() {
    return super.toString() + "\nRadius: " + radius;
 
  }
}

