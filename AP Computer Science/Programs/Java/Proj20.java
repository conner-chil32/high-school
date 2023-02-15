public class Proj20 {

    public static void main(String[] args) {

        double scalar = 5;
        char[][] message = {{'I','l','o'},{'v','e','A'},{'P','C','S'}};
        
        double[][] matA1 = {{5,2,3},{2,3,6},{9,2,1}};
        char[][] message1 = {{'E','d','w','a'},{'r','d','i','s'},{'c','o','o','l'}};
        double[][] matA2 = {{3,1,-3},{9,12,3},{7,2,8}};
        char[][] message2 = {{'J','o','h','n'},{'l','i','k','e'},{'s','f','o','x'}};

        System.out.println();
        System.out.println("#4.1");
        MultiplyClass cyrptObj1 = new MultiplyClass(scalar, message);
        cyrptObj1.printDecodedMessage();

        System.out.println();

        System.out.println();
        System.out.println("#4.2");
        MultiplyClass cyrptObj2 = new MultiplyClass(message, scalar);
        cyrptObj2.printDecodedMessage();

        System.out.println();

        System.out.println();
        System.out.println("#4.3");
        MultiplyClass cryptObj3 = new MultiplyClass(matA1, message1); 
        cryptObj3.printDecodedMessage();

        System.out.println();

        System.out.println();
        System.out.println("#4.4");
        MultiplyClass cryptObj4 = new MultiplyClass(matA2, message2); 
        cryptObj4.printDecodedMessage();
        System.out.println();
        System.out.println();



        


        

    }
}