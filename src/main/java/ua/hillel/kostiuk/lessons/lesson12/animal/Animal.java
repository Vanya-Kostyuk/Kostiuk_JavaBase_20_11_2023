package ua.hillel.kostiuk.lessons.lesson12.animal;

public class Animal {

    protected String name;
    int age;
    int defaultModifierVariable;
    int privateModifierVariable;

    public Animal() {
        System.out.println("FROM ANIMAL");

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void run() {
        System.out.println(name + " run...");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("WRONG DATA!");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
