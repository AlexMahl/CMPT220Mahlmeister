import java.util.ArrayList;
import java.util.Scanner;

public class Problem_11_13 {

  public static void main(String[] args) {
    //Scanner 
    Scanner scanner = new Scanner(System.in);
    
    //Crate an ArrayList 
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    //Input Statement 
    System.out.print("Enter 10 integers: ");
  
    //Accept the first 10 numbers  
    for (int i = 0; i < 10; i++){
      list.add(scanner.nextInt());
    }
    
    //Remove Duplicates 
    removeDuplicates(list);
    
    //Display output 
    System.out.print("The distinct integers are: "); 
    for (int i = 0; i < list.size(); i++)
      System.out.print(list.get(i) + ", ");
  }
    //Finds and removes duplicates in array 
    private static void removeDuplicates(ArrayList<Integer> list) {
      for(int i = 0; i < list.size();){
        int listIndex = list.lastIndexOf(list.get(i));
        if (listIndex != i){
          list.remove(listIndex);
        }else{
          i++;
        }
      }
    }
}
