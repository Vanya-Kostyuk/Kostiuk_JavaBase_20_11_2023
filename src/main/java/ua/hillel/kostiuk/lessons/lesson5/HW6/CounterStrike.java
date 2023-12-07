package ua.hillel.kostiuk.lessons.lesson5.HW6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
//        team 1
        String nameTeam1;
        int fragsFistPlayerTeam1 = 0;
        int fragsSecondPlayerTeam1 = 0;
        int fragsThirdPlayerTeam1 = 0;
        int fragsPlayerForthTeam1 = 0;
        int fragsPlayerFifthTeam1 = 0;

//        team 2
        String nameTeam2;
        int fragsFistPlayerTeam2 = 0;
        int fragsSecondPlayerTeam2 = 0;
        int fragsThirdPlayerTeam2 = 0;
        int fragsPlayerForthTeam2 = 0;
        int fragsPlayerFifthTeam2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я першої команди : ");
        nameTeam1 = scanner.nextLine();
        System.out.println("Team 1 : " + nameTeam1);
        System.out.println("Введіть кількість фрагів для 5-ти гравців першої команди : ");
        if(scanner.hasNextInt()) {
            fragsFistPlayerTeam1 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }if(scanner.hasNextInt()) {
            fragsSecondPlayerTeam1 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }if(scanner.hasNextInt()) {
            fragsThirdPlayerTeam1 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }if(scanner.hasNextInt()) {
            fragsPlayerForthTeam1 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }if(scanner.hasNextInt()) {
            fragsPlayerFifthTeam1 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        scanner.nextLine();

        System.out.println("Введіть ім'я другої команди : ");
        nameTeam2 = scanner.nextLine();
        System.out.println("Team 2 : " + nameTeam2);
        System.out.println("Введіть кількість фрагів для 5-ти гравців другої команди : ");
        if(scanner.hasNextInt()) {
            fragsFistPlayerTeam2 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }if(scanner.hasNextInt()) {
            fragsSecondPlayerTeam2 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }if(scanner.hasNextInt()) {
            fragsThirdPlayerTeam2 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }if(scanner.hasNextInt()) {
            fragsPlayerForthTeam2 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }if(scanner.hasNextInt()) {
            fragsPlayerFifthTeam2 = scanner.nextInt();
        }  else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        int countPlayers = 5;
        int resultTeam1 = fragsFistPlayerTeam1 + fragsSecondPlayerTeam1 + fragsThirdPlayerTeam1
                + fragsPlayerForthTeam1 + fragsPlayerFifthTeam1;

        double avgTeam1 = ((double) (fragsFistPlayerTeam1 + fragsSecondPlayerTeam1 + fragsThirdPlayerTeam1
                + fragsPlayerForthTeam1 + fragsPlayerFifthTeam1) / countPlayers);
        System.out.println("Середнє арифметичне team " + nameTeam1 + " : " + avgTeam1);

        int resultTeam2 = fragsFistPlayerTeam2 + fragsSecondPlayerTeam2 + fragsThirdPlayerTeam2
                + fragsPlayerForthTeam2 + fragsPlayerFifthTeam2;

        double avgTeam2 = ((double) (fragsFistPlayerTeam2 + fragsSecondPlayerTeam2 + fragsThirdPlayerTeam2
                + fragsPlayerForthTeam2 + fragsPlayerFifthTeam2) / countPlayers);
        System.out.println("Середнє арифметичне team " + nameTeam2 + " : " + avgTeam2);

        if(resultTeam1 > resultTeam2) {
            System.out.println("Перемогла команда " + nameTeam1 + " набрала " + resultTeam1 + " очків");
        } else if (resultTeam1 < resultTeam2) {
            System.out.println("Перемогла команда " + nameTeam2 + " набрала " + resultTeam2 + " очків ");
        } else {
            System.out.println("Нічия!");
        }
    }
}
