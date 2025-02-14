
//Similarly, write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Addition: " + (num1 + num2) +
                "\nSubtraction: " + (num1 - num2) +
                "\nMultiplication: " + (num1 * num2) +
                "\nDivision: " + (num1 / num2));
        sc.close();
    }
}
