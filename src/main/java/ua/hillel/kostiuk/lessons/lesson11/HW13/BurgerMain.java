package ua.hillel.kostiuk.lessons.lesson11.HW13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("булочка","м'ясо", "сир", "зелень", "майонез");
        Burger dietBurger = new Burger("булочка","м'ясо", "сир", "зелень");
        Burger doubleMeatBurger = new Burger("булочка","м'ясо", "сир","м'ясо", "зелень", "майонез");
    }
}
