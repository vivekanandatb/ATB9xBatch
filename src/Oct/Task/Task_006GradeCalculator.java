package Oct.Task;

import java.util.Scanner;

public class Task_006GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks percentage");
        int percentage = scan.nextInt();

        if(percentage >=90 && percentage<= 100)
        {
            System.out.println("Grade A");
        }else if(percentage >= 80 && percentage <=89)
        {
            System.out.println("Grade B");
        }else if (percentage >=70 && percentage<=69)
        {
            System.out.println("Grade C");
        }else {
            System.out.println("Failed");
        }

    }
}
