package I.PrivateMethods;

public class TaxCalculator2022 extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2022(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        return taxableIncome * 0.3;
    }
}

