import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = input.next().charAt(0);  // Read operator as character

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        switch (op) {
            case '+': 
                System.out.println("Result: " + (first + second));
                break;
            case '-': 
                System.out.println("Result: " + (first - second));
                break;
            case '*': 
                System.out.println("Result: " + (first * second));
                break;
            case '/': 
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default: 
                System.out.println("Invalid operator.");
        }

        input.close();
    }
}
