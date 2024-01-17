package ua.hillel.kostiuk.lessons.lesson12.car;

import ua.hillel.kostiuk.lessons.lesson12.animal.Dog;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, "BMW");
        Car car2 = new Car(4, "BMW");

        Car clone = car.clone();

        System.out.println(clone.fuelStatus);


        Dog dog = new Dog("asdf", 2);
        System.out.println(car.equals(dog));

//        System.out.println(car);
//
//        car.start();
//        car.run();
//        car.stop();
//
//        System.out.println(car);
//
//        car.setModelName("AUDI");
//        System.out.println(car.getFuelStatus());



    }

}
