import java.util.Scanner;

public class Login {
    public boolean login (Account account) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username : ");
        String username = scanner.nextLine();

        System.out.print("Enter a password : ");
        String password = scanner.nextLine();

        if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
            return true;
        }
        else {
            return false;
        }
    }
}
