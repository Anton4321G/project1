package Project1;

public class E4 {
    public static void main(String[] args) {
        int [][] numbers={
                        {10,54,12,13},
                        {78,45,65,9},
                        {42,41,38,7}
                };
             int totale=0;
             int totalo=0;
                for (int row=0 ; row<numbers.length; row++ ) {
                    for ( int col=0;col<numbers[row].length;col++){
                        if (numbers[row][col] % 2 == 0) {
                           totale=numbers[row][col]+totale;

                        } else {
                            totalo=numbers[row][col]+totalo;
                        }

                    }

                }
        System.out.println( totale+" even" );
        System.out.println(totalo+" odd");
            }
    }

