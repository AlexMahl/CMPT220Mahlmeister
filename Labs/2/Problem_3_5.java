//Scanner Import 
import java.util.Scanner;

//Class
public class Problem_3_5 {
  //Main Method
  public static void main(String[] args) {
    //String  
    String today;
    String future;
    //Scanner 
    Scanner input = new Scanner(System.in);
    //User Input 
    System.out.print("Enter today's date: "); 
    int day = input.nextInt();
    //User Input
    System.out.print("Enter the number of days elapsed since today: ");
    int dayElapsed = input.nextInt();
    
    //If else statement that declares days
      if (day == 0)
        today = "Sunday";
      else if (day == 1)
        today = "Monday";
      else if (day == 2)
        today = "Tuesday";
      else if (day == 3)
        today = "Wednesday";
      else if (day == 4)
        today = "Thursday";
      else if (day == 5)
        today = "Friday";
      else
        today = "Saturday";
      
      //Calculates Future Day 
      int futureDay = (day + dayElapsed) % 7;
      
      //If else statement that declares days
      if (futureDay == 0)
        future = "Sunday";
      else if (futureDay == 1)
        future = "Monday";
      else if (futureDay == 2)
        future = "Tuesday";
      else if (futureDay == 3)
        future = "Wednesday";
      else if (futureDay == 4)
        future = "Thursday";
      else if (futureDay == 5)
        future = "Friday";
      else
        future = "Saturday";
      
      //Output Statement 
      System.out.println("Today is " + today + " and the future day is " + future);
    
  }

}
