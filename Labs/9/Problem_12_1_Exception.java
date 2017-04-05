public class Problem_12_1_Exception {
  //Main Method 
  public static void main(String[] args) {
  //Check number of strings passed
  if (args.length != 3){
    System.out.println("Usage: Java Calculator operand1 operator operand2");
  System.exit(0);
  }
  
  //The results of the operation
  int result = 0;
  
  //Checks to see if input is integer 
  try {
    //Determine the operator 
    switch (args[1].charAt(0)){
    case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
       break;
    case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
       break;
    case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
       break;
    case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
    
    }
    
    //Display the results 
    System.out.println((args[0]) + ' ' + args[1] + ' ' + (args[2]) + " = " + result);
    
    //Catch Exception
  }catch(NumberFormatException ex){
    System.out.println("The following input is incorrect: " + ex.getMessage());
  }
  }
}
