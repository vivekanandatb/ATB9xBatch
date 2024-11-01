package Oct.Oct291024Array;

public class Arrayforeachmultidimention {
    public static void main(String[] args) {
        int[][] marks ={{65, 79,56,90},{23,56,67,87}};

        for(int [] row :marks){
            for(int i:row)
            System.out.println(i);
        }
    }
}
