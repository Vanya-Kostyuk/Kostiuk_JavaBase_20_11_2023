package ua.hillel.kostiuk.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[5];
//
//        array[0] = 10;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

        // bad print !!!
//        System.out.println(array);

        // good print !!!
//        System.out.println(Arrays.toString(array));




//        int[] array = new int[20];

//        System.out.println(array.length);

//        array[10] = 1; // ArrayIndexOutOfBoundsException

//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }


//        int[] array = new int[5];
//
//        System.out.println(Arrays.toString(array));


//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = new int[]{1, 2, 3, 4, 5};
//        int array3[] = new int[10];
//        System.out.println(Arrays.toString(array));



//        int[] array = {1, 2, 3, 4, 5};
//
//        for (int value : array) {
//            System.out.println(value);
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            int value = array[i];
//
//            if (value == 3) {
//                array[i] = 77;
//            }
//
//            System.out.println(array[i]);
//        }



//   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
//   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
//   останнього символу не виводити кому



//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (i == array.length - 1) {
//                System.out.print(array[i]);
//            } else {
//                System.out.print(array[i] + ", ");
//            }
//        }


/*

     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
     записані як масив чисел. Написати функцію, яка і визначить
     номер підозрюваного, якого треба ув'язнити.

*/

//        int[] people = {11, 44, 98, 44, 22, 33, 55, 22, 90, 9};
//
//        int maxValue = people[0];
//        int indexMaxValue = 0;
//
//        for (int i = 0; i < people.length; i++) {
//            if (people[i] > maxValue) {
//                maxValue = people[i];
//                indexMaxValue = i;
//            }
//        }
//
//        System.out.println("max value = " + maxValue + ", index: " + indexMaxValue);



/*
     У вашій баскетбольній команді 10 людей. Очки гравців основного
     складу записані в парні комірки масиву, а запасних гравців - у
     непарні. Написати функцію, яка знайде наскільки більше балів
     заробив основний склад щодо запасних гравців.


*/

        int[] team = new int[10];

        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 11);
        }

        System.out.println(Arrays.toString(team));

        int teamOne = 0;
        int teamTwo = 0;

        for (int i = 0; i < team.length; i++) {
            if (i % 2 == 0) {
                teamOne += team[i];
            } else {
                teamTwo += team[i];
            }
        }


        System.out.println("teamOne = " + teamOne);
        System.out.println("teamTwo = " + teamTwo);


        if (teamOne > teamTwo) {
            System.out.println("team One win");
        } else if (teamTwo > teamOne) {
            System.out.println("team Two win");
        } else {
            System.out.println("Draw");
        }

    }
}






//          int number = 143;
//        System.out.println(number / 100);
//        System.out.println(number / 10 % 10);
//        System.out.println(number % 10);



//        int number2 = 15432;
//
//        for (int i = 0; i < 5; i++) {
//            int x = number2 % 10;
//            System.out.println(x);
//            number2 = number2 / 10;
//        }

