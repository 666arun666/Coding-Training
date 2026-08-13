abstract class banking {
    int accountNumber;
    String accountholderName;
    int balance;
    abstract void withdraw(int amount); 
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

}
class SavingsAccount extends banking {
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
class CurrentAccount extends banking {
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
public class BANKING {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.deposit(1000);
        savings.withdraw(500);
        savings.withdraw(600);

        CurrentAccount current = new CurrentAccount();
        current.deposit(2000);
        current.withdraw(1500);
        current.withdraw(600);
    }
}
