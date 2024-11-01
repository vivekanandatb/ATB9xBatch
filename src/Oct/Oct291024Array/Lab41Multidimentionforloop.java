package Oct.Oct291024Array;

public class Lab41Multidimentionforloop {
    public static void main(String[] args) {
      int[][] num = {{12,34,43,56},{76,87,98,89}};
      int length = num.length;

      for(int i=0; i<length; i++){
          for(int j=0; j<num[i].length; j++){
              System.out.println(num[i][j]);
          }
          System.out.println(" ");
      }



    }
}
