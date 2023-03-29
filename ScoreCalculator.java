import java.util.*;

public class ScoreCalculator {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> Scores = new HashMap<>();
        Scores.put(1, Arrays.asList(10, 20, 10));
        Scores.put(2, Arrays.asList(10, 20, 11));

        Map<Integer, Integer> TotalScores = new HashMap<>();

        for (Map.Entry<Integer, List<Integer>> entry : Scores.entrySet()) {
            int Id = entry.getKey();
            List<Integer> scores = entry.getValue();
            int totalScore = 0;

            for (int score : scores) {
                totalScore += score;
            }

            TotalScores.put(Id, totalScore);
        }

        System.out.println("Student ID\tTotal Score");
        for (Map.Entry<Integer, Integer> entry : TotalScores.entrySet()) {
            int Id = entry.getKey();
            int totalScore = entry.getValue();
            System.out.println(Id + "\t\t" + totalScore);
        }
    }
}
