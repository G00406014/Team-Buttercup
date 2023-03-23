package MainPage;

import java.text.NumberFormat;

public class Balance {

    private double Balance;

    public Balance() {
        Balance = 0.0;
    }
    public void setPrice(double price) {
        this.Balance = Balance;
    }

    public double getBalance() {
        return Balance;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(Balance);
    }

    public String toDouble() {
        return  " your balance is  " + Balance;
    }
}
