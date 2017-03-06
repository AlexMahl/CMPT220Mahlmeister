
public class Rectangle {
  
  //Establish width of rectangle 
  private double width; 
  //Establish height of rectangle 
  private double height;
  
  //No arg constructor 
  public Rectangle() {
    width = 1;
    height = 1;
  }
  
  //Creates a rectangle with custom height and width 
  public Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;  
  }
  //Set getWidth 
  public double getWidth() { 
     return width;
  }
  //Set getHeight 
  public double getHeight() {
    return height;
  }
  //Set getArea
  public double getArea() { 
    return width * height;
  }
  //Set getPerimeter 
  public double getPerimeter() { 
    return ((width + height) * 2);
  }
}
