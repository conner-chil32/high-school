
public class HW18 {
    public static void main(String [] args) {
        char [][] message = {{'H','o','w'},{'A','r','e'},{'Y','o','u'}};
        double [][] matB = {{0,0,0},{0,0,0},{0,0,0}};
        double [][] matA = {{3,5,3},{1,8,9},{5,9,2}};
        //Xaree's Code
        double [][] matE = {{1242.0,1510.0,1444.0},{1822.0,1926.0,1832.0},{612.0,623.0,613.0}};
        double [][] key = {{8,2,4},{4,6,8},{1,4,1}};

        
        System.out.println();
        System.out.println("Base String");
        System.out.println();
        for (int i=0; i < matB.length; i++) {
            for (int j=0; j < matB[i].length; j++) {
                matB[i][j] = (double)(message[i][j]);
                System.out.print((char)matB[i][j]);
            }
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Encoded Message");
        System.out.println();
        double [][] matC = Mat.multiply(matA, matB);

        for (int i=0; i < matA.length; i++) {
            for (int j=0; j < matB[i].length; j++) {
                System.out.println(matC[i][j]);

            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("Decoded Message");
        System.out.println();
        double [][] matD = Mat.multiply(Mat.inverse(matA), matC);

        
        for (int i=0; i < matD.length; i++) {
            for (int j=0; j < matD[i].length; j++) {
                System.out.print((char)matD[i][j]);
            }
            System.out.print(" ");
        }
        System.out.println();



        System.out.println();
        System.out.println("Xaree's Code");
        System.out.println();

        try {

        double [][] matF = Mat.multiply(Mat.inverse(key), matE);

            for (int i=0; i < matF.length; i++) {
                for (int j=0; j < matF[i].length; j++) {
                    System.out.print((char)matF[i][j]);
                }
                System.out.print(" ");
            }
        }
        catch (Exception e) {
            System.out.println("error");
        }



        

    }

        




}
