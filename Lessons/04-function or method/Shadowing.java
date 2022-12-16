public class Shadowing {
    static int x = 90; // this will be shadowed at line 8.
    public static void main(String[] args) {
        System.out.println(x); //90
        int  x = 40;
        // scope will begin where the value is initialised.
        System.out.println(x); //40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
