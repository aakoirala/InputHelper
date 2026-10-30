import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Test InputHelper methods
        Scanner scan = new Scanner(System.in);

        String name = InputHelper.getNonZeroLenString(scan, "Enter your full name: ");
        int age = InputHelper.getInt(scan, "Enter your age");
        double decimalNum = InputHelper.getDouble(scan, "Enter in a decimal value");
        int rangedInteger = InputHelper.getRangedInt(scan, "What is your age: ", 13, 100 );
        double rangedDouble = InputHelper.getRangedDouble(scan, "How much money does Rahul have: ", 67.67, 80.8 );
        boolean testYN = InputHelper.getYNConfirm(scan, "Do you want to continue?: ");
        String phoneNum = InputHelper.getRegExString(scan, "Enter your phone number [xxx-xxx-xxxx]", "\\d{3}-\\d{3}-\\d{4}");
        String bDay = InputHelper.getRegExString(scan, "Enter your birthday [mm/dd/yyyy]]", "\\d{2}/\\d{2}/\\d{4}");

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println(decimalNum);
        System.out.println(rangedInteger);
        System.out.println(rangedDouble);
        System.out.println(testYN);
        System.out.println("Phone Number:" + phoneNum);
        System.out.println("Birth Date: " + bDay);
    }
}