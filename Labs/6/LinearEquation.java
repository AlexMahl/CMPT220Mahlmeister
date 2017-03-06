
public class LinearEquation {
  //Data field 
  private double a; 
  private double b;
  private double c;
  private double d;
  private double e;
  private double f; 
  
  //Constructor 
  LinearEquation(double a, double b, double c, double d, double e, double f) {
  this.a = a;
  this.b = b;
  this.c = c;
  this.d = d;
  this.e = e;
  this.f = f;
  }
  
  //returns a
  public double getA(){
    return a;
  }
  
  //returns b
  public double getB(){
    return b;
  }
  
  //returns c
  public double getC(){
    return c;
  }
  
  //returns d
  public double getD(){
    return d;
  }
  
  //returns e
  public double getE(){
    return e;
  }
  
  //returns f
  public double getF(){
    return f;
  }
  
  //sets isSolveable boolean 
  public boolean isSolvable() {
    return (a*d - b*c != 0); 
  }  
  //sets getX value 
  public double getX() {
    return (e * d - b * f) / (a * d - b * c);
  }
  //sets getY value 
  public double getY() {
    return (a * f - e * c) / (a * d - b * c);
  } 
}
