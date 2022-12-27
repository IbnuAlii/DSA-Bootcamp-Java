package H.StaticMethods;

import C._ConstructorInjection.TaxCalculator;

public abstract class AbstractTaxCalculator implements TaxCalculator {
    protected double getTaxableIncome (double income, double expenses){
        return income - expenses;
    }
}
