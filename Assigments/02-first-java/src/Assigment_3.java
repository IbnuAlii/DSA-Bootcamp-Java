import java.util.Scanner;

public class Assigment_3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = in.nextDouble();
        System.out.print("Enter Rate: ");
        double r = in.nextDouble();
        System.out.print("Enter Time: ");
        int t = in.nextInt();
        double amt = p;
        for (int i = 1; i <= t; i++){
            double interest = (amt * r * 1) / 100.0;
            amt += interest;
            System.out.println("Amount after " + i
                    + " year = " + amt);
        }
    }
}
