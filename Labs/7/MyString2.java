
public class MyString2 {
  
  //Data field 
  private String s;
  
  //Create MyInteger class 
  MyString2(String s){ 
    this.s = s;
  }
  //Return Values
  public String getValue() { 
    return s;
  }
  
  //Compare strings 
  public int compare(String s) {
   int index = 0;
   if(this.s.length() < s.length()) {
     index = -1;
   }else{
      index = 1;
   }
   
   for (int i = 0; i < this.s.length(); i++) {
     if (this.s.charAt(i) < s.charAt(i))
       index = -(i + 1);
     if (this.s.charAt(i) > s.charAt(i))
     index = (i + 1);
   }
    return index;
  }
  
  //Return substring value 
  public MyString2 substring(int start) {
    String begin = "";
    for (int i = start, n = 0; i < s.length(); i++, n++){
      begin += s.charAt(i) + "";
    }
    return new MyString2(begin);
  }
  
  //Change to upper case 
  public MyString2 toUpperCase() {
   char [] newArray = s.toCharArray();
   String upperCase = "";
   for (int i = 0; i < newArray.length; i++){
     if(Character.isLowerCase(newArray[i])){
       newArray[i] = Character.toUpperCase(newArray[i]);
     }
     upperCase += newArray[i];
   }
     MyString2 MyString3 = new MyString2(upperCase);
  
      return MyString3; 
  }
  
  //valueOf boolean b 
  public static MyString2 valueOf(boolean b) {
    return (b ? new MyString2("true") : new MyString2("fasle"));
  }
  
  
  //toChar()
  public char[] toChars() {
    char [] charArray = new char[s.length()];
    for(int i = 0; i < charArray.length; i++){
      charArray[i] = s.charAt(i);
    }
    return charArray;
  }
}