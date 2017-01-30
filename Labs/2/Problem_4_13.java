//Scanner Import 
import java.util.Scanner;

//Class
public class Problem_4_13 {
  //Main Method 
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    //User Input 
    System.out.print("Enter a letter: ");
    //String 
    String vowelString = input.nextLine();
    
    //Check if there is only one letter
    if (vowelString.length() !=1) {
      System.out.println("You must enter only one letter.");
      System.exit(1);
    }
    
    //Checks to see if it is a letter 
    char ch = Character.toUpperCase(vowelString.charAt(0));
    if (ch < 'A' || ch > 'Z') {
    //Output Statement 
    System.out.println(vowelString + " is an invalid input.");
    System.exit(1);
    }
    //Check to see if letter is a vowel
    if (ch == 'A' || ch =='E' || ch =='I' || ch == 'O' || ch == 'U') {
      //Output Statement 
      System.out.println(vowelString + " is a vowel.");
      System.exit(1);  
    } else {
      //If not vowel, it is a consonant 
      System.out.println(vowelString + " is a consonant.");
      }
 

  }

}
