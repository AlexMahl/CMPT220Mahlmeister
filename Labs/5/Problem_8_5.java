import java.util.Scanner;
//Class
public class Problem_8_5 {
  //Main Method 
  public static void main(String[] args) {
    
    //Start two 3-by-3 matrices 
    double[][] matrix1 = getMatrix(1);
    double[][] matrix2 = getMatrix(2);
    
    //Start third 3-by-3 matrix with sum of the other two 
    double[][] matrix3 = addMatrix(matrix1, matrix2);
    
    //Display the matrices 
    display(matrix1, matrix2, matrix3);

  }
  //get matrix 
  public static double[][] getMatrix(int n) {
    //scanner 
    Scanner input = new Scanner(System.in);
    //user input 
    System.out.print("Enter matrix " + n + ": ");
    //creates a 3-by-3 matrix 
    double[][] m = new double[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++)
         m[i][j] = input.nextDouble();
    }
    
    return m;
  }
  //add the two matrices to get sum 
  public static double[][] addMatrix(double[][] a, double [][] b) {
    double[][] c = new double [3][3];
    
    for(int i = 0; i < c.length; i++) {
      for (int j =0; j < c[i].length; j++) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }
    return c;
  }
  //prints the elements 
  public static void display (double[][] m, int r) {
    for (int j = 0; j < m[r].length; j++){
      System.out.print(m[r][j] + " ");
    }
  }
  //Displays the output
  public static void display (double[][] m1, double[][] m2, double[][] m3) {
    System.out.println("The matrices are added as follows: ");
    
    for (int i = 0; i < 3; i++) {
      
      display(m1, i);
      System.out.print((i == 1 ? "  +  " : "     "));
      display(m2, i);
      System.out.print((i == 1 ? "  =  " : "     "));
      display(m3, i);
      System.out.println();
    }
  }
}
