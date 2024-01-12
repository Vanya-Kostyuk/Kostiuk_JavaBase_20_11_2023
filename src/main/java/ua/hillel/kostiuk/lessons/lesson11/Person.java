package ua.hillel.kostiuk.lessons.lesson11;

public class Person {

    String name;
    int age;
    Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
        System.out.println("FROM PERSON");
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car;
    }
}
