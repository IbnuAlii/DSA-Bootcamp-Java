package Creating_Class_Objects_and_MemoryAllocation;

public class MemoryAllocation {
    public static void main(String[] args) {
        var textbox1 = new TextBox();
        var textbox2 = textbox1;
        textbox2.setText("Hello World");
        System.out.println(textbox1.text);
    }
}
