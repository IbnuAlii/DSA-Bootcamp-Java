import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The radius");
        double radius = input.nextDouble();

        double Area = CalculateArea(radius);
        System.out.println("The area of of the circle is: " + Area);
    }
    static double CalculateArea(double radius){
        return Math.PI * radius * radius;
    }
}
