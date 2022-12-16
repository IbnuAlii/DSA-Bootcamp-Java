import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = in.nextInt();
        if (age >18){
            System.out.println("You are eligible to vote ");
        }
        else {
            System.out.println("You are not eligible to vote ");
        }
    }
}