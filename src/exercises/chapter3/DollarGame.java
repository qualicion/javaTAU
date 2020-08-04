package exercises.chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        //1. Declare values for coins & sum
        //2. Request for pennies
        //3. Request for nickels
        //4. Request for dimes
        //5. Request for quarters
        //6. Add all of the values
        //7. Create condition to check sum is equal to $1
        //8. Create condition to check sum is less than $1
        //9. Create condition to check sum is greater than $1

        double dollar = 1.00;
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double totalPenny;
        double totalNickel;
        double totalDime;
        double totalQuarter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");


        System.out.println("Enter number of pennies: ");
        int numberOfPennies = scanner.nextInt();
        totalPenny = penny * numberOfPennies;

        System.out.println("Enter number of nickels: ");
        int numberOfNickels = scanner.nextInt();
        totalNickel = nickel * numberOfNickels;

        System.out.println("Enter number of dimes: ");
        double numberOfDimes = scanner.nextInt();
        totalDime = dime * numberOfDimes;

        System.out.println("Enter number of quarters: ");
        double numberOfQuarters = scanner.nextInt();
        totalQuarter = quarter * numberOfQuarters;

        scanner.close();

        double sumOfCoins = totalPenny + totalNickel + totalDime + totalQuarter;

        if (sumOfCoins < dollar) {
            double underCalculation = dollar - sumOfCoins;
            System.out.println("You are under by " + underCalculation);
        }
        else if (sumOfCoins > dollar) {
            double overCalculation = sumOfCoins - dollar;
            System.out.println("You are over by " + overCalculation);
        }
        else {
            System.out.println("You win!");
        }
    }
}
