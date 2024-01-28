package ua.hillel.kostiuk.lessons.lesson15.HW17;

public enum DrinksMachine {
    COFFEE(12.3),
    TEA(7),
    LEMONADE(24),
    MOJITO(20),
    MINERAL(15.5),
    COCA(23.7);

    private final double price;

    DrinksMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}