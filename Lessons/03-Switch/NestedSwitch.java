import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int empId= in.nextInt();
//        String department = in.next();
//        switch (empId){
//            case 1:
//                System.out.println("Mohan");
//                break;
//            case 2:
//                System.out.println("Ibnu Ali");
//                break;
//            case 3:
//                System.out.println("Emp Number 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department");
//                }
//                break;
//            default:
//                System.out.println("Enter correct employee ID");
//        }

        // better way to write
        int empId= in.nextInt();
        String department = in.next();
        switch (empId) {
            case 1 -> System.out.println("Mohan");
            case 2 -> System.out.println("Ibnu Ali");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct employee ID");
        }
    }
}
