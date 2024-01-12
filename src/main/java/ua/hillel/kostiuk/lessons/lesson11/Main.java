package ua.hillel.kostiuk.lessons.lesson11;

public class Main {

    public static void main(String[] args) {
//
////        Car bmw = new Car();
//        Car bmw = new Car("BMW X5", 2020);
//        Car audi = new Car("Audi A7", 2023);
//
//
//
////        bmw.modelName = "BMW X5";
////        bmw.year = 2020;
//
////        System.out.println(bmw.modelName);
////        System.out.println(bmw.year);
////
////
////
////        System.out.println(audi.modelName);
////        System.out.println(audi.year);
//
//
//        bmw.start();
//        bmw.run();
//        bmw.stop();
////
////        audi.start();
//
//
//        Car demoCar = null;
////
////        if (demo != null) {
////            demo.modelName = "sdfsdfds";
////        }
//
////        demo(bmw);
////        demo(audi);
////        demo(demoCar);
//



        Engine engine = new Engine(4.0);
        Car bmw = new Car("BMW X5", 2020, engine);
        Person den = new Person("Den", 29, bmw);
//        Person den = new Person("Den", 29, new Car("BMW X5", 2020, new Engine(4.0)));

//        System.out.println(den.car.engine.volume);
//
//
//        den.car.modelName = "Audi A7";
//
//        den.car.start();
//        bmw.start();

//        System.out.println(den);




    }


//    static void demo(Car car) {
//        if (car != null) {
//            car.start();
//            car.run();
//            car.stop();
//        }
//    }

}