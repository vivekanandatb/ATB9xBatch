package Oct.Oct281024Strings;

import com.sun.jdi.IntegerValue;
import org.w3c.dom.ls.LSOutput;

public class ConvertStringtoInt {
    public static void main(String[] args) {


    String str = "123";
    int num = Integer.parseInt(str);
        System.out.println(num);

        // Verify String contains only digits
        String s1 = "12345";
        boolean numeric =s1.matches("\\d+");
        System.out.println(numeric);

        // Splite method
        String s2 = "a,b,c";
        String[] parts = s2.split(",");
        System.out.println(parts[1]);

        // Substring

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15); // 11 to 14 (actual)
        System.out.println(roar);



        String s5 = "hello";
       char[] charArray =  s5.toCharArray();
        System.out.println(s5);

        // Replace and Replace all

        String origina= "banana";
       String res1= origina.replace('a','v');
        System.out.println(res1);


        String original1 = "Hello123 World456!";
        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);




    }
}