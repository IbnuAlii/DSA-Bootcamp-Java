package Overriding_Methods;

import Inheritance.TextBox;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.setText("Hello World");
        System.out.println(textBox);
    }
}