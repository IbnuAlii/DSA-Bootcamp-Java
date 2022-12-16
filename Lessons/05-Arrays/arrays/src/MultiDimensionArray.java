import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9

        syntax

        one dimension array is defined like this
        int[]
        two dimension array is defined like this
        int [][]

        int [] arr = new int [num of rows][num of columns];
                adding num of rows must ; while number of columns is optional.
         */
//    int[][] arr = new int[3][];
//    int [][] arr2dimension = {
//            {1, 2, 3}, //0th index
//            {4, 5, 6}, // 1st index
//            {7, 8, 9} // 2nd index -> arr2dimension[2]={7,8,9}
//                                // -> arr2dimension[2][0] = {7}
//    };
        int [][] arr = new int[3][3];
        //System.out.println(arr.length); // it gives as number of rows.
    // input
        for (int row = 0; row < arr.length; row++) {
            // for each column in each row
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

    // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each column in each row
//            for (int col = 0; col < arr.length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

//        // another way.
//        for (int row=0; row<arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // for each loop
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
