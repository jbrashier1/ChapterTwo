import java.util.Scanner;
/**
 * Name: Jack Brashier
 * Date: 08/27/2017
 */
public class AssigTwo {
    public static void main(String[] args) {
        System.out.println("Please input a number between 0 and 1000:");
        Scanner scanner = new Scanner(System.in);
        String inputString;
        boolean failed = false;
        String endProg = "no";
        while (endProg == "no") {
            inputString = scanner.next();
            if (inputString.length() >= 4) {
                System.out.println("Please input a number between 0 and 1000:");
            }
            if (inputString.length() <= 3) {
                for (int i = 0; i < 3; i++) {
                    if (Character.isDigit(inputString.charAt(i)) == false) {
                        failed = true;
                    } else if (Character.isDigit(inputString.charAt(0)) == true && Character.isDigit(inputString.charAt(1)) == true && Character.isDigit(inputString.charAt(2)) == true) {
                        failed = false;
                    }
                }
                for (int x = 0; x < inputString.length(); x++) {
                    if (failed == true && x == 2) {
                        System.out.println("Please input a number between 0 and 1000:");
                    } else if (Character.isDigit(inputString.charAt(x)) == true && x == 2) {
                        int hundreds = Integer.parseInt(inputString) / 100;
                        int tens = (Integer.parseInt(inputString) % 100) / 10;
                        int ones = Integer.parseInt(inputString) % 10;
                        int total = hundreds + tens + ones;
                        System.out.println("The sum of all the digits in " + inputString + " is " + total + ".");
                        endProg = "yes";
                    }
                }
            }
        }
    }
}
