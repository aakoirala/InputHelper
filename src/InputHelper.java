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

    public static int getInt(Scanner scan, String prompt) {
        int x = 0;
        boolean valid = false;
        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error: You must enter in an integer value");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double x = 0;
        boolean valid = false;
        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Error: You must enter in an double value");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static int getRangedInt(Scanner scan, String prompt) {
        int x1 = 0;
        int x2 = 0;
        boolean valid = false;
        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error: You must enter in an integer value");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }
}
