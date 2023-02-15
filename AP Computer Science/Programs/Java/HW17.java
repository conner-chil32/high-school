import java.util.Arrays;


public class HW17 {
    public static void main(String[] args) {
        double [][] matA = {{1,5,12,3},{3,5,18,8},{2,8,7,9}};
        double [][] matB = {{7,15,4},{2,5,7},{7,12,1},{7,8,1}};
        double [][] matC = new double[0][0];
        double [][] matD = {{6,23,8},{9,12,3},{6,17,2}};
        double [][] matE = {{2,8,19},{7,9,10},{18,9,10}};
        double [][] matF = {{2,3,8,9},{12,6,23,9},{7,9,16,8},{9,21,17,5}};
        double [][] matG = new double[0][0];
        double [][] matH = new double[0][0];
        

        //M = AB
        try {
            System.out.println("");
            System.out.println("M = AB");
            matC = HW16.multiMat(matA, matB);
            for (double [] i : matC) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("There has been an error running this line");
        }


        //Inverse matA(4x4)
        try {
            System.out.println();
            System.out.println("");
            System.out.println("Inverse 4x4");
            matC = Mat.inverse(matF);
            for (double [] i : matC) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("There has been an error running this line");
        }

        
        //X1 = A * inverseA
        try {
            System.out.println();
            System.out.println("");
            System.out.println("X1 = A * inverseA");
            matC = Mat.multiply(matD, Mat.inverse(matD));
            for (double [] i : matC) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("There has been an error running this line");
        }


        //X2 = inverseA * A
        try {
            System.out.println();
            System.out.println("");
            System.out.println("X2 = inverseA * A");
            matC = Mat.multiply(Mat.inverse(matD), matD);
            for (double [] i : matC) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("There has been an error running this line");
        }
        

        //Y1 = A * B
        try {
            System.out.println();
            System.out.println("");
            System.out.println("Y1 = A*B");
            matG = Mat.multiply(matD, matE);
            for (double[] i : matG) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("There has been an error running this line");
        }



        //Y2 = inverseA * Y1
        try {
            System.out.println();
            System.out.println("");
            System.out.println("Y2 = inverseA*Y1");
            matH = Mat.multiply(Mat.inverse(matD), matG);
            for (double[] i : matH) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("There has been an error running this line");
        }
            


        //Y3 = Y2 - B
        try {
            System.out.println();
            System.out.println("");
            System.out.println("Y3 = Y2-B");
            matC = HW16.subMat(matH, matE);
            for (double[] i : matC) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("There has been an error running this line");
        }



    }
}
