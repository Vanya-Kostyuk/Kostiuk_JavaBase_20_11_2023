package ua.hillel.kostiuk.lessons.lesson4.HW5;

public class Main {
    public static void main(String[] args) {
        int warriorLee = 13;
        int archerLee = 24;
        int cavalierLee = 46;
        int countEachTypeSoldiersLee = 860;

        int warriorLeeAttacks = countEachTypeSoldiersLee * warriorLee;
        int archerLeeAttacks = countEachTypeSoldiersLee * archerLee;
        int cavalierLeeAttacks = countEachTypeSoldiersLee * cavalierLee;
        System.out.println("Показник атаки воїнів Lee : " + warriorLeeAttacks);
        System.out.println("Показник атаки лучників Lee : " + archerLeeAttacks);
        System.out.println("Показник атаки вершників Lee : " + cavalierLeeAttacks);

        System.out.println();

        int warriorMing = 13;
        int archerMing = 24;
        int cavalierMing = 46;
        int countEachTypeSoldiersMing =(int) (countEachTypeSoldiersLee * 1.5);

        int warriorMingAttacks = countEachTypeSoldiersMing * warriorMing;
        int archerMingAttacks = countEachTypeSoldiersMing * archerMing;
        int cavalierMingAttacks = countEachTypeSoldiersMing * cavalierMing;
        System.out.println("Показник атаки воїнів Ming : " + warriorMingAttacks);
        System.out.println("Показник атаки лучників Ming : " + archerMingAttacks);
        System.out.println("Показник атаки вершників Ming : " + cavalierMingAttacks);
    }
}
