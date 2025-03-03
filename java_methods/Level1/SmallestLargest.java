
// Program to find the smallest and largest of three numbers.
import java.util.Scanner;

public class SmallestLargest {
    public static int[] findSmallestAndLargest(int a, int b, int c) {

        int smallest = Math.min(a, Math.min(b, c));

        int largest = Math.max(a, Math.max(b, c));

        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        sc.close();
    }
}
