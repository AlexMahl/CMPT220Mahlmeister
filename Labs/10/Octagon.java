
public class Octagon extends GeometricObject implements Comparable, Cloneable {

  //Data field 
  private double side; 
  
  //Create Octagon 
  public Octagon() {
    
  }
  
  //Construct Ocatgon with set sides 
  public Octagon (double side) {
    this.side = side;
  }
  
  //Returns sides
  public void setSide(double side) {
    this.side = side; 
  }
  
  //Return side
  public double getSide() {
    return side;
  }
  //getArea
  @Override
  public double getArea() {
    return (2 + 4/ Math.sqrt(2) * side * side);
  }
  
  //getPerimeter
  @Override
  public double getPerimeter() {
    return 8 * side;
    

  }
  //CompareTo 
  @Override
  public int compareTo(Object o) {
    if (getArea() > ((Octagon) o).getArea())
      return 1;
      else if (getArea() < ((Octagon) o).getArea())
        return -1;
      else 
        return 0;
  }
  //toString 
  @Override
  public String toString() {
    return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
  }

  //Clone 
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
  
}
