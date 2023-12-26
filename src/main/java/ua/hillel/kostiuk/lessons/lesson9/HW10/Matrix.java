package ua.hillel.kostiuk.lessons.lesson9.HW10;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeN;
        int sizeM;

        while (true) {
            System.out.print("var 1: ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if(num >= 0) {
                    sizeN = num;
                    break;
                }else {
                    System.out.println("Size can`t be -");
                }
            } else {
                System.out.println("Enter a number!");
                scanner.next();
            }
        }
        while (true) {
            System.out.print("var 2: ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if(num >= 0) {
                    sizeM = num;
                    break;
                } else {
                    System.out.println("Size can`t be -");
                }
            } else {
                System.out.println("Enter a number!");
                scanner.next();
            }
        }


        int[][] array = new int[sizeN][sizeM];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 21);
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
//----------------------------------------------------------------------
        System.out.println();
//----------------------------------------------------------------------
        int[][] transposedMatrix = new int[sizeM][sizeN];
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = array[j][i];
            }
        }
        for (int[] matrix : transposedMatrix) {
            for (int i : matrix) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
