import java.util.Scanner;

//Class
public class Problem_5_16 {
  
  //Main Method 
  public static void main(String[] args) {
    
    //Scanner 
    Scanner input = new Scanner(System.in);
    
    //User Input 
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    int factor = number;
    
    //String 
    String divisor = " ";
    
    //Find smallest divisors, start with 2 because that is smallest possible divisor
    for (int x = 2; x <= factor; x++) {
      while(factor % x == 0) {
        divisor += x + (", ");
        factor = factor / x;  
      }
    }
    //Display Results 
    System.out.println("The smallest factors of " + number + " are:" + divisor);
   
  }
}
  


