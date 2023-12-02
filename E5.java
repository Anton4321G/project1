package Project1;

public class E5 {
    public static void main(String[] args) {
        int x=15;
        int y=45;
        System.out.println("Before swapping: X "+x+" Y "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping: X "+x+" Y "+y);
    }
}
