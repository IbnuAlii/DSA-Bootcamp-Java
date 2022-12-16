package com.javaprogramto.engineering.programs;

public class StringPalindromeReverse {

    public static void main(String[] args) {
        String input1 = "madam";
        String reversedString1 = reverseString(input1);

        if (input1.equals(reversedString1)) {
            System.out.println(input1 + " is a palindrome");
        } else {
            System.out.println(input1 + " is not a palindrome");
        }

        String input2 = "hello";
        String reversedString2 = reverseString(input2);

        if (input2.equals(reversedString2)) {
            System.out.println(input2 + " is a palindrome");
        } else {
            System.out.println(input2 + " is not a palindrome");
        }

    }

    private static String reverseString(String input) {

        StringBuffer buffer = new StringBuffer();
        buffer.append(input);

        return buffer.reverse().toString();
    }

}