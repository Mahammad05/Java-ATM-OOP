public class App {
    public static void main(String[] args) {

        Account account = new Account("Mahammad", "2024", 3500);
        ATM atm = new ATM();

        atm.work(account);
        System.out.println("Program closing...");

    }
}