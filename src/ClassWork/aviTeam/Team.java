package ClassWork.aviTeam;

import java.util.ArrayList;

public class Team <T extends Player> {

    //Name of the team
    private String name;
    private int wins;
    private int loses;
    private int ties;

    private ArrayList<T> players;

    public Team(String name) {

        //Init name instance variable
        this.name = name;

        //Initialize variables
        wins = loses = ties = 0;

        //New instance of ArrayList
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getTies() {
        return ties;
    }


    public boolean addPlayer(T player) {

        if (player.isHasTeam()) {
            System.out.println(player.getName() + " is already in a team!");
            return false;
        }

        System.out.println(player.getName() + " was added successfully!");
        player.setHasTeam(true);

        return players.add(player);
    }

    public int getNumPlayers() {
        return players.size();
    }

    public void matchResult(Team opponent, int ourScore, int opponentScore) {

        if (ourScore > opponentScore)
            wins++;
        else if (ourScore < opponentScore)
            loses++;
        else
            ties++;

        if (opponent != null)
            opponent.matchResult(null, opponentScore, ourScore);
    }

    @Override
    public String toString() {
        return name + " won " + wins;
    }

}
