package JavaTst.groupBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum GroupBy {
    AGE, LOCALITY
}
public class Team<T extends Player> {

    public static void main(String[] args) {

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>();

        soccerPlayerTeam.addPlayer(new SoccerPlayer(10, "Son", 27, "KO"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer(11, "Di Maria", 27, "AG"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer(1, "Pickford", 26, "UK"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer(17, "Saka", 20, "UK"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer(22, "Gnabri", 26, "GR"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer(10, "Messi", 30, "AG"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer(9, "Lukaku", 26, "BL"));

        Map<String, List<SoccerPlayer>> groupedByLocality = soccerPlayerTeam.groupBy(GroupBy.LOCALITY);
        Map<Integer, List<SoccerPlayer>> groupedByAge = soccerPlayerTeam.groupBy(GroupBy.AGE);

        System.out.println(groupedByLocality);
        System.out.println(groupedByAge);
    }

    private ArrayList<T> players;

    public Team() {

        players = new ArrayList<>();
    }

    public <H> Map<H, List<T>> groupBy(GroupBy by) {

        if (by == GroupBy.AGE) {
            return players.stream()
                    .collect(Collectors.groupingBy(t -> (H) Integer.valueOf(t.getAge())));
        } else if (by == GroupBy.LOCALITY) {
            return players.stream()
                    .collect(Collectors.groupingBy(t -> (H) (t.getLocality())));
        }
        return new HashMap<>();
    }

    public boolean addPlayer(T player) {
        return players.add(player);
    }

    public boolean removePlayer(T player) {
        return players.remove(player);
    }

    public int getNumPlayers() {
        return players.size();
    }
}
