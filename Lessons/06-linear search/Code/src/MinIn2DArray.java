public class MinIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,9},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 56;
        int ans = min(arr);
        System.out.println(min(arr));
    }

     static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min){
                   min = arr[row][col];
                }
             }
         }
         return min;
    }
}
