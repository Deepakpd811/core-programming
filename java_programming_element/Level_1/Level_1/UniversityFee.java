package Level_1;

import java.util.Scanner;

public class UniversityFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the fee: ");
        double fee = sc.nextInt();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextInt();

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        sc.close();
    }
}
