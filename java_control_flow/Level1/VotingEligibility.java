import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person is to vote");
            
        } else{
            System.out.println("The person not allowed to vote");

        }
        sc.close();
    }
}
