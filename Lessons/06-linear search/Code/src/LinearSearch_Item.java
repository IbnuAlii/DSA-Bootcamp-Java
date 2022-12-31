public class LinearSearch_Item {
    public static void main(String[] args) {
        int[] numbs = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearSearch(numbs,target);
        System.out.println(ans);
    }

//    search the target and return the element
    static int linearSearch (int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence thr target not found.
        return Integer.MAX_VALUE;
    }
}