package bancaccountmanager;

public class BankAccountManager {

    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("0 == " + a.getBalance());

        a.deposit(500);
        System.out.println("500 == " + a.getBalance());

        a.deposit(-5000);
        System.out.println("-4500 == " + a.getBalance());

        System.out.println(a.getHistory());
    }
}
