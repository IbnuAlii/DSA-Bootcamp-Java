import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
    /*
     syntax of for loop
     for(initialisation; condition; increment/Decrement) {
            //body
     }
     */
//        for (int num = 1; num != 6; num++){
//            System.out.println(num);
//        }
//    }
//            //print numbers from 1 to n
//            Scanner in = new Scanner(System.in);
//            int n= in.nextInt();
//            for (int i = 0; i < n; i++) {
//                System.out.println(i);
//            }

//        Scanner input = new Scanner(System.in);
//        int n= input.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Hello World");
//        }

        // while loops
        /*
        syntax of while loop is:
        while (condition){
            //body
        }
         */
//        int num=1;
//        while (num<=5){
//            System.out.println(num);
//            num++;
//        }

        // do while loop
        /*
        syntax
        do {
          //do this
        } while (condition)
         */
        int n=1;
        do{
            System.out.println(n);
            n++;
        } while (n<10);
    }
}
