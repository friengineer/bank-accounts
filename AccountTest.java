import java.util.List;
import java.util.ArrayList;

public class AccountTest{

  public static void main(String[] args){

    // creates a list for BankAccounts
    List<BankAccount> accounts = new ArrayList<>();

    // attempts to create a SavingsAccount and catches exceptions if they are thrown
    try{

      SavingsAccount testAccount = new SavingsAccount(1, "Charles Dickens", 7, 10001);
    }
    catch (IllegalArgumentException e){

      System.err.println("IllegalArgumentException: " + e.getMessage());
    }

    // attempts to create a StudentAccount and catches exceptions if they are thrown
    try{

      StudentAccount testAccount2 = new StudentAccount(1, "Tracy Beaker", -5);
    }
    catch (IllegalArgumentException e){

      System.err.println("IllegalArgumentException: " + e.getMessage());
    }

    // creates new SavingsAccounts and StudentAccounts
    SavingsAccount account1 = new SavingsAccount(1, "Charlotte Brontë", 2.5, 5000);
    SavingsAccount account2 = new SavingsAccount(2, "Emily Brontë", 3.3, 2800);
    SavingsAccount account3 = new SavingsAccount(3, "Anne Brontë", 5);
    StudentAccount account4 = new StudentAccount(4, "Paul Chuckle", 1500);
    StudentAccount account5 = new StudentAccount(5, "Barry Chuckle");

    // adds created accounts to the list
    accounts.add(account1);
    accounts.add(account2);
    accounts.add(account3);
    accounts.add(account4);
    accounts.add(account5);

    // prints out the information for each account in the list
    for (BankAccount i: accounts){

      System.out.println(i.toString());
    }

    // attempts to make either a deposit or withdrawal on each account and catches exceptions if they are thrown
    try{

      account1.deposit(500);
      account2.withdraw(1350);
      account3.deposit(640);
      account4.withdraw(1600);
      account5.deposit(1750);
      account1.deposit(5000);
    }
    catch (IllegalArgumentException e){

      System.err.println("IllegalArgumentException: " + e.getMessage());
    }

    // attempts to make a withdrawal on a student account to take the balance below -£250 and catches exceptions if they are thrown
    try{

      account4.withdraw(200);
    }
    catch (IllegalArgumentException e){

      System.err.println("IllegalArgumentException: " + e.getMessage());
    }

    // attempts to make a deposit  of £0 on a savings account and catches exceptions if they are thrown
    try{

      account3.deposit(0);
    }
    catch (IllegalArgumentException e){

      System.err.println("IllegalArgumentException: " + e.getMessage());
    }

    // adds interest to a savings account
    account3.addInterest();

    // prints out the information for each account in the list
    for (BankAccount i: accounts){

      System.out.println(i.toString());
    }
  }
}
