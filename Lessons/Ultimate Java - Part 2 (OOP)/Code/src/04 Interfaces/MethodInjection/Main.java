package E.MethodInjection;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2022(100_000);
        var report = new TaxReport(calculator);
        // Method Injection
        report.show(calculator);
        report.show(new TaxCalculator2023());
    }
}