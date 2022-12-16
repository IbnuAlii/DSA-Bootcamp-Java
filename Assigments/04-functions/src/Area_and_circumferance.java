public class Area_and_circumferance {
        public static void main(String args[])
        {
           double ans1 = area();
           double ans2 = circumference();

            System.out.printf("%.2f",ans1);
            System.out.printf("%.2f",ans2);
        }
    static double radius = 3;

    static double area(){
            //formula to calculate area of circle
            double area = Math.PI * (radius * radius);
            System.out.printf("Area is: %.2f", area);
            return area;

        }
        static double circumference(){
            //formula to calculate circumference of circle
            double circumference= Math.PI * 2*radius;
            System.out.printf( "\nCircumference is: %.2f",circumference) ;
            return circumference ;
        }

    }

