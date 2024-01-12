package ua.hillel.kostiuk.lessons.lesson11;

public class Car {

    String modelName;
    int year;
    Engine engine;


    Car() {
        this("sdfsdfds");
    }

    Car(String modelName) {
        this.modelName = modelName;
    }

    Car(int year) {
        this("Default", year);
    }

    Car(String modelName, int year) {
        this.modelName = modelName;
        this.year = year;
        start();
        run();
        stop();
    }

    public Car(String modelName, int year, Engine engine) {
        this.modelName = modelName;
        this.year = year;
        this.engine = engine;
        System.out.println("FROM CAR");
    }

    void start() {
        System.out.println(this.modelName + " start...");
    }

    void stop() {
        System.out.println(modelName + " stop...");
    }

    void run() {
        System.out.println(modelName + " run...");
    }


//    void demo() {
//        String modelName = "sdfsdfd";
//        int year = 20;
//
//        System.out.println(modelName);
//    }
//
//    void demo2() {
//        System.out.println(modelName);
//        System.out.println(year);
//    }


    @Override
    public String toString() {
        return "modelName='" + modelName + '\'' +
                ", year=" + year +
                ", engine=" + engine;
    }
}
