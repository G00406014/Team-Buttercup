package MainPage;

import java.text.NumberFormat;

public class Balance {

    private Double Balance;
    String Code;


    public Balance() {
        Balance = 0.0;
        Code = "";

    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getCode() {
        return Code;
    }

    public void setBalance(double price) {
        this.Balance = Balance;
    }

    public double getBalance() {
        return Balance;
    }

    public String getBalanceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(Balance);
    }
}

