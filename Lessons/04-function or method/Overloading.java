import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        // here if i call function passing a number it will execute the function that  has int parameter
        // otherwise it will call the function which has string parameter
       int  ans = sum(68,56,5,65,56,56,45);
        System.out.println(ans);
//    fun();
//    }
//    //=> function over loading : two or more functions of the same name:
//    //	-  they can exist if the parameters are different.
//    static void fun(int a){
//        System.out.println(a);
//    }
//    static void fun(String name){
//        System.out.println(name);
    }
    static int sum(int a, int b){
        return a + b;
        // if i pass it two values this function will run
    }
    static int sum(int a, int b, int c){
        return a + b + c;
        // if i pass it three values this function will run
    }
    static int sum(int a, int b, int c, int...v){
        return a + b + c + v.length;
        // if i pass it multiple  values this function will run
    }

}
