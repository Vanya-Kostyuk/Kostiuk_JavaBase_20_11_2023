package ua.hillel.kostiuk.lessons.lesson15;

public enum CarType {
    CAR("Автомобiль", 'B'),
    BUS("Автобус", 'D'),
    TRUCK("Вантажiвка", 'C'),
    MOTORCYCLE("Мотоцикл", 'A');

    private String type;
    private char category;

    CarType(String type, char category) {
        this.type = type;
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public char getCategory() {
        return category;
    }
}
