package ConstructorOverloading;

public class Main {
    public static void main(String[] args) {
        new Employee(10_000);
        var employee = new Employee(50_000,20);

        //static members
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }
}
