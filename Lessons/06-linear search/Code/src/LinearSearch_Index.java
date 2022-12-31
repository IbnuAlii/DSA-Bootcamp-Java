public class LinearSearch_Index {
    public static void main(String[] args) {
        int[] numbs = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearSearch(numbs,target);
        System.out.println(ans);
    }
    // Search in the array: return the index if item is found
    // otherwise if item not found return -1.
    static int linearSearch (int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence thr target not found.
        return -1;
    }
}