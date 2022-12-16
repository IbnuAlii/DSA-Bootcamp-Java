import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String word= "Hello";
//        System.out.println(word.charAt(2));
//        //charAt(0) means character at index 0

        char h=input.next().trim().charAt(0);

        if (h >= 'a' && h <='z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }

    }
}
