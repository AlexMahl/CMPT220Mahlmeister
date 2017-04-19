
public class Rectangle extends GeometricObject2 {
  
  //Establish width of rectangle 
  private double width; 
  //Establish height of rectangle 
  private double height;
  
  //No arg constructor 
  public Rectangle() {
 
  }
  //Set rectangle 
  public Rectangle(double newWidth, double newHeight){
    width = newWidth;
    height = newHeight;
  }
  
  //Creates a rectangle with custom height and width 
  public Rectangle(double newWidth, double newHeight, String color, boolean filled) {
    width = newWidth;
    height = newHeight;  
    setColor(color);
    setFilled(filled);
  }
 
  //getWidth 
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
  //Return rectangle string 
  @Override
  public String toString() {
    return super.toString() + "\nWidth: " + getWidth() + "\nHeight: " + getHeight() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
  }
  }
 
