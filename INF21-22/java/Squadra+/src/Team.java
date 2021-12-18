public class Team {
    private String name;
    private String location;
    private int games;
    private int wins;
    private int loses;
    private int ties;

    public Team(String name, String location) {
        this.name = name;
        this.location = location;
        games = wins = loses = ties = 0;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getGames() {
        return games;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return loses;
    }

    public int getTies() {
        return ties;
    }

    public int getScore() { return wins*3+ties;}

    public void game(char result) {
    /* Results:
    *   w : win
    *   l : lose
    *   t : tie
    */
        games++;
        if(result == 'w') wins++;
        else if(result == 'l') loses++;
        else if(result == 't') ties++;
    }
}
