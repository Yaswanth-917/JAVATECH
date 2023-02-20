import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final String[] TIME = {"Morning", "Afternoon"};
    private static final int MATCHES_PER_DAY = 2;
    private static final int NUM_TEAMS = 5;

    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();
        teams.add("Team1");
        teams.add("Team2");
        teams.add("Team3");
        teams.add("Team4");
        teams.add("Team5");

        ArrayList<Match> schedule = new ArrayList<>();

        int matchNumber = 1;
        for (int day = 1; day <= NUM_TEAMS - 1; day++) {
            ArrayList<String> availableTeams = new ArrayList<>(teams);
            for (int match = 1; match <= MATCHES_PER_DAY; match++) {
                String timeSlot = TIME[new Random().nextInt(TIME.length)];
                String homeTeam = availableTeams.remove(new Random().nextInt(availableTeams.size()));
                String awayTeam = availableTeams.remove(new Random().nextInt(availableTeams.size()));
                schedule.add(new Match(day, matchNumber, homeTeam, awayTeam, timeSlot));
                matchNumber++;
            }
        }

        for (Match match : schedule) {
            System.out.println("Day " + match.getDay()  + " - " + match.getHomeTeam() + " vs " + match.getAwayTeam() + " - " + match.getMatchTime());
        }
    }
}
