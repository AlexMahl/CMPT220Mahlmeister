
public class Problem_10_3 {
  //Main method 
  public static void main(String[] args) {
    //Tests to see values of isEven(), isOdd(), isPrime()
    MyInteger myValue = new MyInteger(3);
    System.out.println("Is " + myValue.getValue() + " even?" + " " + myValue.isEven());
    System.out.println("Is " + myValue.getValue() + " odd?" + " "  + myValue.isOdd());
    System.out.println("Is " + myValue.getValue() + " prime?" + " "  + myValue.isPrime());
    System.out.println("");
    
    //Test to see values of isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
    MyInteger myValue3 = new MyInteger(5);
    System.out.println("Is " + myValue3.getValue() + " even?" + " "  + MyInteger.isEven(myValue3));
    System.out.println("Is " + myValue3.getValue() + " odd?" + " "  + MyInteger.isOdd(myValue3));
    System.out.println("Is " + myValue3.getValue() + " prime?" + " " + MyInteger.isPrime(myValue3));
    System.out.println("");
    
    //Tests to see values of isEven(int), isOdd(int), isPrime(int)
    int myValue2 = 12;
    System.out.println("Is " + myValue2 + " even?" + " "  + MyInteger.isEven(myValue2));
    System.out.println("Is " + myValue2 + " odd?" + " "  + MyInteger.isOdd(myValue2));
    System.out.println("Is " + myValue2 + " prime?" + " "  + MyInteger.isPrime(myValue2));
    System.out.println("");
    
    //Compares two values to see if they are equal to each other 
    System.out.println("Does " + myValue2 + " equal that of " + myValue.getValue() + ": " + myValue.equals(myValue2));
    System.out.println("Does " + myValue3.getValue() + " equal that of " + myValue.getValue() + ": " + myValue.equals(myValue3));
    System.out.println("");
    
    //ParseInt(char[]) 
    char[] chars = new char[] {'2', '5', '6'};
    System.out.println(MyInteger.parseInt(chars));
   
    //ParseInt(string) 
    String stringValues = "342";
    System.out.println(MyInteger.parseInt(stringValues));
  }

}
