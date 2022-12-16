import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        // Q Find the largest of the 3 numbers.
//        int max = a;
//        if (b> max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

        // another way
//        int max = 0;
//        if (a > b){
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c >  max) {
//            max = c;
//        }
//        System.out.println(max);

        // another 3rd way
//        int max = math.max(c, math.max(a,b));
//        System.out.println(max);
    }
}
