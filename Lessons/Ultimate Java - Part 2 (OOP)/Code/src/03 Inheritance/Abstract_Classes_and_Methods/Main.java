package Abstract_Classes_and_Methods;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox()};
        for (var control : controls){
            control.render();
        }
    }
}