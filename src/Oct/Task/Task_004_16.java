package Oct.Task;

import java.util.Scanner;

public class Task_004_16 {

    public static void main(String[] args) {
        // Take a user input - Name, Age and Salary and print them in the end.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String Name = scanner.nextLine();

        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        scanner.close();
    }
}