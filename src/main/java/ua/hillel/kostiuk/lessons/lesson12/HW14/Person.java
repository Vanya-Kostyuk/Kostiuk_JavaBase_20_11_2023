package ua.hillel.kostiuk.lessons.lesson12.HW14;

public class Person {
    private final String name;
    private String surname;
    private final int dayOfBirth;
    private final String monthOfBirth;
    private final int yearOfBirth;
    private int weight;
    private String pressure;
    private final String email;
    private final String mobilePhone;
    private int countStepsPerDay;
    private int age;

    public Person(String name, String surname, int dayOfBirth, String monthOfBirth, int yearOfBirth, int weight, String pressure, String email, String mobilePhone, int countStepsPerDay) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.pressure = pressure;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.countStepsPerDay = countStepsPerDay;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public String getEmail() {
        return email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public int getCountStepsPerDay() {
        return countStepsPerDay;
    }

    public int getAge() {
        return age = 2024 - yearOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setCountStepsPerDay(int countStepsPerDay) {
        this.countStepsPerDay = countStepsPerDay;
    }


    public void printAccountInfo() {
        System.out.println("name= " + getName());
        System.out.println("surname= " + getSurname());
        System.out.println("birthDay= " + getDayOfBirth() + " " + getMonthOfBirth() + " " + getYearOfBirth());
        System.out.println("age= " + getAge());
        System.out.println("weight= " + getWeight());
        System.out.println("pressure= " + getPressure());
        System.out.println("email= " + getEmail());
        System.out.println("mobilePhone= " + getMobilePhone());
        System.out.println("countStepsPerDay= " + getCountStepsPerDay());
    }
}
