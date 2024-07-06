public class StudentAccount extends BankAccount{

  // constructor for StudentAccount that initialises balance to 0 if it is not specified
  public StudentAccount(int id, String name){

    super(id, name);
  }

  // constructor for StudentAccount
  public StudentAccount(int id, String name, int bal){

    super(id, name, bal);
  }

  // overrides the inherited withdraw method, subtracts the entered amount from balance if it is greater than 0 and the subtraction of amount from balance is greater than -251
  public void withdraw(int amount){

    if (amount > 0 && (balance - amount) > -251){

      balance -= amount;
    }
    else if (amount < 1){

      throw new IllegalArgumentException("Enter a value greater than 0.");
    }
    else{

      throw new IllegalArgumentException("Insufficient funds.\n");
    }
  }

  // overrides the inherited toString method, creates a String that states this is a StudentAccount and contains the values for id, name and balance
  public String toString(){

    String account = "Student account: ID - " + Integer.toString(id) + ", Name - " + name + ", Balance - £" + Integer.toString(balance) + "\n";

    return account;
  }
}
