package ua.hillel.kostiuk.practice.task1;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println("-----------");
        person3.setProfession("Дизайнер");
        System.out.println(person3);
    }
}
