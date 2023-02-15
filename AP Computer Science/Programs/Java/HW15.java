import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        double [][] matA = {{1,2,3},{4,5,6},{7,8,9}};
        double [][] matB = {{10,20,30},{40,50,60},{70,80,90}};
        double [][] matC = {{0,0,0},{0,0,0},{0,0,0}};
        int loop = 1;

        while (loop == 1) {

            System.out.println("");
            Scanner input = new Scanner(System.in);
            System.out.print("What Would You Like To Do: ");
            String switchCase = input.nextLine();

            switch(switchCase) {
                case "add": 
                    matC= addMat(matA, matB);
                    System.out.println("");
                    System.out.println("Returning 2D Array");
                    System.out.println("C = A + B");
                    System.out.println("");

                    for (int i=0; i < matA.length; i++) {
                        for (int j=0; j < matB[i].length; j++) {
                            System.out.print(matC[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                
                case "subtract":
                    matC= subMat(matA, matB);
                    System.out.println("");
                    System.out.println("Returning 2D Array");
                    System.out.println("C = A - B");
                    System.out.println("");

                    for (int i=0; i < matA.length; i++) {
                        for (int j=0; j < matB[i].length; j++) {
                            System.out.print(matC[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;

                case "scalar":
                    matC= sclMat(2, matA);
                    System.out.println("");
                    System.out.println("Returning 2D Array");
                    System.out.println("C = A X B");
                    System.out.println("");

                    for (int i=0; i < matA.length; i++) {
                        for (int j=0; j < matB[i].length; j++) {
                            System.out.print(matC[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;

                case "matrixA":
                System.out.println("");
                System.out.println("Matrix A:");
                System.out.println("");

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matA[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;

                case "matrixB":
                System.out.println("");
                System.out.println("Matrix B:");
                System.out.println("");

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matB[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;
                

                    
                
                case "end":
                    loop = 2;
                    break;

                default:
                    System.out.println("Input Not Accepted");
            }
        }      

    }

    public static double[][] addMat(double[][] matA, double[][] matB) {
        double[][] matC = {{0,0,0},{0,0,0},{0,0,0}};

        for (int i=0; i < matA.length; i++) {
            for (int j=0; j < matA[i].length; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        return matC;
    }

    public static double[][] subMat(double[][] matA, double[][] matB) {
        double[][] matC = {{0,0,0},{0,0,0},{0,0,0}};

        for (int i=0; i < matA.length; i++) {
            for (int j=0; j < matA[i].length; j++) {
                matC[i][j] = matA[i][j] - matB[i][j];
            }
        }
        return matC;
    }

    public static double[][] sclMat(double scalar, double[][] matA) {
        double[][] matC = {{0,0,0},{0,0,0},{0,0,0}};

        for (int i=0; i < matA.length; i++) {
            for (int j=0; j < matA[i].length; j++) {
                matC[i][j] = scalar*matA[i][j];
            }
        }
        return matC;
    }
}