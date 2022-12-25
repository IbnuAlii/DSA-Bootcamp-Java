package Creating_Class_Objects_and_MemoryAllocation;

public class TextBox {
    public String text = "";  // Field

    public void setText (String text){
        this.text = text;
    }
    public void clear(){
        text = "";
    }
}
