import java.util.Scanner;
//Class 
public class Problem_7_19 {
  //Main Method
  public static void main(String[] args) {
    //Scanner 
    Scanner input = new Scanner(System.in);
    //User input with the first number being the numbers allowed in the set
    System.out.print("Enter list: ");
    int[] list = new int[input.nextInt()];
    for (int i = 0; i < list.length; i++)
      list[i] = input.nextInt();
    
    //Displays result based on boolean output 
     System.out.println(isSorted(list) ? "The list is already sorted" : "The list is not sorted");
     
    }
    //Finds out if the list is sorted or not 
    public static boolean isSorted(int[] list) {
      for (int i =0;  i < list.length - 1; i++) {
        if (list[i] > list[i + 1])
         return false;
      }
      return true;
    }
}
