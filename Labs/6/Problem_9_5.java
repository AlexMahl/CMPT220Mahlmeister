import java.util.GregorianCalendar;

public class Problem_9_5 {
  //Main method
  public static void main(String[] args) {
    //Set the Gregorian Calendar 
    GregorianCalendar calendar = new GregorianCalendar();
    
    //Display the Calendar for the current date
    int month = calendar.get(calendar.MONTH) + 1; 
    int day = calendar.get(calendar.DAY_OF_MONTH); 
    int year =calendar.get(calendar.YEAR);
    System.out.println("The current date is: " + month + "/" + day + "/" + year);
    
    
    //Set new Gregorian Calendar
    GregorianCalendar calendar1 = new GregorianCalendar();
    //Set to 1234567898765L
    calendar1.setTimeInMillis(1234567898765L);
    
    //Display the new Calendar
    int month1 = calendar1.get(calendar1.MONTH) + 1; 
    int day1 = calendar1.get(calendar1.DAY_OF_MONTH); 
    int year1 =calendar1.get(calendar1.YEAR);
    System.out.println("The new date is: " + month1 + "/" + day1 + "/" + year1);
    
  }
}
