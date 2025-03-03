// Program to check if a number is positive, negative, or zero.
import java.util.Scanner;
public class NumberSign {
    public static int checkNumberSign(int number) {
        if(number > 0) {
            return 1;
        } else if(number < 0) {
            return -1;
        } else {
            return 0;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = checkNumberSign(number);
        System.out.println("Result: " + result);
        sc.close();
    }
}
