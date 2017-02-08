
//Class
public class Problem_5_5 {
  
  //Main Method 
  public static void main(String[] args) {
 
    //Display the names of each section 
    System.out.println("Kilograms     Pounds   |        Pounds     Kilograms");
    
    //Display table 
     for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
         //Conversions 
         System.out.printf("%-10d%8.1f", k, (k * 2.2));
         System.out.printf("     |        ");
         System.out.printf("%-8d%8.1f\n", p, (p / 2.2));
       }
    }
 }
