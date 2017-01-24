import java.util.Scanner;
//Class
public class Problem_2_6 {
  //Main Method
  public static void main (String [] args) {
	//Scanner 
    Scanner input = new Scanner(System.in);
    //Output statement
    System.out.println("Enter a number between 0 and 1000: ");
    //Input 
    double number = input.nextDouble();
    //Extract Digits
    double digit1 = number%10;
    //Remove Extracted Digits
    double removeDigit1 = (int)number/10;
    //Extract Digits
    double digit2 = number%10;
    //Remove Extracted Digits
    double removedigit2 = (int)removeDigit1/10;
    //Remove Digits
    double digit3 = removedigit2%10;
    //Add the digits together 
    double sum = digit1 + digit2 + digit3;
    //Output statement
    System.out.println ("The sum of the digits is " + sum); 
  }
}
