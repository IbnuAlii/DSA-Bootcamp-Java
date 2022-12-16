import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        syntax
        ArrayList<Integer> list = new ArrayList <>();
         */
        ArrayList<Integer> list = new ArrayList <>(10);
//        list.add(34);
//        list.add(354);
//        list.add(3445);
//        list.add(3432);
//        list.add(244);
//        list.add(24);
//        list.add(114);
//        list.add(144);
//        list.add(2524);
//        list.add(64);
//        list.add(74);
//
//        //you can update
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);
//        // also you can remove
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));  // pass index here, list[index] syntax will not work here, hence use list.get(i)
        }
        System.out.println(list);
    }
}
