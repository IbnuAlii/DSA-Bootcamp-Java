import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter Array Numbers: ");
//        int [] arr = new int[6];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//
//        // for each loop print the elements
//        for  (int num : arr) { // for every element in array,
//            System.out.print(num + " "); // here num represents elements of the array
//        }
//        //System.out.println(arr[7]);  // index out of bound error.



        //toString.
        int [] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
         arr [i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
