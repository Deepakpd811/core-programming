package Level_1;

import java.util.Scanner;

public class ProfitCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Cost Price: ");
        int cost = sc.nextInt();
        System.out.println("Enter the Cost selling: ");
        int selling = sc.nextInt();
        int profit = selling - cost;
        double profitPercent = (profit / (double) cost) * 100;

        System.out.println("The Cost Price is INR " + cost);
        System.out.println("The Selling Price is INR " + selling);
        System.out.println("The Profit is INR " + profit);
        System.out.println("The Profit Percentage is " + profitPercent);
        
                
    }
}
