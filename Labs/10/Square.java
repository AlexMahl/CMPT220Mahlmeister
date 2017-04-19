
public class Square extends GeometricObject3 implements Colorable {

  //data field
  private double side; 
  
  //No arg constructor
  public Square() {
    
  }
  
  //howToColor
  public String howToColor() {
    return "Color all four sides.";
  }
  
 
  //Set square 
  public Square(double newSide){
    side = newSide;
  }
  
  //Creates a square with custom height and width 
  public Square(double newSide,String color, boolean filled) {
    side = newSide;
    setColor(color);
    setFilled(filled);
  }
 
  //getSide
  public double getSide() { 
     return side;
  }
  //getArea
  @Override
  public double getArea() {
    return Math.pow(side, 2);
  }
  //getPerimeter
  @Override
  public double getPerimeter() {
    return side * 4;
  
   }
  //Return square string 
  @Override
  public String toString() {
    return super.toString() + "\nSide: " + getSide() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
  
  }

}
