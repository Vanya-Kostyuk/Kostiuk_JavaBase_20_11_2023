package ua.hillel.kostiuk.lessons.lesson12.HW14;

public class FitnessTracker {
    public static void main(String[] args) {
        Person person1 = new Person("Олександр", "Сокіл", 15, "квітня", 1985, 78, "120/80", "oleksandr85@email.com", "+380951234567", 10_000);
        Person person2 = new Person("Ірина", "Блискавка", 22, "лютого", 1990, 65, "110/70", "iryna90@email.com", "+380979876543", 8_000);
        Person person3 = new Person("Максим", "Титан", 10, "грудня", 1982, 85, "130/85", "maksym82@email.com", "+380937654321", 12_000);
        System.out.println("before");
        System.out.println();
        person1.printAccountInfo();
        System.out.println("----");
        person2.printAccountInfo();
        System.out.println("----");
        person3.printAccountInfo();

        person1.setSurname("Дуб");
        person2.setCountStepsPerDay(2_440);
        person3.setWeight(65);
        person3.setPressure("112/75");

        System.out.println();
        System.out.println("after");
        System.out.println();

        person1.printAccountInfo();
        System.out.println("----");
        person2.printAccountInfo();
        System.out.println("----");
        person3.printAccountInfo();

    }
}
