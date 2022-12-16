import java.util.Scanner;

public class PrdoductOfNumbers {
    public static void main(String[] args) {
        int ans = product();
        System.out.println("The product is "+ans);
    }
    static int product(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.println(" Enter Number 2: ");
        int num2 = in.nextInt();
        int prod = num1 * num2;
        return prod;
    }
}
