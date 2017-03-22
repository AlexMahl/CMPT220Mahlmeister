import java.math.BigInteger;

public class Problem_10_21 {
  //Main Method
  public static void main(String[] args) {
    //Find numbers that meet the criteria 
    int count = 0;
    BigInteger max = new BigInteger(String.valueOf(Long.MAX_VALUE));
    BigInteger five = new BigInteger("5");
    BigInteger six = new BigInteger("6");
    BigInteger zero = new BigInteger("0");
    
    //Do it 10 times 
    while (count < 10) {
      max = max.add(new BigInteger("1"));
      if ((max.remainder(five).equals(BigInteger.ZERO) || max.remainder(six).equals(BigInteger.ZERO))) {
        count ++;
        //Output 
        System.out.println("The " + count + " number is: " + max);
    }
    }  
  }
}
