package ua.hillel.kostiuk.lessons.lesson11;

public class Engine {
    double volume;

    public Engine(double volume) {
        this.volume = volume;
        System.out.println("FROM ENGINE");
    }

    @Override
    public String toString() {
        return "volume=" + volume;
    }
}
