import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {
        int [] numCodeEncyrpt = {31, 12, 67, 127, 8, 19};
        int [] numCodeDecyrpt = {974, 157, 4502, 16142, 77, 374};
        int [] arr = new int[24];
    

        while (true) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = keyboardInput.nextLine();

        if (password.contentEquals("encode")) {


            System.out.println(HW14.encyrption(numCodeEncyrpt));
        } 
        
        else if (password.contentEquals("decode")) {

             System.out.println(HW14.decryption(numCodeDecyrpt));

        }

        else if (password.contentEquals("test")) {
            boolean end = true;

            Scanner testInput = new Scanner(System.in);
            System.out.print("Enter The String You Want to Encyrpt: ");
            String input = testInput.nextLine();

            while (end = true) {
            Scanner newInput = new Scanner(System.in);
            System.out.print("Enter The Character Position: ");
            String town = newInput.nextLine();

            if (town.contentEquals("end")) {
                break;
            } 

            int result = Integer.valueOf(town);
            System.out.println("Your Encoded Number Is: " + "=> " +((int)Math.pow(result, 2)+13));

            }

        }
        else {
            System.out.println("Password Incorrect");
        }
 
    }
}



    public static String encyrption(int[] num) {
        
        for (int i=0; i < num.length; ++i) {
            System.out.print(num[i] + "=> " + "");
            num[i]=(int)(Math.pow(num[i], 2) + 13);
            System.out.println(num[i]);
        }

    return "Code Encyrpted";
    }

    public static String decryption(int[] num) {

        for (int i=0; i < num.length; ++i) {
            System.out.print(num[i] + "=> " + "");
            num[i]=(int)(Math.sqrt(num[i]-13));
            System.out.println(num[i]);
        }
        return "Code Decyrpted";
    }
}
