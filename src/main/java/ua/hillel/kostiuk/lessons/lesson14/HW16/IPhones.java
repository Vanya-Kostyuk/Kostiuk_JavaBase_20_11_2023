package ua.hillel.kostiuk.lessons.lesson14.HW16;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Call from class IPhone");
    }

    @Override
    public void sms() {
        System.out.println("SMS from class IPhone");
    }

    @Override
    public void internet() {
        System.out.println("Internet from class IPhone");
    }

    @Override
    public void versionIOS() {
        System.out.println("Version IOS IPhone");
    }
}
