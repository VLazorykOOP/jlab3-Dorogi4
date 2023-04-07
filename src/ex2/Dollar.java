package ex2;

class Dollar extends Currency {
    private double exchangeRate;
    Dollar() {
        super();
        exchangeRate = 37.5;
    }

    Dollar(double amount) {
        super(amount);
        exchangeRate = 37.5;
    }



    double toUAH() {
        return getAmount() * exchangeRate ;
    }

    @Override
    void printAmount() {
        System.out.println("$" + getAmount());
    }


    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}

