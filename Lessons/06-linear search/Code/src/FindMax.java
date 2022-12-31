public class FindMax {
    public static void main(String[] args) {
        int[] arr= {18,12,3,7,14,28};
        System.out.println(max(arr));
    }
    //Assume arr.length != 0;
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
