package ua.hillel.kostiuk.lessons.lesson15.HW17;

import java.util.Arrays;
import java.util.Scanner;

import static ua.hillel.kostiuk.lessons.lesson15.HW17.DrinksMachine.*;

public class Main {
    public static void main(String[] args) {
        makeDrinks();
    }

    static void makeDrinks() {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int countDrinks = 0;
        int countUserDrinks;
        DrinksMachine userDrink;
        DrinksMachine[] drinks = DrinksMachine.values();

        do {
            System.out.println("Select number of drinks:");
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp > 0) {
                    countUserDrinks = temp;
                    break;
                } else if(temp == 0){
                    System.out.println("You must order at least 1 drink");
                }
            } else {
                System.out.println("Invalid input! Please enter a positive integer.");
                scanner.nextLine();
            }
        } while (true);

        scanner.nextLine();

        for (int i = 0; i < countUserDrinks; i++) {
            userDrink = null;
            while (userDrink == null) {
                System.out.println("Please enter drink type from list: " + Arrays.toString(drinks));
                String userValue = scanner.nextLine().toUpperCase();

                for (DrinksMachine drinkType : drinks) {
                    if (drinkType.toString().equals(userValue)) {
                        userDrink = DrinksMachine.valueOf(userValue);
                    }
                }
            }
            switch (userDrink) {
                case COFFEE:
                    System.out.println("Coffee is being prepared");
                    totalPrice += COFFEE.getPrice();
                    countDrinks++;
                    break;
                case TEA:
                    System.out.println("Tea is being prepared");
                    totalPrice += TEA.getPrice();
                    countDrinks++;
                    break;
                case LEMONADE:
                    System.out.println("Lemonade is being prepared");
                    totalPrice += LEMONADE.getPrice();
                    countDrinks++;
                    break;
                case MINERAL:
                    System.out.println("Mineral is being prepared");
                    totalPrice += MINERAL.getPrice();
                    countDrinks++;
                    break;
                case MOJITO:
                    System.out.println("Mojito is being prepared");
                    totalPrice += MOJITO.getPrice();
                    countDrinks++;
                    break;
                case COCA:
                    System.out.println("Coca-cola is being prepared");
                    totalPrice += COCA.getPrice();
                    countDrinks++;
                    break;
                default:
                    System.out.println("Invalid choice! Please select from the provided options.");
                    i--;
                    break;
            }
        }
        System.out.println("Count drinks: " + countDrinks);
        System.out.println("Price: " + totalPrice);
    }
}

