package ex2;

abstract class Currency {
    private double amount;

    Currency() {
        amount = 0.0;
    }

    Currency(double amount) {
        this.amount = amount;
    }

    abstract double toUAH();

    abstract void printAmount();

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount cannot be negative. Setting amount to 0.");
            this.amount = 0;
        }
    }

    double getAmount() {
        return amount;
    }
}
