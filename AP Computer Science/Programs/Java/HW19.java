public class HW19 {
    public static void main (String[] args) {
        double [][] matA = {{2.0, 3.0, 4.0, 5.0}, {5.0, 4.0, 3.0, 2.0},{1.0, 2.0, 1.0, 2.0}};
        double [][] matB = {{1.0, 3.0},{3.0, -2.0},{4.0, 1.0},{3.0, 5.0}};
        double [][] matC = {{2.0, 3.0, 1.0}, {2.0, 9.0, 2.0}};
        double [][] matD = {{6.0, 2.0, 1.0, 4.0},{0.0, 8.0, 1.0, 4.0},{8.0, 8.0, 2.0, 12.0},{1.0, 14.0, 18.0, 9.0}};
        double scl = 2; 
        double scl2 = 3.5;
        
        
        //2
        Multiply MultiplyObj = new Multiply();
        System.out.println("Section: 2");
        
        //2.1
        System.out.println("#2.1");
        MultiplyObj.Multi(scl, scl2);

        //2.2
        System.out.println("#2.2");
        double[][] a = MultiplyObj.Multi(scl, matA);
        MultiplyObj.printMat(a);


        //2.3
        System.out.println("#2.3");
        double[][] b = MultiplyObj.Multi(matA, scl);
        MultiplyObj.printMat(b);


        //2.4
        System.out.println("#2.4");
        double[][] c = MultiplyObj.Multi(matA, matB);
        MultiplyObj.printMat(c);
        System.out.println("_______________________");



        //3
        Multiply MultiplyObj1 = new Multiply();
        System.out.println("Section: 3");

        //3.1
        System.out.println("#3.1");
        MultiplyObj1.Multi(2, 3.5);

        //3.2
        System.out.println("#3.2");
        double[][] d = MultiplyObj1.Multi(2.7, matA);
        MultiplyObj1.printMat(d);

        //3.3
        System.out.println("#3.3");
        double[][] e = MultiplyObj1.Multi(matA, 2.7);
        MultiplyObj1.printMat(e);


        //3.4
        System.out.println("#3.4");
        double[][] f = MultiplyObj1.Multi(matA, matB);
        MultiplyObj1.printMat(f);
        System.out.println("_______________________");

        
        
        //4
        Multiply MultiplyObj2 = new Multiply();
        System.out.println("Section: 4");
        double[][] g = Conner.inverse(matD);
        double[][] h = MultiplyObj2.Multi(MultiplyObj2.Multi(MultiplyObj2.Multi(matA, 2), MultiplyObj2.Multi(g, matB)), MultiplyObj2.Multi(matC, 3.5));
        MultiplyObj2.printMat(h);

        

    }
}