import java.util.Scanner;

public class InputHelper {
    //All methods should be public and static

    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String s;
        boolean valid = false;
        System.out.println(prompt);

        do {
            s = scan.nextLine();

            if (s.length() > 0) {
                valid = true;
            } else {
                System.out.println("Error: Try again. You entered a String of length 0");
            }
        } while (!valid);
        
        return s;
    }
}
