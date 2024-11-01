package Oct.Oct281024Strings;

public class Lab45SwapString {

    public static void main(String[] args) {

       String a = "Hello";
       String b = "World";
        System.out.println("Before Swap :" + a+b);
        System.out.println(a.length());
        System.out.println(b.length());

        //rough logic
        // a+b AppleGuava =
        a=a+b;
        System.out.println(a.length());
        b =a.substring(0,a.length()-b.length()); // holds "hello"
        a= a.substring(b.length());
        System.out.println("After Swap :" + a+b);

    }
}
