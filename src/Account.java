public class Account {
    private String username;
    private String password;
    private int balance;

    public Account (String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void cashIn (int amount) {
        this.balance += amount;
        System.out.println("New balance : " + this.balance);
    }

    public void cashOut (int amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("Don't have enough balance!");
        }
        else {
            this.balance -= amount;
            System.out.println("New balance : " + this.balance);
        }
    }
}
