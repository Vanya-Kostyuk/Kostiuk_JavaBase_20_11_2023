package ua.hillel.kostiuk.lessons.lesson4.HW4;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int h = 6;

        int volume = a * b * h;

        System.out.println("Об'єм паралелепіпеда = " + volume);

        int countEachSide = 4;
        int length = (a + b + h) * countEachSide;
        System.out.println("довжину всіх сторін = " + length);
    }
}
