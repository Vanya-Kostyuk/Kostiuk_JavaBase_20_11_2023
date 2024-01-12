package ua.hillel.kostiuk.lessons.lesson11.HW13;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String doubleMeat;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Regular Burger: " + bun + ", " + meat+ ", " + cheese+ ", " + greens+ ", " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Diet Burger: " + bun + ", " + meat+ ", " + cheese+ ", " + greens);
    }

    public Burger(String bun, String meat, String cheese, String doubleMeat, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.doubleMeat = doubleMeat;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("DoubleMeat Burger: "  + bun + ", " + meat+ ", " + cheese+ ", " + doubleMeat + ", " + greens+ ", " + mayonnaise);
    }
}
