package ua.hillel.kostiuk.lessons.lesson6.HW8;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int shuttleNumber = 1;
        int count = 0;

        while (count < 100){
            boolean unlucky = false;
            int number = shuttleNumber;
            while (number > 0) {
                int digit = number % 10;
                if(digit == 4 || digit == 9) {
                    unlucky = true;
                    break;
                }else {
                    number /= 10;
                }
            }
            if (!unlucky) {
                System.out.println("Shuttle " + shuttleNumber);
                count++;
            }
            shuttleNumber++;
        }
        System.out.println("Count shuttles: " + count);
    }
}
