import java.util.Scanner;

public class TestLinearEquation {
  //Main Method
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    
    //User input 
    System.out.print("Enter values for a, b, c, e, and f:");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();
    
    //Create object 
    LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
    
    //Output results 
    if (linearEquation.isSolvable()) {
      System.out.println("X is " + linearEquation.getX());
      System.out.println("Y is " + linearEquation.getY());
    } else 
      System.out.println("The equation has no solution.");
    
  }
}
