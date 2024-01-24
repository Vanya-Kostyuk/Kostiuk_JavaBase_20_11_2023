package ua.hillel.kostiuk.lessons.lesson14.HW16;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Call from class Android");
    }

    @Override
    public void sms() {
        System.out.println("SMS from class Android");
    }

    @Override
    public void internet() {
        System.out.println("Internet from class Android");
    }

    @Override
    public void versionLinuxOS() {
        System.out.println("Version LinuxOS Android");
    }
}
