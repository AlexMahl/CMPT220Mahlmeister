public class Problem_12_1_Without_Exception {
 
  //Main Method 
  public static void main(String[] args) {
  
  //Check number of strings passed
  if (args.length != 3){
    System.out.println("Usage: Java Calculator operand1 operator operand2");
  System.exit(0);
  }
  
  //Integer check 
  inputInteger(args[0]);
  inputInteger(args[2]);
  
  //The results of the operation
  int result = 0;
  
  
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
  }
  //Checks to see if input is integer 
  private static void inputInteger(String integer){
    for (int i = 0; i < integer.length(); i++){
      if (!Character.isDigit(integer.charAt(i))){
        System.out.println("The following input is incorrect: " + integer);
        System.exit(0);
      }
    }
  } 
}
