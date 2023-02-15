import java.util.Scanner;

public class HW16 {
    public static void main(String[] args) {
        double [][] matA = {{1,2,4},{4,5,7},{7,8,11}};
        double [][] matB = {{10,20,50},{40,60,70},{70,90,110}};
        double [][] matC = {{0,0,0},{0,0,0},{0,0,0}};
        double [][] matD = {{6,7,8},{14,8,21},{9,7,0}};
        boolean loop = true;

        while (loop == true) {
            System.out.println("");
            Scanner direct = new Scanner(System.in);
            System.out.print("What Would You Like To Do: ");
            String switchCase = direct.nextLine();

            switch(switchCase) {

                case "add":
                System.out.println("");
                System.out.println("C = A + B");
                System.out.println("");

                matC = addMat(matA, matB);

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matC[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;



                case "subtract":
                System.out.println("");
                System.out.println("C = A - B");
                System.out.println("");

                matC = subMat(matA, matB);

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matC[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;



                case "multiply":
                System.out.println("");
                System.out.println("C = A X B");
                System.out.println("");

                matC = multiMat(matA, matB);

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matC[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;



                case "x":
                System.out.println("");
                System.out.println("X = AB - BA");
                System.out.println("");

                matC = subMat(multiMat(matA, matB),multiMat(matB, matA));

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matC[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;



                case "y":
                System.out.println("");
                System.out.println("Y = 2AB + 0.5A");
                System.out.println("");

                matC = addMat(sclMat(2, multiMat(matA, matB)),sclMat(0.5, matA));

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matC[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;



                case "z1":
                System.out.println("");
                System.out.println("Z1 = (AB)C");
                System.out.println("");

                matC = multiMat(multiMat(matA, matB), matD);
                

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matC[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;



                case "z2":
                System.out.println("");
                System.out.println("Z2 = A(BC)");
                System.out.println("");

                matC = multiMat(matA,multiMat(matB, matD));

                for (int i=0; i < matA.length; i++) {
                    for (int j=0; j < matB[i].length; j++) {
                        System.out.print(matC[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                break;







                default:
                System.out.println("");
                System.out.println("Error");
                System.out.println("");
                break;
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

    public static double[][] multiMat(double [][] matA, double[][] matB) {
        double[][] matC = new double [matA.length][matB[0].length];

        for (int i=0; i < matA.length; i++) {
            for (int j=0; j < matB[0].length; j++) {
                double show = 0;
                for (int k=0; k < matA[j].length; k++) {
                    show += matA[i][k] * matB[k][j];
                    matC[i][j] = show;
                }
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