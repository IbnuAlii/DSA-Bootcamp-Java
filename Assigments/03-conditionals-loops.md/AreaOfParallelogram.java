import java.util.Scanner;
public class AreaOfParallelogram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter base of parallelogram: ");
        double base = sc.nextDouble();
        System.out.println("Please enter height of parallelogram: ");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println("Area of parallelogram is: " + area);
        sc.close();
    }
}