//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findnumber(nums));
        System.out.println("Number of digits are : "+digits(123456789));
        // for negative number
        System.out.println("Number of digits are : "+digits(-123456789));
        System.out.println("Number of digits are : "+digits(0));
    }
    static int findnumber(int[] nums){
        int count =0;
        for(int num: nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digits or not

    // how can we do that:
//    1. Count the number of digit
//    2. Convert the number of digit to a string and take the length of it
     static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0){

            return true;
        }
        return false

         */
         return numberOfDigits % 2 == 0;
     }

    //Count number of digits in a number
    static int digits(int num){
        // if the number is 0 the answer is 1 because 0 a digit
        if (num == 0){
            return 1;
        }
        // if the number is negative convert it into negative
        if (num < 0){
            num = num * -1;
        }


        int count =0;

        while (num >0){
            count++;
            num = num /10 ;
        }

        return count;
    }
}
