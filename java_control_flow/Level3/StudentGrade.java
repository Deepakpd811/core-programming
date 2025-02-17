import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();
        double Average = (physics + chemistry + maths) / 3.0;

        String grade = "";
        if (Average >= 90) {
            grade = "A";
        } else if (Average >= 80) {
            grade = "B";
        } else if (Average >= 70) {
            grade = "C";
        } else if (Average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        System.out.println("Average Marks: " + Average);
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
