package ua.hillel.kostiuk.lessons.lesson2.HW2;

public class HW2 {
    public static void main(String[] args) {
        String name = "Statue of Liberty, NY, USA";

        double latitude = 40.689247;
        double longitude = -74.044502;

        System.out.println(name);
        System.out.println("Latitude " + latitude);
        System.out.println("Longitude " + longitude);
//----------------------------------------------------------
        int degreesLat = 40;
        char signDegreesLat = '\u00b0';
        int minuteLat = 41;
        char signMinuteLat ='\'';
        double secondLat = 21.2892;
        char signSecondLat ='\"';
        char sideLat = 'N';

        System.out.println("DMS Lat - " +degreesLat + signDegreesLat + " " + minuteLat + signMinuteLat +
                " " + secondLat + signSecondLat + " " + sideLat);

        int degreesLong = 74;
        char signDegreesLong = '\u00b0';
        int minuteLong = 2;
        char signMinuteLong ='\'';
        double secondLong = 40.2072;
        char signSecondLong ='\"';
        char sideLong = 'W';

        System.out.println("DMS Long - " +degreesLong + signDegreesLong + " " + minuteLong + signMinuteLong +
                " " + secondLong + signSecondLong + " " + sideLong);

    }
}
