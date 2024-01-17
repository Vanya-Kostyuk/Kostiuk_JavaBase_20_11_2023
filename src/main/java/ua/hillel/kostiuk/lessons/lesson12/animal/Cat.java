package ua.hillel.kostiuk.lessons.lesson12.animal;

public class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

//    public Cat() {
//        System.out.println("FROM CAT");
//    }

    void eat() {
        System.out.println(name + " eat");
    }
}
