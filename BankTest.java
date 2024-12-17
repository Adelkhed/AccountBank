public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(1000.0,2000.0);
        BankAccount account2 = new BankAccount(500.0,1000.0);
        BankAccount account3 = new BankAccount(800.0,10000.0);

        // Deposit Test
        account1.deposit(200.0,"checking");
        account2.deposit(1000.0,"savings");
        account3.deposit(1000.0,"checking");
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balan
        account1.withdraw(500.0, "checking");
        account2.withdraw(520.0, "savings");
        account3.withdraw(2000.0, "checking");
        // - each withdrawal should decrease the amount of totalMoney
        
        System.out.println("Number of accounts: " + BankAccount.getAccounts());
        System.out.println( "Total money in all accounts: " + BankAccount.getTotalMoney());
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Account1 number: " + account1.getAccountNumber());
        System.out.println("Account2 number: " + account2.getAccountNumber());
        System.out.println("Account3 number: " + account3.getAccountNumber());
    }
}
