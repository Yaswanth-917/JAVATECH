public class Match {
    private int day;
    private int matchNumber;
    private String homeTeam;
    private String awayTeam;
    private String matchTime;

    public Match(int day, int matchNumber, String homeTeam, String awayTeam, String matchTime) {
        this.day = day;
        this.matchNumber = matchNumber;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.matchTime = matchTime;
    }

    public int getDay() {
        return day;
    }

    public int getMatchNumber() {
        return matchNumber;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getMatchTime() {
        return matchTime;
    }
}