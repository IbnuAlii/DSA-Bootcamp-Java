package Overriding_Methods;

public class TextBox extends UIControl {
    // EXTENDS means inherits from UIControl
    // UIControl in term inherits from the object class
    private String text = "";  // Field

    // Constructor

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override
    public String toString(){
      return text;
    }

    public void setText (String text){
        this.text = text;
    }
    public void clear(){
        text = "";
    }
}
