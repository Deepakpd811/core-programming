// Program to check voting eligibility of students
import java.util.Random;
public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = rand.nextInt(50) + 1;
        return ages;
    }
    public static String[][] checkVoting(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] results = checkVoting(ages);
        System.out.println("Age\tEligibility");
        for (String[] row : results) System.out.println(row[0] + "\t" + row[1]);
    }
}
