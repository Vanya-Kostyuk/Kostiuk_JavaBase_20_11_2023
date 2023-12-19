package ua.hillel.kostiuk.lessons.lesson8.HW9;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] numbersFirm = new int[7];
        int[] numbersPlayer = new int[7];

        for (int i = 0; i < numbersFirm.length; i++) {
            int guessedNumbersFirm = (int) (Math.random() * 10);
            numbersFirm[i] = guessedNumbersFirm;
        }
        for (int i = 0; i < numbersFirm.length - 1; i++) {
            for (int j = 0; j < numbersFirm.length - i - 1; j++) {
                if (numbersFirm[j] > numbersFirm[j + 1]) {
                    // Міняємо місцями елементи
                    int temp = numbersFirm[j];
                    numbersFirm[j] = numbersFirm[j + 1];
                    numbersFirm[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbersFirm));

        for (int i = 0; i < numbersPlayer.length; i++) {
            int guessedNumbersPlayers = (int) (Math.random() * 10);
            numbersPlayer[i] = guessedNumbersPlayers;
        }
        for (int i = 0; i < numbersPlayer.length - 1; i++) {
            for (int j = 0; j < numbersPlayer.length - i - 1; j++) {
                if (numbersPlayer[j] > numbersPlayer[j + 1]) {
                    // Міняємо місцями елементи
                    int temp = numbersPlayer[j];
                    numbersPlayer[j] = numbersPlayer[j + 1];
                    numbersPlayer[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbersPlayer));

        int count = 0;
        for (int i = 0; i < 7; i++) {
            if(numbersFirm[i] == numbersPlayer[i]) {
                count++;
            }
        }
        System.out.println("Кількість збігів: " + count);
    }
}
