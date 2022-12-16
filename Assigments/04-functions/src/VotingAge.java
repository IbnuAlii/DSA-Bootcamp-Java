import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {

        int ans = Vote();
        System.out.println(ans);
    }
    static int Vote(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age=");
        int age = in.nextInt();
        if (age >=18){
            System.out.println("You are eligible for vote.");
        }
        else {
            System.out.println("You are not eligible for vote.");
        }
        return age;
    }
}
