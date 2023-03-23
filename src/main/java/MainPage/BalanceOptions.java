package MainPage;

public class BalanceOptions {

    public static Balance getBalance(String productCode) {


        Balance myBalance = null;
        if (productCode.equalsIgnoreCase("Revolut")) {
            myBalance = new Balance();
            myBalance.setPrice(57.86);

        } else if (productCode.equalsIgnoreCase("Bank of ireland")) {
            myBalance = new Balance();
            myBalance.setPrice(400.12);
        }

        return myBalance;
    }
}
