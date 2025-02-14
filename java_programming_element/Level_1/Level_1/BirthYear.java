package Level_1;

import java.util.Scanner;

// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
// I/P => NONE
// O/P => Harry's age in 2024 is ___

public class BirthYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the birth year and current year: ");
        int birthYear = sc.nextInt();
        int currentYear = sc.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Age in 2024 is " + age);
    }
}
