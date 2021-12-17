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

    public void win() {
        games++;
        wins++;
    }

    public void lose() {
        games++;
        loses++;
    }

    public void tie() {
        games++;
        ties++;
    }

    public int getGames() {
        return games;
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
}
