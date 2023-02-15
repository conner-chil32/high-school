public class Multiply {


    public void printMat(double[][] matrix) {


        System.out.println();
        System.out.println(" Your Result Is: ");
        System.out.println();

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print("   " +matrix[i][j]);
            }
            System.out.print("   ");
            System.out.println("");
        }

        System.out.println();

    }

    //Number * Number
    public double Multi(double firstValue, double secondValue) {
        double result = firstValue * secondValue;
        System.out.println();
        System.out.println("Your Answer is: " + result);
        System.out.println();
        return result;

    }

    //Scalar Multiplication
    public double[][] Multi(double scl, double[][] matrix) {


        double [][] result = new double[matrix.length][matrix[0].length];


        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                result[i][j] = scl*matrix[i][j];
            }
        }
        return result;
    }
    

    //Scalar Multiplcation (inverse)
    public double[][] Multi(double[][] matrix, double scalar) {

        double [][] result = new double[matrix.length][matrix[0].length];


        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                result[i][j] = scalar*matrix[i][j];
            }
        }

        return result;


    }

    //Matrix Multiplication
    public double [][] Multi(double[][] matrixA, double[][] matrixB) {
        if(matrixA[0].length != matrixB.length){
            throw new IllegalArgumentException("Matrix Dimensions Invalid");
        } 

        double[][] result = new double [matrixA.length][matrixB[0].length];
        for (int i=0; i < matrixA.length; i++) {
            for (int j=0; j < matrixB[0].length; j++) {
                double show = 0;
                for (int k=0; k < matrixA[0].length; k++) {
                    show += matrixA[i][k] * matrixB[k][j];
                    result[i][j] = show;
                }
            }
        }
        return result;


    }
    
}





