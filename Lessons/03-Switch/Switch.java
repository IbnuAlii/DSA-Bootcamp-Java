import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter fruit: ");
//        String fruit = input.next();
//
//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("small fruit");
//            default:
//                System.out.println(" please enter a valid fruit");
//        }

        // enhanced switch statement.
//        int day=input.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
//        System.out.println(day);


        // without break
//        int day=input.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekend");
//                break;
//        }
//        System.out.println(day);

        // enhanced switch statement;
        int day=input.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }
        System.out.println(day);
    }
}
