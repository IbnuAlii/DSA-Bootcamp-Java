package Method_Overloading;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);

    }

    public int calculateWage (int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }

    // sidan waaan samayn karnaa
//    public int calculateWage (){
//        return baseSalary ;
//    } ;
    // sidoo kale  sidan
    public int calculateWage () {
        return calculateWage(0);
    }
    // Setters
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    // Getters
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
