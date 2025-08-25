public class ATMInterface {
    public static void main(String[] args) {
        // Example: Ek account create kiya (tu multiple bhi kar sakta hai)
        BankAccount account = new BankAccount("Priyanshu", 1234, 50000);
        ATM atm = new ATM(account);

        if (atm.login()) {
            atm.showMenu();
        } else {
            System.out.println("Exiting ATM. Try again later.");
        }
    }
}
