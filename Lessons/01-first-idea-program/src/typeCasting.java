import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1) outomatic conversion
        // converting integer to float automatically.
//        float num= input.nextFloat();
//        System.out.println(num);

        //2) type casting
//        int num = (int) (7578.76f);
//        System.out.println(num);

        // using input
//        int num = (int) (input.nextFloat());
//        System.out.println(num);

        //3) Automatic type promotion in expression
//        int a= 257;
//        byte b= (byte) (a); // the maximum value that can be stored in byte is 256;
//                            // so 257 % 256 = 1
//        System.out.println(b);

//        // letters can have a value, the value of 'a' in ASCII is 97
//        byte value='a';
//        System.out.println(value);


//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d= a * b / c;
//        System.out.println(d);

        //ASCII value
//        int number = 'A';
//        System.out.println(number);

        byte b= 42;
        char c= 'a';
        short s= 1024;
        int i = 50000;
        float f = 5.787f;
        double d = 0.1234;
        double result = (f * b) + (1 / c) - (d * s);
        System.out.println((f * b) + " "+(1 / c) + " "+ (d * s));
        // float + int - double = double.
        System.out.println(result) ;
    }
}
