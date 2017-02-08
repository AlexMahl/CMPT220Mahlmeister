import java.util.Scanner;

//Class
public class Problem_6_3 {
  
    //Main Method 
    public static void main(String[] args) {
    
    //Scanner 
    Scanner input = new Scanner(System.in);
    
    //User Input 
    System.out.print("Enter an integer to see if is a palindrome: ");
    int n = input.nextInt();
    
    
    //Display Results 
    if (isPalindrome(n)) {
      System.out.println(n + " is a palindrome");
    } else {
      System.out.println(n + " is not a palindrome");
    }
}
    
    //Return the reversal of an integer, i.e., reverse(456) returns (654)
    public static int reverse (int number) {
      int num;
      int reverse = 0;
      while( number !=0 ) {
        
        num = number % 10;
        reverse = reverse * 10 + num;
        number = number / 10;
        
      }
      
      return reverse;
      
    }
      //Check to see if number is a Palindrome 
      public static boolean isPalindrome(int number) {
      
        return number == reverse(number) ? true : false; 
        
    }

}
