
public class TestAccount {
  //Main Method 
  public static void main(String[] args) {
    //Creates an account under 1122 and a balance of $20,000
    Account account = new Account (1122, 20000);
    //Creates saving account
    SavingsAccount savings = new SavingsAccount();
    //Creates checking account 
    CheckingAccount checking = new CheckingAccount();
    //Sets an annual interest rate of 4.5%
    account.getAnnualInterestRate(4.5);
    //toString Method 
    System.out.println(account.toString());
    //Withdraws $2,500
    account.withdraw(2500);
    System.out.println("    ");
    //toString Method 
    System.out.println(savings.toString());
    //Withdraws $2,500
    savings.withdraw(2500);
    System.out.println("    ");
    //toString Method 
    System.out.println(checking.toString());
    //Withdraws $2,500
    checking.withdraw(2500);
    System.out.println("    ");
  }
}

