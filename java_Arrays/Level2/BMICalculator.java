// Program to calculate BMI and determine weight status.
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = input.nextInt();
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble() / 100;
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal weight";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        System.out.println("Height | Weight | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.println(heights[i] + "m | " + weights[i] + "kg | " + bmi[i] + " | " + status[i]);
        }
        input.close();
    }
}
