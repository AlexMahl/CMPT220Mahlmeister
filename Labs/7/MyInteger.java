
public class MyInteger {
  
  //Data field 
  private int value;
  
  //Create MyInteger class 
  MyInteger(int value){ 
    this.value = value;
  }
  //Return Values
  public int getValue() { 
    return value;
  }
  //Return boolean isEven value 
  public boolean isEven(){
    return isEven(value);
  }
  //Return boolean isOdd value 
  public boolean isOdd(){
    return isOdd(value);
  }
  //Return boolean isPrime value 
  public boolean isPrime() {
    return isPrime(value);
  }
  //Return boolean int isEven() value 
  public static boolean isEven(int value) {
    return value % 2 == 0;
  }
  //Return boolean int isOdd() value 
  public static boolean isOdd(int value) {
    return value % 2 != 0;
  }
  //Return boolean int isPrime() value 
  public static boolean isPrime(int value) {
    int divide = 2;
    while (value > divide) {
      if (value % divide == 0){
        return false;
    }
    return true;
  }
    return true;
  }
  //Return boolean isEven(MyInteger) value 
  public static boolean isEven(MyInteger myValue){
    if(myValue.getValue() % 2 == 0) {
    return myValue.isEven();
  }else{
    return false;
    }
  }
  //Return boolean isOdd(MyInteger) value 
  public static boolean isOdd(MyInteger myValue){
    if(myValue.getValue() % 2 == 1){
    return true;
  }else{
    return false;
  }
  }
  //Return boolean isPrime(MyInteger) value 
  public static boolean isPrime(MyInteger myValue){
    int divide = 2;
    while(myValue.getValue() > divide){
      if(myValue.getValue() % divide == 0){
        return false;
      }
      divide++;
    }
    return true;
  }
  //checks to see if integers numbers are equal 
  public boolean equals(int myValue) {
    if(myValue == value){
      return true;
    }
    return false;
  }
  
  //Check to see if MyIntegers numbers are equal 
  public boolean equals(MyInteger myValue){
    if(myValue.getValue() == value){ 
      return true;
    }
    return false;
  }
  //ParseInt string 
  public static int parseInt(String stringValues){
    return Integer.parseInt(stringValues);
  }
  //Converts numeric into int 
  public static int parseInt(char[] chars) {
    String stringValues = "";
    for (int i = 0; i < chars.length; i++) {
      stringValues += chars[i];
    }
    //Parses sting 
    return parseInt(stringValues);
  }

}
