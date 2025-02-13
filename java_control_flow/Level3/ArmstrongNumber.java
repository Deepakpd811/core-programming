import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(), sum = 0, originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }
        System.out.println(number + (sum == number ? " is an Armstrong Number." : " is Not an Armstrong Number."));
        input.close();
    }
}
