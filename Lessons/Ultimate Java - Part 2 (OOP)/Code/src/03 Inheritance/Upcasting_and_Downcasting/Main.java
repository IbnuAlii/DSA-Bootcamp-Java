package Upcasting_and_Downcasting;

import Constructors_and_Inheritance.TextBox;
import Constructors_and_Inheritance.UIControl;



public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var texBox = new TextBox();
        show(control);
    }
    public static void show(UIControl control){
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}