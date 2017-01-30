//Scanner Import 
import java.util.Scanner;

//Class
public class Problem_4_9 {
  //Main Method
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    
    //User Input  
    System.out.print("Enter a character: ");
    
    //Character set
    char character = input.next().charAt(0);
    
    //Output Statement
    System.out.println("The Unicode for the character " + character + " is " + (int) character);

  }
}
