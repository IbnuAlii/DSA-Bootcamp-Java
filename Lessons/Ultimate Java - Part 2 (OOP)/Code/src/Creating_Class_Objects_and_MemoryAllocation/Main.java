package Creating_Class_Objects_and_MemoryAllocation;

public class Main {
    public static void main(String[] args) {
         var textbox1 = new TextBox();
         textbox1.setText("Box 1");
        System.out.println(textbox1.text);

        var textbox2 = new TextBox();
        textbox2.setText("Box 2");
        System.out.println(textbox2.text);
    }
}