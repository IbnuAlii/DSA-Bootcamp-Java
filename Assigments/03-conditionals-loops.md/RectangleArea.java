import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        // declare variables 
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;

        // create Scanner class object to read input
        Scanner scan = new Scanner(System.in);

        // read input
        System.out.print("Enter length of the rectangle:: ");
        length = scan.nextDouble();
        System.out.print("Enter width of the rectangle:: ");
        width = scan.nextDouble();

        // calculate area
        area = length * width;

        // display result
        System.out.println("Area of Rectangle = "+ area);

        // close Scanner class object
        scan.close();

    }
}