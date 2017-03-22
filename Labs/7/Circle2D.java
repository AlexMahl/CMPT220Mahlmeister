
public class Circle2D {
  //Data field 
  private double x; 
  private double y; 
  private double radius; 
  
  //Create a default Circle2D 
  public Circle2D() { 
    this.x = 0;
    this.y = 0;
    this.radius = 1;
  }
  //Create a circle with specific specifications 
  Circle2D(double x, double y, double radius){
    this.x = x;
    this.y = y; 
    this.radius = radius;
  }
  
  //return x 
  public double getX() {
    return x; 
  }
  //return y
  public double getY() {
    return y;
  }
  //return radius 
  public double getRadius(){
    return radius;
  }
  
  //Return area
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }
  
  //return perimeter 
  public double getPerimeter() { 
    return 2 * Math.PI * radius;
  }
  
  //Return boolean value about points in circle 
  public boolean contains(double x, double y) { 
    return Math.sqrt(Math.pow(x - this.x, 2)) + Math.pow(y - this.y, 2) < radius;
  }
  
  //Return boolean value about circle is in the circle 
  public boolean contains(Circle2D circle) { 
    return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= Math.abs(radius - circle.getRadius());
  }
  
  //Return a boolean value about if the circles overlap
  public boolean overlaps(Circle2D circle) { 
    return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))  <= radius + circle.getRadius();
  }
}
