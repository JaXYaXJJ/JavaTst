package ClassWork.aviTeam;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BaseballPlayer reese = new BaseballPlayer("Reese McGuire",1);
        SoccerPlayer son = new SoccerPlayer("Heung Min Son", 2);
        TennisPlayer rafa = new TennisPlayer("Rafael Nadal",3);
        SoccerPlayer foden = new SoccerPlayer("Phil Foden", 4);
        SoccerPlayer saka = new SoccerPlayer("Bukayo Saka", 5);

        Team<TennisPlayer> tennisTeam = new Team<>("Tennis Team");

        Team<SoccerPlayer> spurs = new Team("Tottenham Hotspur");
        Team<SoccerPlayer> everton = new Team("Everton");

        Team<BaseballPlayer> sox = new Team<>("Boston Red Sox");
        Team<BaseballPlayer> giants = new Team<>("San Francisco Giants");


        spurs.addPlayer(son);
        tennisTeam.addPlayer(rafa);
        everton.addPlayer(foden);

        spurs.matchResult(everton,3,1);
        sox.matchResult(giants,0,2);
        giants.matchResult(sox,4,2);


        List<Team<?>> sportsTeam = new ArrayList<>();

        sportsTeam.add(spurs);
        sportsTeam.add(everton);
        sportsTeam.add(sox);
        sportsTeam.add(giants);

        sportsTeam.sort((teamOne,teamTwo) -> {
            return teamTwo.getWins() - teamOne.getWins();
        });

        System.out.println(sportsTeam);

    }
}
