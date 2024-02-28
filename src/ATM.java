import java.util.Scanner;

public class ATM {
    public void work (Account account) {
        
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ATM");

        System.out.println("*********************");
        System.out.println("User Login");
        System.out.println("*********************");
        int entry_right = 3;

        while (true) {
            if (login.login(account)) {
                System.out.println("Logged in successfuly...");
                break;
            }
            else {
                System.out.println("Login failed!");
                entry_right -= 1;
                System.out.println("Entry of rights : " + entry_right);
            }
            if (entry_right == 0) {
                return;
            }
        }

        System.out.println("*********************");
        System.out.println("Trancastions :");
        
        
        String transactions = "1. Show balance\n"
                            + "2. Cash in\n"
                            + "3. Cash out\n"
                            + "Press 'q' to close the program";
        System.out.println(transactions);

        System.out.println("*********************");

        while (true) {
            System.out.print("Select a transaction : ");
            String transaction = scanner.nextLine();

            if (transaction.equals("q")) {
                break;
            }
            else if (transaction.equals("1")) {
                System.out.println("Your balance : " + account.getBalance());
            }
            else if (transaction.equals("2")) {
                System.out.print("Enter an amount : ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                account.cashIn(amount);
            }
            else if (transaction.equals("3")) {
                System.out.print("Enter an amount : ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                account.cashOut(amount);
            }
            else {
                System.out.println("Invalid transaction!");
            }

        }
    }
}
