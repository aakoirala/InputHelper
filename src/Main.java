import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Test InputHelper methods
        Scanner scan = new Scanner(System.in);
        String name = InputHelper.getNonZeroLenString(scan, "Enter your full name: ");
        int age = InputHelper.getInt(scan, "Enter your age");
        double decimalNum = InputHelper.getDouble(scan, "Enter in a decimal value");
        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println(decimalNum);
    }
}
