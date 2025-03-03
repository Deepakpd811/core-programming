
// Program to trim leading and trailing spaces without using trim()
import java.util.Scanner;

public class TrimString {
    //Find the first and last character in string index
    public static int[] findTrimBounds(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ')
            start++;
        while (end >= start && str.charAt(end) == ' ')
            end--;
        return new int[] { start, end };
    }

    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++)
            sb.append(str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String str = sc.nextLine();

        int[] bounds = findTrimBounds(str);
        String trimmedStr = customSubstring(str, bounds[0], bounds[1]);

        String builtInTrim = str.trim();

        System.out.println("Custom Trim: " + trimmedStr );
        System.out.println("Built-in Trim: " + builtInTrim );
        System.out.println("Both match: " + trimmedStr.equals(builtInTrim));
        sc.close();
    }
}
