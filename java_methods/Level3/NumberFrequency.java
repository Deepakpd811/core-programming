// Utility class to analyze digit frequencies.
import java.util.HashMap;
import java.util.Scanner;
public class NumberFrequency {
    public static HashMap<Integer, Integer> findDigitFrequency(int number) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        while (number > 0) {
            int digit = number % 10;
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Digit Frequencies: " + findDigitFrequency(number));
    }
}
