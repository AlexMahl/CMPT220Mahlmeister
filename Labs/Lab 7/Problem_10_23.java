import java.util.Arrays;

public class Problem_10_23 {

  public static void main(String[] args) {
    
    //Create string 
    MyString2 string1 = new MyString2("alexmahlmeister");
    MyString2 string2 = new MyString2("test1");
    
    //Compare strings 
    System.out.println("String1 is equal to: ");
    System.out.println(string1.compare("alexmahlmeister"));
    System.out.println("");
   
    
    //Call substring of string1
    System.out.println("Show the substring of string1 beggining at four:" );
    System.out.println(string1.substring(4).getValue());
    System.out.println("");
    
    //Change toUpperCase()
    System.out.println("Change string2 to uppercase: ");
    System.out.println(string2.toUpperCase().getValue());
    System.out.println("");
    
    //toChars()
    System.out.println("string1.toChars: ");
    System.out.println(Arrays.toString(string1.toChars()));
    System.out.println("");
    
    //valueOfBoolean(boolean b)
    System.out.println("Boolean b value: ");
    System.out.println(MyString2.valueOf(true).getValue());
    System.out.println("");
    
    
  }
 }
 
  
 

