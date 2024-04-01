package baitap.bai11;

import java.util.Collections;
import java.util.List;

public class Sorting {
    // Bubble Sort
    public static void bubbleSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (teams.get(j).getScore() < teams.get(j + 1).getScore()) {
                    Collections.swap(teams, j, j + 1);
                }
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(List<FootballTeam> teams) {
        for (int i = 1; i < teams.size(); i++) {
            FootballTeam key = teams.get(i);
            int j = i - 1;

            while (j >= 0 && teams.get(j).getScore() < key.getScore()) {
                teams.set(j + 1, teams.get(j));
                j = j - 1;
            }
            teams.set(j + 1, key);
        }
    }

    // Selection Sort
    public static void selectionSort(List<FootballTeam> teams) {
        for (int i = 0; i < teams.size() - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < teams.size(); j++)
                if (teams.get(j).getScore() > teams.get(max_idx).getScore())
                    max_idx = j;

            Collections.swap(teams, max_idx, i);
        }
    }
}
