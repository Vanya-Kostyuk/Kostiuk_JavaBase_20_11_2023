package ua.hillel.kostiuk.lessons.lesson6.HW7;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 11);
        System.out.println("- The number is guessed-");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number from 0 to 10:");
        int yourNumber;
        int min = 0;
        int max = 10;
        int attempts = 5;

        while (attempts > 0) {
            if (scanner.hasNextInt()) {
                yourNumber = scanner.nextInt();
                if (yourNumber == randomNumber) {
                    System.out.println("You are win");
                    break;
                } else if (yourNumber < min || yourNumber > max) {
                    System.out.println("From 0 to 10 !!");
                } else {
                    attempts--;
                    if (attempts > 0) {
                        System.out.println("Try again. Attempts - " + attempts);
                    } else {
                        System.out.println("You are lose. The number: " + randomNumber);
                    }
                }
            } else {
                System.out.println("Wrong data. Enter a number!");
            }
            scanner.nextLine();
        }
    }
}
