public class Conner {

    public static void printMat(double[][] matrix) {


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

    public static void printMat(int[][] matrix) {
        System.out.println();
        System.out.println("Your Result Is: ");
        System.out.println();

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.print("   ");
            System.out.println("");
        }

        System.out.println();
        
    }

    public static void printMat(char[][] matrix) {
        System.out.println();
        System.out.println("Your Result Is: ");
        System.out.println();

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print("   ");

        }

        System.out.println();

    }

    public static void printMat(String[][] matrix) {
        System.out.println();
        System.out.println("Your Result Is: ");
        System.out.println();

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.print("   ");
            System.out.println();

        }

        System.out.println();

    }

    public static double multiply(double firstValue, double secondValue) {
        double result = firstValue * secondValue;
        System.out.println();
        System.out.println("Your Answer is: " + result);
        System.out.println();
        return result;
    }

    public static int multiply(int firstValue, int secondValue) {
        int result = firstValue * secondValue;
        System.out.println();
        System.out.println("Your Answer is: " + result);
        System.out.println();
        return result;
    }

    public static double[][] multiply(double[][] matrixA, double[][] matrixB) {
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

    public static double[][] multiply(double[][] matrix, double scalar) {
        double [][] result = new double[matrix.length][matrix[0].length];
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                result[i][j] = scalar*matrix[i][j];
            }
        }
        return result;
    }

    public static double[][] multiply(double scalar, double[][] matrix) {
        double [][] result = new double[matrix.length][matrix[0].length];
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                result[i][j] = scalar*matrix[i][j];
            }
        }
        return result;
    }

    private static double[][] minor(double[][] matrix, int row, int column) {
		double[][] minor = new double[matrix.length - 1][matrix.length - 1];

		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; i != row && j < matrix[i].length; j++)
				if (j != column)
					minor[i < row ? i : i - 1][j < column ? j : j - 1] = matrix[i][j];
		return minor;
    }
    
    private static double determinant(double[][] matrix) {
		if (matrix.length != matrix[0].length)
			throw new IllegalStateException("invalid dimensions");

		if (matrix.length == 2)
			return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

		double det = 0;
		for (int i = 0; i < matrix[0].length; i++)
			det += Math.pow(-1, i) * matrix[0][i]
					* determinant(minor(matrix, 0, i));
		return det;
    }
    
    public static double[][] inverse(double[][] matrix) {
		double[][] inverse = new double[matrix.length][matrix.length];

		// minors and cofactors
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				inverse[i][j] = Math.pow(-1, i + j)
						* determinant(minor(matrix, i, j));

		// adjugate and determinant
		double det = 1.0 / determinant(matrix);
		for (int i = 0; i < inverse.length; i++) {
			for (int j = 0; j <= i; j++) {
				double temp = inverse[i][j];
				inverse[i][j] = inverse[j][i] * det;
				inverse[j][i] = temp * det;
			}
		}

		return inverse;
    }
    
    public static double[][] add(double[][] matrixA, double[][] matrixB) {

        double[][] result = new double[matrixA.length][matrixB[0].length];
    
        for (int i=0; i < matrixA.length; i++) {
            for (int j=0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
            return result;
    }

    public static String[][] toHex(int[][] matrix) {
        String[][] hexString = new String[matrix.length][matrix[0].length];

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                hexString[i][j] = Integer.toHexString(matrix[i][j]);
            }
        } 
        return hexString;
    }

    public static String[][] toHex(double[][] matrix) {
        String[][] hexString = new String[matrix.length][matrix[0].length];

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                hexString[i][j] = Double.toHexString(matrix[i][j]);
            }
        } 
        return hexString;

    }

    public static double[][] fromHex(String[][] hexMatrix) {
        double[][] hexResult = new double[hexMatrix.length][hexMatrix[0].length];

        for (int i=0; i < hexMatrix.length; i++) {
            for (int j=0; j < hexMatrix[i].length; j++) {
                hexResult[i][j] = Integer.parseInt(hexMatrix[i][j], 16);
            }
        } 
        return hexResult;

    }

    


    public static void main(String[] args) {
        int[][] matA = {{1,2500,91},{9,72,6},{9,1,33}};
        String[][] result = Conner.toHex(matA);
        Conner.printMat(result);


        
    
    }

}