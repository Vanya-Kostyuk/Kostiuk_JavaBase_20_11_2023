package ua.hillel.kostiuk.lessons.lesson14.HW16;

public class Main {
    public static void main(String[] args) {
        IPhones iPhone = new IPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.versionIOS();

        System.out.println();

        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.versionLinuxOS();
    }
}
