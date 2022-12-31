public class NumberOfDigit {
    public static void main(String[] args) {
        System.out.println("Number of digits : "+digits(998878));
        System.out.println("Number of digits : "+digits2(998878));
        System.out.println("Number of digits : "+digits2(-998878));

    }


    static int digits2 (int num){
        //negative
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }


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

