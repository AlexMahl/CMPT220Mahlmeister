
public abstract class GeometricObject2 implements Comparable<GeometricObject2> {
  //Data field 
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated; 
  
  //Constructor 
  protected GeometricObject2() {
    dateCreated = new java.util.Date();
  }
  
  //Geometric object with specific color 
  protected GeometricObject2(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }
  
  //Return color 
  public String getColor() {
    return color;
  }
  
  //Set new color 
  public void setColor(String color){
    this.color=color;
  }
  
  //Return isFilled 
  public boolean isFilled(){
    return filled;
  }
  
  //Set new filled 
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  //get dateCreated
  public java.util.Date getDateCreated(){
    return dateCreated;
  }
  
  //Return string 
  @Override
  public String toString(){
    return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
  }
  
  //toCompare method 
  public int compareTo(GeometricObject2 o) {
    if (this.getArea() > o.getArea())
      return 1;
    else if (this.getArea() < o.getArea())
      return -1;
    else
      return 0;
    
  }
  
  //Abstract max method 
  public static GeometricObject2 max (GeometricObject2 o1, GeometricObject2 o2) {
    if (o1.compareTo(o2) == 1)
      return o1;
    else 
      return o2;
  }
  
  //Abstract method getArea
  public abstract double getArea();
  
  //Abstract method getArea
  public abstract double getPerimeter();
  }

