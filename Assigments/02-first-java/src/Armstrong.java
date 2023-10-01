import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range of numbers
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        scanner.close();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int number = start; number <= end; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int n = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }

        return sum == number;
    }
}
