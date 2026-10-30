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

    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        int x = 0;

        boolean valid = false;
        System.out.println(prompt + "(" + min + "-" + max + ")");

        do {
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                if (x >= min && x <= max) {
                    valid = true;
                } else {
                    System.out.println("Error: You must enter in an integer value between: " + min + " and " + max);
                }
            } else {
                System.out.println("Error: You must enter in an integer value");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        double x = 0;

        boolean valid = false;
        System.out.println(prompt + "(" + min + "-" + max + ")");

        do {
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
                if (x >= min && x <= max) {
                    valid = true;
                } else {
                    System.out.println("Error: You must enter in an double value between: " + min + " and " + max);
                }
            } else {
                System.out.println("Error: You must enter in an double value");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static boolean getYNConfirm(Scanner scan, String prompt) {
        String decision;
        boolean valid = false;
        System.out.println(prompt + " (Enter Y/N)");

        do {
            decision = scan.nextLine();

            if (decision.equalsIgnoreCase("y")) {
                valid = true;
                return true;
            } else if (decision.equalsIgnoreCase("n")) {
                valid = true;
                return false;
            } else {
                System.out.println("Error: Enter in Y or N");
            }
            scan.nextLine();
        } while (!valid);
        return false;
    }

    public static int getPositiveNonZeroInt (Scanner scan, String prompt) {
        int x = 0;
        boolean valid = false;
        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                if (x > 0) {
                    valid = true;
                } else {
                    System.out.println("Error: You must enter in a positive integer value");
                }
            } else {
                System.out.println("Error: You must enter in an integer value");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static String getRegExString (Scanner scan, String prompt, String regexPattern) {
        boolean valid = false;
        String s;
        System.out.println(prompt);

        do {
            s = scan.nextLine();

            if (s.matches(regexPattern)) {
                valid = true;
            } else {
                System.out.println("Error: Your input must match the specfied pattern");
            }
        } while (!valid);
        return s;
    }
}