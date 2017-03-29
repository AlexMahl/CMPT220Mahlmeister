import java.util.Date;
//Class
public class Account {
  //Data field 
  private int id; 
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;
  //Constructor 
  public Account() {
    id = 0;
    balance = 100;
    annualInterestRate = 0;
    dateCreated =  new Date();
   }
  //Creates an account with ID and balance 
  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new Date();     
  }
  //sets getId
  public void getId(int newId) {
    id = newId;
  }
  //returns getId
  public int getId() {
    return id;
  }
  //sets getBalance 
  public void getBalance(double newBalance) {
    balance = newBalance;
  }
  //returns getBalance 
  public double getBalance() {
    return balance;
  }
  //sets getAnnualIntrestRate
  public void getAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }
  //returns getAnnualInterestRate
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }
  // returns getDateCreate
  public String getDateCreated() {
    return dateCreated.toString();
  }
  //returns getMonthlyInterestRate
  public double getMonthlyInterestRate() {
    return annualInterestRate / 12;
  }
  //calculates monthly interest rate 
  public double getMonthlyInterest() {
    return balance * (getMonthlyInterestRate() / 100);
  }
  //Calculates withdrawals 
  public void withdraw(double withdraw){
    balance = balance - withdraw;
  }
  //Calculates deposits 
  public void deposit(int deposit1) {
    balance = balance + deposit1;
  }
  //override toString 
  @Override
  public String toString() {
    return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
        + ", dateCreated=" + dateCreated + ", toString()=]";
  }
  
  
}
  