
import java.util.Scanner;
//Class
public class Problem_7_10 {
  //Main Method 
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    //Caps array at 10
    double[] numbers = new double [10];
    //User input of 10 numbers
    System.out.print("Enter 10 integers: ");
    for (int i=0; i < numbers.length; i++ )
      numbers [i] = input.nextDouble();
    //Displays Results 
    System.out.println("The smallest value is " + numbers[indexOfSmallestElement(numbers)] + ". ");
  }
    //Sets method to anything greater than or equal to 1
    private static int indexOfSmallestElement(double[] array) {
    if (array.length <= 1)
    return 0;
    //Finds the smallest integer in the index
    double minimum = array[0];
    int minimumIndex = 0;
    for (int i= 1; i < array.length; i++) {
      if (array[i] < minimum){ // JA: Here you need to compare to array[minimum], not minimum
        minimum = array[i];
        minimumIndex = i;
      }
    }
    return minimumIndex;
    
  }

}
