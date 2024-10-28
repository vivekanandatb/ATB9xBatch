package Oct.Oct251024Strings;

public class Lab36Strings {
    public static void main(String[] args) {
        String s1= "Hello";// SCP String Constant pool new string will create
        String s4 = "Hello";

        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello");
        String s6 = new String("Hello");
        String s5 = new String("Hello");


        System.out.println(s1 == s3);
        System.out.println(s1==s4);


    }
    }