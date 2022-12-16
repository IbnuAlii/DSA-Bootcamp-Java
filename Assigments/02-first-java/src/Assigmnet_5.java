import java.util.Scanner;

public class Assigmnet_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Numbers : ");
            int a= input.nextInt();
            int b= input.nextInt();
        int max = a;
        if (b > max){
            max = b;
        }
        System.out.println(max);
    }
}

