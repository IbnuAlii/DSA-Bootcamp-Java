package A.Tightly_coupled_Code;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(){
        calculator = new TaxCalculator(100_000);
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
