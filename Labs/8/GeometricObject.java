
public class GeometricObject {
  //Data field 
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated; 
  
  //Constructor 
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }
  
  //Geometric object with specific color 
  public GeometricObject(String color, boolean filled) {
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
  public String toString(){
    return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
  }
}
