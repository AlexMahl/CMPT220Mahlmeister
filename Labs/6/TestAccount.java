
public class TestAccount {
  //Main Method 
  public static void main(String[] args) {
    //Creates an account under 1122 and a balance of $20,000
    Account account = new Account (1122, 20000);
    //Sets an annual interest rate of 4.5%
    account.getAnnualInterestRate(4.5);
    //Withdraws $2,500
    account.withdraw(2500);
    //Deposits $3,000
    account.deposit(3000);
    //Displays the information about the account 
    System.out.println("Account Statement:  ");
    System.out.println("                        ");
    System.out.println("Account ID: " + account.getId());
    System.out.println("Date created: " + account.getDateCreated());
    System.out.println("Balance: $" + account.getBalance());
    System.out.println("Monthly Intrest: $" + account.getMonthlyInterest());;
  }
}
