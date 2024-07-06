public class BankAccount{

  // fields for BankAccount, protected so that subclasses can access them directly without using getters/setters
  protected int id;
  protected String name;
  protected int balance;

  // constructor for BankAccount that initialises balance to 0 if it is not specified
  public BankAccount(int id, String name){

    this.id = id;
    this.name = name;
    setBalance(0);
  }

  // constructor for BankAccount
  public BankAccount(int id, String name, int bal){

    this.id = id;
    this.name = name;
    setBalance(bal);
  }

  // returns value of id
  public int getId(){

    return id;
  }

  // retruns value of name
  public String getName(){

    return name;
  }

  // returns value of balance
  public int getBalance(){

    return balance;
  }

  // sets the value of balance and checks if a positive value has been entered
  public void setBalance(int bal){

    if (bal < 0){

      throw new IllegalArgumentException("The account could not be created because the balance is lower than £0.\n");
    }

    balance = bal;
  }

  // adds the entered amount to balance if it is greater than 0
  public void deposit(int amount){

    if (amount > 0){

      balance += amount;
    }
    else{

      throw new IllegalArgumentException("Enter a value greater than 0.");
    }
  }

  // subtracts the entered amount from balance if it is greater than 0 and less than or equal to balance
  public void withdraw(int amount){

    if (amount > 0 && amount <= balance){

      balance -= amount;
    }
    else if (amount < 1){

      throw new IllegalArgumentException("Enter a value greater than 0.");
    }
    else{

      throw new IllegalArgumentException("Insufficient funds.");
    }
  }

  // creates a String that states this is a BankAccount and contains the values for id, name and balance
  public String toString(){

    String account = "Bank account: ID - " + Integer.toString(id) + ", Name - " + name + ", Balance - £" + Integer.toString(balance) + "\n";

    return account;
  }
}
