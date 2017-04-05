import java.util.Scanner;

public class Problem_12_3 {
  //Main Method 
  public static void main(String[] args) {
    //Initialize array 
    int[] array = new int[100];
    //Generate numbers from 1 to 100 
    for(int i = 0; i < array.length; i++) {
      array[i] =  (int)(Math.random() * 100) + 1;
    }
   //Scanner 
    Scanner scanner = new Scanner(System.in);
    //Output 
    System.out.print("Enter the index of array: ");
    //Checks to see if element is out of bounds 
    try {
      System.out.println("The corresponding element value is: " + array[scanner.nextInt()]);
    }catch(ArrayIndexOutOfBoundsException ex){
      System.out.println("This element is out of bounds");
    }
  }
 }


