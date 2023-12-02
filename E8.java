package Project1;

public class E8 {
    public static void main(String[] args) {

        int[] numbers={10,20,30,45,55,45,69,20};
        int min= numbers[0];
        int max=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
        } for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                max=numbers[i];
            }
        } System.out.println(max);
         System.out.println(min);

         }
    }

