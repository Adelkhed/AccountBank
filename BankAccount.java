import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private String accountNumber;
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = generateAccountNumber();
        accounts = accounts + 1;
        totalMoney += checkingBalance + savingsBalance;
    }
    // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    // for checking, savings, accounts, and totalMoney
    // METHODS
    // deposit
    public void deposit(double amount, String accountType) {
        if (amount > 0) {
            if (accountType == "checking"){
                checkingBalance += amount;
            } else if (accountType=="savings") {
                savingsBalance += amount;
            } else {
                System.out.println("Invalid account type. Use 'checking' or 'savings'.");
                return;
            }
            totalMoney += amount;
            System.out.println("you are deposited " + amount + " into your account Number "+accountNumber +" the type is "+ accountType + "  Total balance: " + getBalance());
            System.out.println("your Checking Balance is:"+getCheckingBalance());
            System.out.println("your Savings Balance is:"+getSavingsBalance());
        } else {
            System.out.println("Must deposit your amount positive");
        }
    }

    // - users should be able to deposit money into their checking or savings account
    // withdraw 
    public void withdraw(double amount, String accountType) {
        if (amount > 0) {
            if (accountType=="checking") {
                if (checkingBalance >= amount) {
                    checkingBalance -= amount;
                    totalMoney -= amount;
                    System.out.println("Withdrew " + amount + " Checking account. Your Checking balance is: " + checkingBalance);
                } else {
                    System.out.println("Insufficient funds in checking account.");
                }
            } else if (accountType=="savings") {
                        if (savingsBalance >= amount) {
                             savingsBalance -= amount;
                             totalMoney -= amount;
                             System.out.println("Withdrew " + amount + " Savings account. Your saving balance is : " + savingsBalance);
                        } else {
                                    System.out.println("Insufficient funds in savings account");
                        }
                    } else {
                             System.out.println("Invalid account type. Must use 'checking' / 'savings'");
                    }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    public double getBalance() {
        return checkingBalance + savingsBalance;
    }

    // - display total balance for checking and savings of a particular bank account
     private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();
    }
}
 