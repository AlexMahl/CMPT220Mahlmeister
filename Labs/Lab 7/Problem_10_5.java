import java.util.Scanner;

public class Problem_10_5 {
  //Main Method 
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in); 
    
    //User Input 
    System.out.print("Enter a positive integer: ");
    int number = input.nextInt();
    
    //Output display 
    System.out.println("The smallest factors of " + number + " are: ");
    
    //Finds smallest factors
    StackOfIntegers stack = smallestFactors(number); 
    
    //Pop from stack 
    while (!stack.empty())
      System.out.print(stack.pop() + ", ");
    
  }
  
  //Orders the numbers as smallest factors in decreasing orders 
  private static StackOfIntegers smallestFactors(int number){
    
    //Create a stack 
    StackOfIntegers returnStack = new StackOfIntegers();
    
    //Test for Prime Factor 
    int testFactor = 2;
   
    while (number != 1) {
      if (number % testFactor == 0) { 
      returnStack.push(testFactor);
      number = number / testFactor;
    }else{
      if(testFactor == 2){
      testFactor++;
    }else{ 
      testFactor += 2;
       }
      }
    }
    return returnStack;
  }
}