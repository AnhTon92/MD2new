package baitap.bai11;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        // B2: Add teams to the list
        teams.add(new FootballTeam(1, "Team A", 11, 15));
        teams.add(new FootballTeam(2, "Team B", 11, 20));
        teams.add(new FootballTeam(3, "Team C", 11, 10));

        // B3: Call sorting methods
        Sorting.bubbleSort(teams);
        // Sorting.insertionSort(teams);
        // Sorting.selectionSort(teams);

        // B4: Print sorted list
        System.out.println("Danh sách đội bóng sau khi sắp xếp:");
        for (FootballTeam team : teams) {
            System.out.println(team.getName() + " - Điểm: " + team.getScore());
        }
    }
}
