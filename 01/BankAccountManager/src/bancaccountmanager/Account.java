package bancaccountmanager;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance;
    private final List<Integer> history;

    public Account() {
        this.balance = 0;
        this.history = new ArrayList<>();
    }

    public List<Integer> getHistory() {
        return history;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
        history.add(this.balance);
    }
}
