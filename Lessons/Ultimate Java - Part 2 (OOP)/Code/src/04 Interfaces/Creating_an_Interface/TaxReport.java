package B.Creating_an_Interface;

public class TaxReport {
    private TaxCalculator2022 calculator;

    public TaxReport(){
        calculator = new TaxCalculator2022(100_000);
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
