package MainPage;

public class BalanceOptions {

    public static Balance getBalance(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or datamyBookase
        // For now, this code just uses if/else statements
        // to return the correct product data


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
