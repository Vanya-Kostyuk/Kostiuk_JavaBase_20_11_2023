package ua.hillel.kostiuk.practice.task1;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name +", " + "Вік: " + age + "," + "Професія: " + profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
