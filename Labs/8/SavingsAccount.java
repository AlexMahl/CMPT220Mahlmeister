//Class and SuperClass 
public class SavingsAccount extends Account {

  //Withdraw money from savings account 
  public void withdraw(double withdraw){
    if (withdraw < getBalance()){
      double balance = (getBalance() - withdraw);
    }else{
      System.out.println("This action can not be done because the account is overdrawn");
    }
    
  }
  //Override toString 
  @Override
  public String toString() {
    return "SavingsAccount [toString()=" + super.toString() + "]";
  }
}
