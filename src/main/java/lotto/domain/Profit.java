package lotto.domain;

public class Profit {

    private double profitRate = 0;

    public double calculate(int totalMoney, PurchaseAmount purchaseAmount) {
        int money = purchaseAmount.getPurchaseAmount();
        profitRate = (double) totalMoney / money;
        return profitRate;
    }
}