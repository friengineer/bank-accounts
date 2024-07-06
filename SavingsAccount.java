public class SavingsAccount extends BankAccount{

  // uninherited fields for SavingsAccount
  private double interestRate;

  // constructor for SavingsAccount that initialises balance to 0 if it is not specified
  public SavingsAccount(int id, String name, double interestRate){

    super(id, name);
    this.interestRate = interestRate;
  }

  // constructor for SavingsAccount
  public SavingsAccount(int id, String name, double interestRate, int bal){

    super(id, name, bal);
    this.interestRate = interestRate;
  }

  // sets the value of balance and checks if a positive value has been entered and if the value exceeds 10,000
  public void setBalance(int bal){

    if (bal < 0){

      throw new IllegalArgumentException("The account could not be created because the balance is lower than £0.\n");
    }

    if (bal > 10000){

      throw new IllegalArgumentException("The account could not be created because the balance exceeds £10,000.\n");
    }

    balance = bal;
  }

  // returns value of interestRate
  public double getInterestRate(){

    return interestRate;
  }

  // alters the value of interestRate
  public void setInterestRate(double interestRate){

    this.interestRate = interestRate;
  }

  // calculates the amount of interest using balance and adds the interest to balance
  public void addInterest(){

    balance += (balance * interestRate/100);
  }

  // overrides the inherited deposit method, adds the entered amount to balance if it is greater than 0 and the sum of balance and amount is less than or equal to 10,000
  public void deposit(int amount){

    if (amount > 0){

      if ((balance + amount) > 10000){

        throw new IllegalArgumentException("You cannot deposit the entered amount because it will take your account balance above £10,000. Please deposit a smaller amount.\n");
      }
      else{

        balance += amount;
      }
    }
    else{

      throw new IllegalArgumentException("Enter a value greater than 0.\n");
    }
  }

  // overrides the inherited toString method, creates a String that states this is a SavingsAccount and contains the values for id, name, balance and interestRate
  public String toString(){

    String account = "Savings account: ID - " + getId() + ", Name - " + getName() + ", Balance - £" + getBalance() + ", Interest rate - " + getInterestRate() + "%\n";

    return account;
  }
}
