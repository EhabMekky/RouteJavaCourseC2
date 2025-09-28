package dayNine;

public class BankAccount {
    private double balance;

    //custom exception
    public void withdraw(double amount) throws InvalidUserInputException
    {
        if(amount > balance) {
            throw new InvalidUserInputException("Insufficient funds for withdrawal of " + amount);
        }
        balance -= amount;
    }

    class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    class InvalidUserInputException extends RuntimeException {
        public InvalidUserInputException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(100);
        } catch (InvalidUserInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
