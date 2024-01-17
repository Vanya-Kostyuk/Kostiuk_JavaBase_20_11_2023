package ua.hillel.kostiuk.lessons.lesson12.animal;

public class Dog extends Animal {

    String color;

    public Dog(String name, int age) {
        super(name, age);
    }

    Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.println(this.name);
    }

    Dog() {
        super("DEFAULT", 0);
        System.out.println("FROM DOG");
    }


    void bark() {
        System.out.println(name + " bark");
    }

}