import java.util.Scanner;
public class AreaOfIsoscelesTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of same sided: ");
        double a = sc.nextDouble();
        System.out.println("Please enter side2 of isosceles triangle: ");
        double b = sc.nextDouble();
        double area = (b/4) * Math.sqrt((4 * a * a) - (b * b));
        System.out.println("Area of isosceles triangle is: " + area);
        sc.close();
    }
}