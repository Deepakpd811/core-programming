import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        // Check if the sum of the factors is greater than the number
        if (sum > num) {
            System.out.println(num + " is an abundant number.");
        } else {
            System.out.println(num + " is not an abundant number.");
        }
        sc.close();
    }
}
