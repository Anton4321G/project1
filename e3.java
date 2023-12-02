package Project1;

public class e3 {
    public static void main(String[] args) {
       int [][] numbers={
               {10,54,12,13},
               {78,45,65,9},
               {42,41,38,7}
       };

       for (int row=0 ; row<numbers.length; row++ ) {
           for ( int col=0;col<numbers[row].length;col++){
               if (numbers[row][col] % 2 == 0) {
                   System.out.print(numbers[row][col]+" ");
               }

           }

        }

    }
}
