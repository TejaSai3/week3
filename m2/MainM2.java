class MessWallet {
    private double balance;

    // Constructor initializes balance with negative check[cite: 1]
    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Opening balance cannot be negative. Setting balance to 0.0.");
            this.balance = 0.0;
        } else {
            this.balance = openingBalance;
        }
    }

    // Top-up method rejecting non-positive amounts[cite: 1]
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: Amount must be greater than 0.");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    // Deduct method preventing negative balance[cite: 1]
    public void deduct(double amount) {
        if (amount <= 0) {
            System.out.println("Deduct rejected: Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Balance after deduction: " + balance);
        }
    }

    // Read-only getter[cite: 1]
    public double getBalance() {
        return balance;
    }
}

public class MainM2 {
    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500.0);
        wallet.topUp(200.0);
        wallet.deduct(1000.0);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}