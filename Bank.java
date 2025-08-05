// Account superclass
class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// SavingsAccount subclass extending Account
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}

// CheckingAccount subclass extending Account
class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }
}

// LoanAccount subclass extending Account
class LoanAccount extends Account {
    private double interestRate;

    public LoanAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}

// Main class for testing
public class Bank {
    public static void main(String[] args) {
        // Testing SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 2.5);
        savingsAccount.displayBalance();
        savingsAccount.calculateInterest();
        savingsAccount.displayBalance();

        // Testing CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 500.0, 200.0);
        checkingAccount.displayBalance();
        checkingAccount.withdraw(700.0);
        checkingAccount.displayBalance();

        // Testing LoanAccount
        LoanAccount loanAccount = new LoanAccount("LA001", 10000.0, 5.0);
        loanAccount.displayBalance();
        loanAccount.applyInterest();
        loanAccount.displayBalance();
    }
}
