//Scanner Import 
import java.util.Scanner;

//Class 
public class Problem_3_2 {
  //Main Method 
  public static void main(String[] args) {
    //Generates Number 1
    int number1 = (int)(System.currentTimeMillis() % 10);
    //Generates Number 2
    int number2 = (int)(System.currentTimeMillis() / 7 % 10);
    //Generates Number 3
    int number3 = (int)(System.currentTimeMillis() * 7 % 10);
    
    //Scanner
    Scanner input = new Scanner(System.in);
    
    //User Input  
    System.out.print(
      "What is " + number1 + " + " + number2 + " + " + number3 + "? ");
    
    //Input 
    int answer = input.nextInt();
    
    //Answer output 
    System.out.println(
      number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
    
	}
}
