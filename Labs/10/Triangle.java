//Subclass and Supperclass 
public class Triangle extends GeometricObject {
  //Data field 
  private double side1;
  private double side2; 
  private double side3;
  
  //construct triangle with specific sides 
  public Triangle(){
    
  }
  //construct triangle with specific sides with IllegalTriangleEception
  public Triangle(double side1, double side2, double side3) throws IllegalTriangleEception {
    if(side1 >= side2 + side3 || side2 >= side3 + side1 || side3 >= side2 + side1){
      throw new IllegalTriangleEception (side1, side2, side3);
    }
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  //Return sides 
  public Triangle(double side1, double side2, double side3, String color, boolean filled)throws IllegalTriangleEception {
    if(side1 >= side2 + side3 || side2 >= side3 + side1 || side3 >= side2 + side1){
      throw new IllegalTriangleEception (side1, side2, side3);
    } {
    this.side1 = side1;
    this.side2 = side2;
    this.side3= side3;
    setColor(color);
    setFilled(filled);
    }
  } 
  //Return Area 
  @Override
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }
  
  @Override
  //Return Perimeter 
  public double getPerimeter(){
    return side1 + side2 + side3;
  }
  
  //Return string 
  @Override
  public String toString() {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; 
  }
}
