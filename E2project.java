package Project1;

public class E2project {
    public static void main(String[] args) {
         int total=0;
        int[][]  matr= {

                {25,35,66,45}
        };
         for (int row=0;row< matr.length;row++){
             for (int col=0;col<matr[row].length;col++) {
                 total = total + matr[row][col];
             }
         }
        System.out.println(total);
        }
}
