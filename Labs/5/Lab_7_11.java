import java.util.Scanner;
//Class
public class Lab_7_11 {
  //Main Method
  public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    //Caps array at 10
    double[] numbers = new double [10];
    //User input of 10 numbers
    System.out.print("Enter 10 integers: ");
    for (int i = 0; i < numbers.length; i++ )
      numbers [i] = input.nextDouble();
    //Displays Results 
    System.out.println("The mean is " + mean(numbers));
    System.out.println("The standard deviation is " + deviation(numbers));
    
  }
  
    //Compute the deviation of double values 
    public static double deviation (double[] x) {
      
      double deviation = 0;
      double mean = mean(x);
      for (int i = 0; i < x.length; i++) {
        deviation += Math.pow(x[i] - mean, 2);
      }
      return Math.sqrt(deviation / (x.length - 1));
    }
    //Compute the mean of an array of double values 
    public static double mean(double[] x) {
      
      double total = 0;
      for (int i = 0; i < x.length; i++) {
        total += x[i];
      }
      return total / x.length;
    }

}
