public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String cunstomerId;

    void deposit(int amount) {
        if(amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Depositied");
        }
    }
}
