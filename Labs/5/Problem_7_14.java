import java.util.Scanner;

//Class
public class Problem_7_14 {
  //Main Method 
  public static void main(String[] args) {
  //Scanner
    Scanner input = new Scanner(System.in);
    //Caps array at 5
    int[] numbers = new int [5];
    //User input of 5 numbers
    System.out.print("Enter 5 integers: ");
    for (int i = 0; i < numbers.length; i++ )
      numbers [i] = input.nextInt();
    //Displays Results 
    System.out.println("The GCD is " + gcd(numbers));
    
  }
  //finds GCD
  public static int gcd(int... numbers) {
    int gcd = 1;
    int minimum = getMinimum(numbers);
    int length = numbers.length - 1;
    
    int count = 0;
    for (int i = 2; i <= minimum; i++) {
      
      for (int n = 0; n <= length; n++) {
        if (numbers[n] % i == 0) {
          count++;
          if(count == length) gcd = i;
        }else{
          count = 0;
        }
      }
    
  }
  
    return gcd;

  }
  //finds smallest integer in array 
  public static int getMinimum(int[] array) {
    int minimum =array[0];
    for (int i = 0; i < array.length; i++) {
      if (minimum > array[i]) {
        minimum = array [i];
      }
    }
    return minimum;
  }

}
