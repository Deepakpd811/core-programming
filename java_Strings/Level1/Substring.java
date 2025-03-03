
// Program to extract a substring using charAt() and compare with built-in substring().
import java.util.Scanner;

public class Substring {
    public static String Substring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++)
            sb.append(str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String customSub = Substring(str, start, end);
        String builtInSub = str.substring(start, end);
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);

        System.out.println("Both methods give the same result: " + customSub.equals(builtInSub));
        sc.close();
    }
}
