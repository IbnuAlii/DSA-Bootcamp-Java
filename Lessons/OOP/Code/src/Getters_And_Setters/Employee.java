package Getters_And_Setters;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public int calculateWage (int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }


    // Setters
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    // Getters
    public int getBaseSalary(){
        return baseSalary;
    }
}
