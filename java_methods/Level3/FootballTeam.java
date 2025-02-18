// Program to find the shortest, tallest, and mean height of players in a football team.
import java.util.Random;
public class FootballTeam {
    // Method to find the sum of the heights of the players
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) sum += height;
        return sum;
    }
    // Method to find the mean height of the players
    public static double findMean(int[] heights) {
        return findSum(heights) / (double) heights.length;
    }
    // Method to find the shortest player
    public static int findShortest(int[] heights) {
        int shortest = Integer.MAX_VALUE;
        for (int height : heights) if (height < shortest) shortest = height;
        return shortest;
    }
    // Method to find the tallest player
    public static int findTallest(int[] heights) {
        int tallest = Integer.MIN_VALUE;
        for (int height : heights) if (height > tallest) tallest = height;
        return tallest;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];
        
        for (int i = 0; i < 11; i++) heights[i] = 150 + random.nextInt(101);
        
        System.out.println("Heights: " + java.util.Arrays.toString(heights));
        System.out.println("Shortest player: " + findShortest(heights) + " cm");
        System.out.println("Tallest player: " + findTallest(heights) + " cm");
        System.out.println("Mean height: " + findMean(heights) + " cm");
    }
}
