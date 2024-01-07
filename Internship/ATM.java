import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: Rs" + balance);
        } else {
            System.out.println("Invalid.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: Rs" + balance);
            return true;
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            System.out.println("Insufficient balance");
        }
        return false;
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: Rs");
        double initialBalance = scanner.nextDouble();

        Account account = new Account(initialBalance);

        while (true) {
            displayMenu();

            System.out.print("Choose an option (1.Withdraw, 2:Deposit, 3: Balance, 0: Exit): ");
            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Thank you.");
                break;
            }
            if(option ==3){
                System.out.println("Current balance: Rs" + account.getBalance());
                break;
            }
            
            
            

             System.out.print("Enter amount: Rs");
            double amount = scanner.nextDouble();

            switch (option) {
                case 1:
                    account.withdraw(amount);
                    break;
                case 2:
                    account.deposit(amount);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu");
        System.out.println("1. Withdraw Funds\n2. Deposit Funds\n3.Balance\n0. Exit");
        
       
    }
}
