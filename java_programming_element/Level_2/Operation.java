import java.util.Scanner;
public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        System.out.println("The results of Int Operations are " + (a + b * c) + ", " + (a * b + c) + ", " + (c + a / b) + ", and " + (a % b + c));
        sc.close();
    }
}
