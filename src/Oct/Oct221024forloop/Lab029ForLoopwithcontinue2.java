package Oct.Oct221024forloop;

public class Lab029ForLoopwithcontinue2 {

    public static void main(String[] args) {


        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println(i);
        }
    }


    }

