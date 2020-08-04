package chapter2;

import java.util.Scanner;

public class MadLib1 {
    public static void main(String[] args) {
        //1. What is the season of the year
        System.out.println("What season is it?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Enter a whole number
        System.out.println("Enter a whole number..");
        int number = scanner.nextInt();

        //3. Enter an adjective
        System.out.println("Enter an adjective..");
        String adjective = scanner.next();
        scanner.close();

        //4. Print out the information
        System.out.println("On a " +adjective+ " " +season+ " day, I drink a minimum of " +number+ " cups of coffee." );

    }
}

