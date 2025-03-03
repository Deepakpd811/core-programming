package Level_1;

import java.util.Scanner;

// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


public class TriangleArea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height(inches) of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.45;
        double feet = areaInSqInches / 144;

        System.out.println("Your Height in cm is "+areaInSqCm +" while in feet is "+feet+" and inches is "+ areaInSqInches);
        sc.close();
    }
}
