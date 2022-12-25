package Method_Overloading;

public class Main {
    public static void main(String[] args) {
        // we use constructors to initialize our objects
        // now our employee class has a custom constructor that takes two arguments
        var employee = new Employee(50_000,20);

        // halkani haddii uusan shaqaaluhu shaqayn sacvado dheeraad ah maxaan ka yeeleynaa?
        // 2 option ayaa noo furan
        // 1) inaan isticmaalno function overloading
        // 2) inaan dhisno parameter qaadanaya 0.
        // let go bac to our Employee class to do one of these options.

        // now we can call this method with parameters.
        int wage = employee.calculateWage(10);
        // or  without parameters
        int wage1  = employee.calculateWage();
        System.out.println(wage);

    }
}
