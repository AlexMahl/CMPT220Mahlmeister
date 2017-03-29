import java.util.ArrayList;
import java.util.Scanner;

public class Problem_11_11 {
  //Main Method 
  public static void main(String[] args) {
  //Scanner
  Scanner scanner = new Scanner(System.in);
  //Creates Array 
  ArrayList<Integer> list = new ArrayList<Integer>();
  //User Input 
  System.out.print("Enter 5 integers: ");
  
  //Accepts first 5 integers 
  for (int i = 0; i < 5; i++){
    list.add(scanner.nextInt());
  }
  //Sort Array
  sort(list);
  
  //Output 
  System.out.println(list.toString());
  }
  
  //Sorts the Array of Integers 
  private static void sort(ArrayList<Integer> list) {
    java.util.Collections.sort(list);
    
  }

}
