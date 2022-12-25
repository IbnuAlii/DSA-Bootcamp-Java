package Moving_Away_from_Static_Members;

public class MortgateCalculator {

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgateCalculator(int principle, float annualInterest, byte years) {
        this.principal = principle;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public  double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = years * Main.MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public  double calculateMortgage() {

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = years * Main.MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public short getYears() {
        return years;
    }
}
