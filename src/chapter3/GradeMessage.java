package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter you letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String message;

        String grade = scanner.next();
        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You know to work a bit harder";
                break;
            default:
                message = "Error. Invalid grade";
        }
        System.out.println(message);
    }
}
