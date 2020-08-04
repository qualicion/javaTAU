package chapter3;

/*
   1. IF ELSE
   2. All salespeople are expected to make at least 10 sales each week
   3. For those who do, they receive a congratulatory message
   4. For those who don't, they are informed of how many sales they were short
*/

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialize values we know
        double quota = 10.0;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        double sales = scanner.nextDouble();
        scanner.close();

        //Make a decision on the path to take - Output
        if(sales>=quota)
            System.out.println("Congrats you have met your quota");

        else {
            double salesShort = quota - sales;
            System.out.printf("You did not meet your quota. You were short: " +salesShort);
        }
    }
}
