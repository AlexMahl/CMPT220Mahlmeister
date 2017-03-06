import java.util.Scanner;

public class TestLocation {

  public static void main(String[] args) {
    //Scanner 
    Scanner input = new Scanner(System.in);
    
    //User input for two-dimensional array 
    System.out.print("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int columns = input.nextInt();
    
    //Matrix 
    double[][] array = new double [row][columns]; 
    System.out.print("Enter the array: \n");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = input.nextDouble();
      }
    }
    
    //Get location 
    Location max = locateLargest(array);
    
    //Display results 
    System.out.println("The location of the largest element is: " +  max.maxValue + " at " + "(" + max.row + ", " + max.column + ")" );
  }

  public static Location locateLargest(double[][] a) {
    return new Location(a);
  }

}
