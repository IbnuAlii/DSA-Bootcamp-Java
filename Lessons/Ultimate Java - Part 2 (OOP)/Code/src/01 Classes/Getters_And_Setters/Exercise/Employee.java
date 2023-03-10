package Getters_And_Setters.Exercise;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage (int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
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

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
