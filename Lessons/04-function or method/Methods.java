import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // Q:  take the input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);

        System.out.print("Enter NUmber 1: ");
        int num1= in.nextInt();
        System.out.print("Enter Number 2: ");
        int num2= in.nextInt();
        int sum= num1 + num2;
        System.out.println("The sum = "+ sum);
    }
}
