import java.util.Scanner;
public class DivisibilityBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
        input.close();
    }
}
