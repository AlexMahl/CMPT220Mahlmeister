
public abstract class GeometricObject4  {
  //Data field 
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated; 
  
  //Constructor 
  protected GeometricObject4() {
    dateCreated = new java.util.Date();
  }
  
  //Geometric object with specific color 
  protected GeometricObject4(String color, boolean filled) {
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
  
  //Abstract method getArea
  public abstract double getArea();
  
  //Abstract method getArea
  public abstract double getPerimeter();

  //compareTo
  public int compareTo(Circle1 circle1, Circle1 circle2) {
    if (circle1.compareTo(circle2) == 0)
      return 0; 
    else  
     return 1;
    
  }
  }

