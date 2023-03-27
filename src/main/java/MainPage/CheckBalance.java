package MainPage;

import java.util.Scanner;

public class CheckBalance {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the banking app");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter bank code: ");
            String BankCode = sc.nextLine();

<<<<<<<<< Temporary merge branch 1
            // get the book object
=========
            // get the bank object
>>>>>>>>> Temporary merge branch 2
            Balance yourBalance = BalanceOptions.getBalance(BankCode);

            // display the output
            System.out.println();
            if (yourBalance != null) {
                System.out.println("your balance: " + yourBalance.toString());
            }

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}
