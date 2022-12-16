import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
      Grade();

    }
    static int Grade() {
        Scanner in = new Scanner(System.in);
        int Marks = in.nextInt();
        if (Marks >= 91 && Marks <= 100){
            System.out.println("AA");
        } else if (Marks >= 81 && Marks <= 90) {
            System.out.println("AB");
        } else if (Marks >= 71 && Marks <= 80) {
            System.out.println("BB");
        } else if (Marks >= 61 && Marks <= 70) {
            System.out.println("BC");
        } else if (Marks >= 51 && Marks <= 60) {
            System.out.println("CD");
        } else if (Marks >= 41 && Marks <= 50) {
            System.out.println("DD");
        } else System.out.println("FAIL");
        return Marks;
    }
}
