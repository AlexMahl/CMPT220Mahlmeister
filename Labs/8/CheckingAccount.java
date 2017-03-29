//Class and SuperClass 
public class CheckingAccount extends Account {
  public static final int OVERDRAFT = -20; 
  
  //Withdraw money from checking account 
  public void withdraw(int withdraw){
    if(getBalance() - withdraw > OVERDRAFT) {
      double balance = (getBalance() - withdraw);
    }else{
      System.out.println("Amount exceeds overdraft limit.");
    }
    
  }
  //Override to String 
  @Override
  public String toString() {
    return "CheckingAccount [toString()=" + super.toString() + "]";
  }
  }

