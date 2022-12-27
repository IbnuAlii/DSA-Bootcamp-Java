package Comparing_Objects;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1 == point2);
        // we get false because both these points are reference types so the values that are stored in these variables are the address of point objects in memory.
        // here we are dealing with two different point objects, that's why we have two different values inside these variables.
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(new TextBox()));
        System.out.println(point1.equals(point1));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
}