import java.util.Scanner;

public class Assigment_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency in rupees: ");
        float rupees=input.nextFloat();
        float us= rupees*0.012f;
        System.out.println("USD= "+ us);

    }
}
