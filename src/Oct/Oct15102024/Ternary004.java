package Oct.Oct15102024;

import java.time.Clock;

public class Ternary004 {

    public static void main(String[] args) {
        // find largest of three number using ternary Operator
        int a=20;
        int b=49;
        int c=34;

        //rough logic (a>b && a>c) ->a : (b>c)-> b: c
        int result = (a>b && a>c)? a :(b>c? b: c);

        System.out.println("Max number is " + result);
    }
}