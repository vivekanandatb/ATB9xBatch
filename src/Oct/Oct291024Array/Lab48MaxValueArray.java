package Oct.Oct291024Array;

public class Lab48MaxValueArray {
    public static void main(String[] args) {
        int[] marks = {30, 50, 40, 69,79, 78,98,35};
        int maxvalue = maxvalue(marks);
        System.out.println("Maximum marks is "+ maxvalue);


    }


    static int maxvalue(int[] marks){
        int max=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        return max;


    }
}
