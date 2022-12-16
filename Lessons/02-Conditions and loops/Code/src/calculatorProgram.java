import java.util.Scanner;

public class calculatorProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take input from user till user does not press X or x
        int ans = 0;
        while (true){
            // take the operator as input
            System.out.print("Enter th Operator: ");
            char operator = input.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (operator == '+'){
                    ans = num1 + num2;
                }
                if (operator == '-') {
                    ans = num1 - num2;
                }
                if (operator == '*'){
                    ans = num1 * num2;
                }
                if (operator == '/'){
                    if (num2 != 0)
                        ans = num1 / num2;
                }
                if (operator == '%'){
                    ans = num1 % num2;
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            }else {
                System.out.println("Invalid Operation !!");
            }
            System.out.println(ans);
        }
    }
}
