import java.util.Scanner;
/**
 * Name: Jack Brashier
 * Date: 08/27/2017
 */
public class AssignmentTwo {
    public static void main(String [] args) {
        System.out.println("Please input a number between 0 and 1000:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int hundreds = input / 100;
        int tens = (input % 100) / 10;
        int ones = input % 10;
        int total = hundreds + tens + ones;
        System.out.println("The total of all components of " + input + " is " + total + ".");
    }
}
