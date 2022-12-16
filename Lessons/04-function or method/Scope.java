public class Scope {
    public static void main(String[] args) {
        int  a= 10;
        int b = 20;
        int sum= a +b;
        System.out.println(sum);
        // anything initialized here can access it anywhere or any block,

        for (int i = 0; i < 10; i++) {
            System.out.println(i);  // "i" cannot use outside of the block.
            // in here you cannot  initialize the same as the previous reference initialized one above.
            // in here you can reassign the origin ref variable  to some other value
            a=100;
            System.out.println(a);  // a will give 100;.
            int k=100;
                // values initialized in this block , will remain in block.
        }
    }
}
