package Ex3;

class Euro implements ICurrency {
    private double amount;
    private double exchangeRate;

    Euro() {
        amount = 0.0;
        exchangeRate = 40.25;
    }

    Euro(double amount) {
        this.amount = amount;
        exchangeRate = 40.25;
    }

    @Override
    public double toUAH() {
        return getAmount() * exchangeRate;
    }

    @Override
    public void printAmount() {
        System.out.println("€" + getAmount());
    }

    @Override
    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount cannot be negative. Setting amount to 0.");
            this.amount = 0;
        }
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
