//Class
public class Problem_6_1 {
  
  //Main Method 
  public static void main(String[] args) {
    int number;
    //Do equations from 1 though 100 
    for(int n = 1; n < 100; n++) { // JA: You missed the last term
      number = getPentagonalNumber(n);
      System.out.print(number + " "); 
      if(n % 10 == 0){
        System.out.println();
        }
      }
    }
  
    //Set Equation for Pentagonal Numbers 
    public static int getPentagonalNumber(int n) {
      return n * (3 * n -1) / 2; 
    }
  }


