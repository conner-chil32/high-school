public class HW11 {
    public static void main(String[] args) {
        System.out.println("File Working");

        int x = 10;
        int y = 20;
        System.out.println("X = " + x);
        System.out.println("Y = " + y); 

        int temp = x;

        x = y;
        y = temp;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}