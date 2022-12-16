import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sumOfValues();
        System.out.println(ans);
    }
    static int sumOfValues(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
