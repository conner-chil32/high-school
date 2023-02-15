public class MultiplyClass {

    char[][] message; //message
    double scalar;
    double scalar2;
    double[][] matA; //encoding matrix
    double[][] matB; //message matrix
    double[][] matC; //encoded matrix
    double[][] matD; //decoded matrix
    
    public MultiplyClass() {

    }

    public MultiplyClass(double scalar, char[][] message) {
        this.scalar = scalar;
        this.message = message;
        this.matB = messageToMatrix(message);
        this.matC = Conner.multiply(scalar, matB);
        this.matD = Conner.multiply(1/scalar, matC);

    }

    public MultiplyClass(char[][] message, double scalar) {
        this.scalar = scalar;
        this.message = message;
        this.matB = messageToMatrix(message);
        this.matC = Conner.multiply(scalar, matB);
        this.matD = Conner.multiply(1/scalar, matC);

    }

    public MultiplyClass(double[][] matA, char[][] message) {
        this.matA = matA;
        this.message = message;
        this.matB = messageToMatrix(message);
        this.matC = Conner.multiply(matA, matB);
        this.matD = Conner.multiply(Mat.inverse(matA), this.matC);
    }

    public double[][] messageToMatrix(char[][] message) {
        double[][] result = new double[message.length][message[0].length];

        for (int i=0; i < result.length; i++) {
            for (int j=0; j < result[i].length; j++) {
                result[i][j] = (double)(message[i][j]);
            }
        }
        return result;

    }

    public void printMatrix() {
        for (int i=0; i < matB.length; i++) {
            for (int j=0; j < matB[0].length; j++) {
                System.out.print(" " + matB[i][j]);
            }
            System.out.println();
        }
    }

    public void printDecodedMessage() {
        double[][] result = new double[matD.length][matD[0].length];

        for (int i=0; i < matD.length; i++) {
            for (int j=0; j < matD[0].length; j++) {
                result[i][j] = Math.round(matD[i][j]);
                System.out.print(" " + (char) result[i][j]);
            }
            System.out.print("  ");
        }

    }




}