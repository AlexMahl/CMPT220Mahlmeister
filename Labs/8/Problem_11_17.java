import java.util.Scanner;
import java.util.ArrayList;

public class Problem_11_17 {
  //Main Method 
  public static void main(String[] args) {
  //Scanner 
  Scanner scanner = new Scanner(System.in);
  //User Input 
  System.out.print("Enter an integer m: ");
  //Scanner 
  int m = scanner.nextInt();
  //perfectSquare
  int n = perfetSquare(m);
  //Output Statement 
  System.out.println("The smallest number n for n * m to be a perfect square is " + n + "\nm * n is " + (m * n));
  }
  
  //Find Perfect Square 
  private static int perfetSquare(int m) {
    //Creates array 
    ArrayList<Integer> list = new ArrayList<>();
    int i = 2;
    //Finds factors of M
    while(m > 1){
      if(m % i == 0){
        if(list.contains(i)){
          int listIndex  = list.indexOf(i);
          list.remove(listIndex);
        }else{
          list.add(i);
        }
         m /= i;
        }else{
       i++;
      }
    }
      //Calculates N 
       int n = 1; 
       for (int j = 0; j < list.size(); j++){
         n *= list.get(j);
       }
      return n;
      }
  }


