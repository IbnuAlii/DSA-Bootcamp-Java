import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String args[]){
        double area, radius;
        System.out.println("Required packages have been imported");
        Scanner my_scanner= new Scanner(System.in);
        System.out.println("A Scanner object has been defined ");
        System.out.println("Enter the radius of the circle:");
        radius= my_scanner.nextDouble();
        area=(22*radius*radius)/7 ;
        System.out.println("The Area of Circle is: " + area);
    }
}