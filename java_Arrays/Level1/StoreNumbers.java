// Program to store values in an array until 0 or negative is entered
import java.util.Scanner;
public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Store numbers in an array until 0 or negative is entered
        while (true) { 
            System.out.print("Enter a number: ");
            double num = sc.nextDouble(); 

            if (num <= 0 || index == 10) break;  // Exit loop if 0 or negative is entered

            numbers[index++] = num;  // Store number in array

        }

        for (int i = 0; i < index; i++) {
            total += numbers[i]; // Calculate sum of numbers
        }
        
        System.out.println("Total sum: " + total);
        sc.close();
    }
}
