package Oct16102024;

import java.util.Scanner;

public class JavaBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tue");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("thu");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("Sun");
                break;

            default:
                System.out.println("No days are present");
                break;


        }
        sc.close();
    }
}

