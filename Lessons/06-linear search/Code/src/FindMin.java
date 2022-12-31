public class FindMin {
    public static void main(String[] args) {
        int[] arr= {18,12,3,7,14,28};
        System.out.println(min(arr));
    }
    //Assume arr.length != 0;
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
