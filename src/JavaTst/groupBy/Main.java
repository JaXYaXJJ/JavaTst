package JavaTst.groupBy;

public class Main {
    public static void main(String[] args) {

        Player player = new NBAPlayer(12, "Morant", 23, "US");
        Player player2 = new SoccerPlayer(17, "Saka", 20, "UK");

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>();
        soccerPlayerTeam.addPlayer(new SoccerPlayer(10, "Son", 27, "KO"));

        Team<NBAPlayer> nbaPlayerTeam = new Team<>();
        nbaPlayerTeam.addPlayer(new NBAPlayer(34,"Antetokounmpo", 24, "GE"));
    }
}
