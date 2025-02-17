import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = sc.nextInt();
        int originalNumber = number, remainder, sum = 0;

        while(originalNumber !=0){
            remainder = originalNumber%10;
            sum += remainder*remainder*remainder;
            originalNumber /= 10;
        }

        if(sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is Not an Armstrong Number.");
        }
      
        sc.close();
    }
}
