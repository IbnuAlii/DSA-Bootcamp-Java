import java.util.Scanner;

public class largestnumberfromall {
    public static void main(String[] args) {
    int ans = userInputSum();
        System.out.println(ans);
    }
    static int userInputSum(){
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        int num;

        do{
            System.out.println("Enter the number: ");
            num = sc.nextInt();
            System.out.println("Enter 0 to end the loop");
            sum += num;
        }while (num > 0);

        System.out.println("Sum is "+ sum);
        return -1;
    }
}
