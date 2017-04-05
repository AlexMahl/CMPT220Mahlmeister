
public class Problem_12_7 {
  //Main Method
  public static void main(String[] args) {
   //Set binary value 
   int binary = 1010011010;
   //Output statement 
   System.out.println(binary + " converted to decimal form is: " +  bin2Dec("1010011010"));

  }
  //Converts binary string to decimal with NumberFormatException catch 
  public static int bin2Dec(String binaryString){
    try {
      return  Integer.parseInt(binaryString, 2);
    }catch (NumberFormatException e){
      System.out.println("The inputted string is not a binary string." + e.getMessage());
    }
    return 0;
  }

}
