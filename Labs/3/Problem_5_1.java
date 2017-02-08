import java.util.Scanner;

//Class
public class Problem_5_1 {
  //Main Method 
  public static void main(String[] args) {
    //Scanner 
    Scanner input = new Scanner(System.in);
    
    //Count the Number of Positives in the string 
    int positive = 0;
    //Count the Number of Negatives in the string 
    int negative = 0;
    //Count how many numbers overall in the sting 
    int count = 0;
    //Find the sum of all the numbers 
    double sum = 0;
    
    //User input 
    System.out.print("Enter an integer, the input ends if it is 0: ");
    int number = input.nextInt();
    

    //If, else statement to test for sentinel value  
    if  (number == 0) {
      System.out.println("No Numbers are entered except 0");
      System.exit(1);
      
    }
    
    //If, else statement to evaluate if number is positive or negative   
    while (number != 0) { 
      if (number > 0) {
        //If positive, adds one to the positives 
        positive++;
      } else { 
        //If negative, adds one to the negatives 
        negative++;
      }
      
        //Find the total  
        sum += number;
        
        //Increase the count 
        count++; 
      
        number = input.nextInt();
      }
    
      //Calculate the overall average 
      double average = sum / count ; 
    
      //Display Results 
      System.out.println("The number of positives is " + positive);
      System.out.println("The number of negatives is " + negative);
      System.out.println("The total is " + count);
      System.out.println("The average is " + average);

    }
  }

