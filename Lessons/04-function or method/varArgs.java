import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
    fun(4652,2,21,2,1,12,25,521,51,512,51,51);
    multiple(67,11,"Mohamed","Ali","Nor");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));
    }
}
