import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Snack[] snacks = new Snack[6];
        snacks[0] = new Snack("Coke", 2.00, 5);
        snacks[1] = new Snack("Pepsi", 2.00, 5);
        snacks[2] = new Snack("Cheetos", 3.00, 5);
        snacks[3] = new Snack("Doritos", 3.00, 5);
        snacks[4] = new Snack("KitKat", 2.00, 5);
        snacks[5] = new Snack("Snickers", 1.00, 1);

        VendingMachine vendingMachine = new VendingMachine(snacks);

        while (true) {
            SelectSnackPrompt(vendingMachine, snacks);
        }

    }

    public static void SelectSnackPrompt(VendingMachine vendingMachine, Snack[] snacks) {
        System.out.println("\nWelcome to the vending machine!");
        System.out.println("Machine State: " + vendingMachine.getState());
        System.out.println("Please select a snack:");
        for (int i = 0; i < snacks.length; i++) {
            System.out.println((i + 1) + ". " + snacks[i].getName());
        }
        System.out.println("0. Exit");

        int selection = scanner.nextInt();

        if (selection == 0) {
            exit();
        }

        vendingMachine.selectSnack(selection);
        InsertMoneyPrompt(vendingMachine);
    }

    public static void InsertMoneyPrompt(VendingMachine vendingMachine) {
        System.out.println("Machine State: " + vendingMachine.getState());
        System.out.println("Please insert money:");
        double amount = scanner.nextDouble();

        vendingMachine.insertMoney(amount);
        System.out.println("Machine State: " + vendingMachine.getState());
        vendingMachine.dispenseSnack();
    }

    public static void exit() {
        System.out.println("Exiting the program.");
        System.exit(0);
    }
}
