import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int fact = 1, i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is " + fact);
        input.close();
    }
}
