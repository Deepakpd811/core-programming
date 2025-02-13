import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble() / 100;
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        input.close();
    }
}
