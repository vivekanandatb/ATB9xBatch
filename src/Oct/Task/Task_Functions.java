package Oct.Task;

import java.util.Scanner;

public class Task_Functions {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number1");
        int a = scanner.nextInt();

        System.out.println("Enter the number 2");
        int b = scanner.nextInt();

        int res1 = sum(a,b);
        System.out.println("Addition " + res1);

        int res2 = sub(a, b);
        System.out.println("Substraction "+ res2);

        int res3 = mul(a, b);
        System.out.println("multiplication" + res3);

        int res4 = div(a, b);
        System.out.println("Division "+ res4);



    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
}
