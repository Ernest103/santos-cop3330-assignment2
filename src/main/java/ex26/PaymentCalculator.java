package ex26;

public class PaymentCalculator {
    private double dailyRate;

    public PaymentCalculator() {
        this.dailyRate = 0;
    }

    public int calculateMonthsUntilPaidOff(double bal, double apr, double mPayment){

        double months, helper1, helper2, helper3, helper4;
        dailyRate = apr / (365 * 100);

        helper1 = bal / mPayment;
        helper2 = Math.pow((1 + dailyRate), 30);
        helper3 = Math.log(1 + dailyRate);
        helper4 = Math.log(1 + helper1 * (1 - helper2));

        months = (-1 * helper4 / (helper3 * 30));

        return (int)Math.ceil(months);
    }
}
