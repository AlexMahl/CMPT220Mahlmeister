import java.util.Scanner;
//Class
public class Problem_2_5 {
  //Main Method
  public static void main (String [] args) {
	//Scanner 
    Scanner input = new Scanner(System.in);
    //Output statement
    System.out.println("Enter the Subtotal and a gratuity rate: ");
    //subtotal input
    double subtotal = input.nextDouble();
    //gratuity input 
    double gratuityRate = input.nextDouble();
    //gratuity rate
    double gratuity = gratuityRate/10;
    //Bill total 
    double total = subtotal + gratuity; 
    //Output statement
    System.out.println ("The gratuity is $" + gratuity + " and the total is $" + total);
  }
}
