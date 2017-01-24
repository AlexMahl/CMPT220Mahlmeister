import java.util.Scanner;

//Class
public class Problem_2_1 {
  //Main Method
  public static void main(String[] args) {
    //Scanner 
	Scanner input = new Scanner(System.in);
	
	//Output statement
	System.out.print("Enter a degree in Celsius: ");
	//Input  
	double celsius = input.nextDouble();
    
	//Conversion from Fahrenheit to Celsius 
	double fahrenheit = (9.0 / 5 ) * celsius + 32;
	//Output statement
	System.out.println( celsius + " Celsius" + " is " + fahrenheit + " in Fahrenheit");
  }
}
