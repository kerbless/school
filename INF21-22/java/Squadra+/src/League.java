import java.util.Scanner;

public class League {
    Scanner input = new Scanner(System.in);
    private String name;
    private int nTeams;
    Team[] teams = null;

    public League(String league_name, int number_of_teams) {
        this.name = league_name;
        nTeams = number_of_teams;
    }

    public void createTeams() {
        Team[] teams = new Team[nTeams];
        String in_name, in_city;
        for (int i = 0; i < nTeams; i++) {
            System.out.print("Team [" + i + "] insert name: ");
            in_name = input.nextLine();
            System.out.print("Team [" + i + "] insert city: ");
            in_city = input.nextLine();
            teams[i] = new Team(in_name, in_city);
        }
    }

    public void newGame(int teamA, int teamB, int scoreA, int scoreB) {
        char resultA = resultB = 'l';
        if (scoreA > scoreB) resultA = 'w';
        }
        else if (scoreB > scoreA) resultB = 'w';
        else resultA = resultB = 't'
        teams[teamA].game(resultA);
        teams[teamB].game(resultB);
    }

    public void listTeams() {
        for(int i = 0; i < nTeams; i++) System.out.println("[" + i + "] " + teams[i].getName() + " (" + teams[i].getLocation() + ")");
    }

}
