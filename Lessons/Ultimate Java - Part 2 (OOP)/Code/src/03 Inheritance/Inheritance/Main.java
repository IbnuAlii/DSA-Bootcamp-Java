package Inheritance;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl();
        var control1 = new TextBox();
        control1.setText("Ali");
        control.disable();
        // we get false because we disabled this control object.
        System.out.println(control.isEnabled());


        var box1 = new TextBox();
        var box2 = box1;
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        // check for equality
        System.out.println(box1.equals(box2));
        // this will return true because both these variable are referencing the same object
    }
}