package ex2;

class Euro extends Currency {
    private double exchangeRate;
    Euro() {
        super();
        exchangeRate = 40.25;
    }

    Euro(double amount) {
        super(amount);
        exchangeRate = 40.25;
    }

    @Override
    double toUAH() {
        return getAmount() * exchangeRate;
    }

    @Override
    void printAmount() {
        System.out.println("€" + getAmount());
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
