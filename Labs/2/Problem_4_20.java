//Scanner Import 
import java.util.Scanner;

//Class
public class Problem_4_20 {
  //Main Method 
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    //User Input 
    System.out.print("Enter a String: ");
    //String 
    String a = input.next();
    
    //close scanner
    input.close();
    
    //Displays sting 
    System.out.println("String: " + a);
    //Displays length  
    System.out.println("Length: " + a.length());
    //Displays the first character 
    System.out.println("The first character is: " + a.charAt(0));
  }

}
