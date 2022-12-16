public class swap {
    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        //swap numbers code
//        int temp = a;
//        a= b;
//        b = temp;
//        System.out.println("a = "+a+"  "+"b = "+b);

       int ans = swap(a,b);
        System.out.println(ans);

    }
    static int swap (int num1,int num2){
        int temp = num1;
         num1 = num2;
         num2 = temp;
         return temp;

    }
}
