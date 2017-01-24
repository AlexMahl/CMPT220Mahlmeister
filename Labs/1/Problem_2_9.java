import java.util.Scanner;
//Class
public class Problem_2_9 {
  //Main Method
  public static void main (String [] args) {
    //Scanner 
	Scanner input = new Scanner(System.in);
	//Output Statement 
	System.out.println("Enter V0, V1, and T: ");
	//V0 Input 
	double startingVelocity = input.nextDouble();
	//V1 Input 
	double endingVelocity = input.nextDouble();
	//T Input 
	double time = input.nextDouble();
	//Acceleration Calculation
	double average = (endingVelocity - startingVelocity)/ time;
	//Output Statement to 4 decimals 
	System.out.println("The average acceleration is " + (int)(average * 10000) / 10000.0);
  }
}