package ua.hillel.kostiuk.lessons.lesson7.HW9;

import java.util.Arrays;

public class AgePlayers {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];

        int sumAgeTeam1 = 0;
        int sumAgeTeam2 = 0;

        int minAgePlayer = 18;
        int maxAgePlayer = 40;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = minAgePlayer + (int) (Math.random() * ((maxAgePlayer - minAgePlayer) + 1));
        }
        for (int i = 0; i < team2.length; i++) {
            team2[i] = minAgePlayer + (int) (Math.random() * ((maxAgePlayer - minAgePlayer) + 1));
        }

        for (int age : team1) {
            sumAgeTeam1 += age;
        }
        for (int age : team2) {
            sumAgeTeam2 += age;
        }

        System.out.println("Team 1:" + Arrays.toString(team1));
        System.out.println("Team 2:" + Arrays.toString(team2));

        double avgAgeTeam1 = (double) sumAgeTeam1 / team1.length;
        double avgAgeTeam2 = (double) sumAgeTeam2 / team1.length;

        System.out.println("Average age team 1 : " + avgAgeTeam1);
        System.out.println("Average age team 2 : " + avgAgeTeam2);
    }
}

