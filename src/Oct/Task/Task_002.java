
package Oct.Task;

public class Task_002 {

    public static void main(String[] args) {
        // find largest of three number using ternary Operator

        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // A -> ++a -> Exp1 -> 11, a-> 11
        // B -> a++ -> Exp2 -> 11 , a -> 12
        // C ->  a++ -> Exp3 -> 12 ,  a -> 13

        //  A+B+C -> 34 , a -> 13
    }
}