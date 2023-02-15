import java.util.Scanner;

public class Proj13 {
    public static void main (String[] args) {
        Scanner passwordInput = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = passwordInput.nextLine();
        String message = "Hello good sir";
        String camMessage = "simplify and add lightness";
        //                          1
        //                01234567890123

        if (password.contentEquals("encode")) {
            System.out.println("Encoded Message: ");
            System.out.println(Math.pow(6,2)+13);
            System.out.println(Math.pow(8,2)+13);
            System.out.println(Math.pow(9,2)+13);
            System.out.println(Math.pow(5,2)+13);
            System.out.println(Math.pow(12,2)+13);
            System.out.println(Math.pow(11,2)+13);
            System.out.println(Math.pow(10,2)+13);
            System.out.println(Math.pow(0,2)+13);
            System.out.println(Math.pow(1,2)+13);
            System.out.println(Math.pow(13,2)+13);
            
        } else if (password.contentEquals("decode")){
            System.out.println(Math.sqrt(102.0-66));
            System.out.println(Math.sqrt(67.0-66));
            System.out.println(Math.sqrt(427.0-66));
            System.out.println(Math.sqrt(466.0-66));
            System.out.println(Math.sqrt(507.0-66));
            System.out.println(Math.sqrt(130.0-66));
            System.out.println(Math.sqrt(70.0-66));
            System.out.println(Math.sqrt(595-66));
            System.out.println("Decode: ");
            System.out.println(camMessage.charAt(6) + "" + camMessage.charAt(1) + "" + camMessage.charAt(19) + "" + camMessage.charAt(20) + "" + camMessage.charAt(21) + "" + camMessage.charAt(8) + "" + camMessage.charAt(2) + "" + camMessage.charAt(23));

            /* System.out.println(Math.sqrt(14.0-13));
            System.out.println(Math.sqrt(182.0-13)); */
            } else {
            System.out.println("Password Incorrect");
        }

        
            
    }

}