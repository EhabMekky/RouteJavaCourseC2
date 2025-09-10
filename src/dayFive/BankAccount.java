package dayFive;

public class BankAccount {

    // Encapsulation => bundling data (attributes) and methods (behavior) together in a class, while restricting direct access to some of the object’s components.

    // Principles: *Data hiding. *Control access. *Access modifiers

    // Benefits: Improves security, maintainability, flexibility

    private double initialBalance = 10000;
    private double balance = initialBalance; //hide from direct access

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0)
            this.balance += balance;
    }

    /*
    - Create a `Student` class with:
    - Private attributes: `name`, `grade`.
    - Public getter for `name`.
    - Public setter for `grade`, but only allows values between 0–100.
     */


    // Constructor
//    public BankAccount(double initialBalance)
//    {
//        balance = initialBalance;
//    }
//
//    //getter
//    public double getBalance()
//    {
//        return balance;
//    }
//
//    // setter with validation
//    public void deposit(double amount)
//    {
//        if(amount > 0)
//            balance += amount;
//    }

}
