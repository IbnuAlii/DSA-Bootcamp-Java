import java.util.Scanner;

public class Assigment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int num=in.nextInt();
    if (num % 2==0){
        System.out.println("Even");
    }
    else {
        System.out.println("Odd");
    }
    }
}