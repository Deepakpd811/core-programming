package Level_1;

import java.util.Scanner;

public class PenDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int pens = sc.nextInt();
        int students = sc.nextInt();
        
        int perStudent = pens / students;
        int remaining = pens % students;
        
        System.out.println("The Pen Per Student is " + perStudent);
        System.out.println("The remaining pen not distributed is " + remaining);

    }
}
