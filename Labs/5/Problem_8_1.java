import java.util.Scanner;
//Class
public class Problem_8_1 {
  //Main Method 
  public static void main(String[] args) {
      
      // Set up to read rows as 3-by-4 
      double[][] matrix = getRows();
      //Display the output
      for (int col = 0; col < matrix[0].length; col++) {
        System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
      }
  }
      //Creates user input array 
      public static double [][] getRows() {
      //Scanner
      Scanner input = new Scanner(System.in);
      double[][] m = new double [3][4];
      //User input and sets input as 3-by-4
      System.out.print("Enter a 3-by-4 matrix row by row: \n");
        for (int row = 0; row < m.length; row ++)
          for (int col = 0; col < m[row].length; col++)
              m[row][col] = input.nextDouble();
  
          return m;
  
     }
      //Adds the columns up to get sum
      public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
          sum += m[row][columnIndex];
        }
        return sum;
      
  }
}
