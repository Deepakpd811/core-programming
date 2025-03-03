// Program to convert various units.

import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        System.out.println(n+" km to miles: " + convertKmToMiles(10));
        System.out.println(n+ " miles to km: " + convertMilesToKm(5));
        System.out.println(n+ " meters to feet: " + convertMetersToFeet(100));
        System.out.println(n+ " feet to meters: " + convertFeetToMeters(50));
    }
}
