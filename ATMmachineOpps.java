import java.util.*;

class ATM {
    float balance;
    int pin = 1122;

    public void checkPin() {
        System.out.println("please enter your pin");
        Scanner sc = new Scanner(System.in);
        int givenPin = sc.nextInt();
        if (givenPin == pin) {
            menu();
        } else {
            System.out.println("invalid pin ..");
        }
    }

    public void menu() {
        System.out.println("Enter your choice: ");
        System.out.println("1. Check balance\n2. Withdraw money\n3. Deposit money\n4. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            withdraw();
        } else if (choice == 3) {
            deposit();
        } else if (choice == 4) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice");
            menu();
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is " + balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter amount that you want to withdraw");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
        menu();
    }

    public void deposit() {
        System.out.println("Enter amount");
        Scanner sc = new Scanner(System.in);
        int amount2 = sc.nextInt();
        balance += amount2;
        System.out.println("Deposit successful");
        menu();
    }
}

public class ATMmachineOpps {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
