import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("The Quotient is " + (num1 / num2));
        System.out.println("The Remainder is " + (num1 % num2));
        System.out.println("The two numbers are " + num1 + " and " + num2);
        
        sc.close();
    }
}
