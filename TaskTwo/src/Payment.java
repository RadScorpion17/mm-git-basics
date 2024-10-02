public class Payment {
    private double LeaseAmount;
    private double InitialPaymentAmount;
    private double Interest;
    Integer LeaseMonths;

    public Payment(double LeaseAmount, double InitialPaymentAmount, double Interest, Integer LeaseMonths) {
        this.LeaseAmount = LeaseAmount;
        this.InitialPaymentAmount = InitialPaymentAmount;
        this.Interest = Interest;
        this.LeaseMonths = LeaseMonths;
    }

    public double getMonthlyPayment() {

        Double monthlyPayment = ((LeaseAmount - InitialPaymentAmount) +
                ((LeaseAmount - InitialPaymentAmount) * Interest/100))/LeaseMonths;

        return Math.round(monthlyPayment * 100)/100.0;
    }
}
