import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        while(number>0){
            sum+=number;
            number= sc.nextInt();

            if (number==0){
                break;
            }

        }
        System.out.println(sum);

    }
}