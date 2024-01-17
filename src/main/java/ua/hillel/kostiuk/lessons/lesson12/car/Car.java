package ua.hillel.kostiuk.lessons.lesson12.car;

public class Car {

    private int countWheels;
    private boolean start;
    protected double fuelStatus = 50.0;
    private String modelName;

    public Car(int countWheels, String modelName) {
        this.countWheels = countWheels;
        this.modelName = modelName;
    }

    public void start() {
        startElectronicSystem();
        startFuelSystem();
        startGPSSystem();
        start = true;
    }

    public void stop() {
        stopGPSSystem();
        stopFuelSystem();
        stopElectronicSystem();
        start = false;
    }

    public void run() {
        if (start) {
            System.out.println(modelName + " RUN!!!");
            fuelStatus -= 20;
        } else {
            System.out.println("NEED START CAR!!!");
        }
    }

    private void startElectronicSystem() {
        System.out.println("Start electronic system...");
    }

    private void startFuelSystem() {
        System.out.println("Start fuel system...");
    }

    private void startGPSSystem() {
        System.out.println("Start gps system...");
    }

    private void stopElectronicSystem() {
        System.out.println("Stop electronic system...");
    }

    private void stopFuelSystem() {
        System.out.println("Stopfuel system...");
    }

    private void stopGPSSystem() {
        System.out.println("Stop gps system...");
    }

    public int getCountWheels() {
        return countWheels;
    }

    public boolean isStart() {
        return start;
    }

    public double getFuelStatus() {
        return fuelStatus;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void closeConnection() {

    }

    @Override
    protected Car clone()  {
        return new Car(this.countWheels, this.modelName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getCountWheels() != car.getCountWheels()) return false;
        if (isStart() != car.isStart()) return false;
        if (Double.compare(car.getFuelStatus(), getFuelStatus()) != 0) return false;
        return getModelName() != null ? getModelName().equals(car.getModelName()) : car.getModelName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getCountWheels();
        result = 31 * result + (isStart() ? 1 : 0);
        temp = Double.doubleToLongBits(getFuelStatus());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getModelName() != null ? getModelName().hashCode() : 0);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I AM DIE!!!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "countWheels=" + countWheels +
                ", start=" + start +
                ", fuelStatus=" + fuelStatus +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}