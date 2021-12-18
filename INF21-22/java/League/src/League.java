import java.util.Scanner;

public class League {
    Scanner input = new Scanner(System.in);
    private final String name;
    private final int nTeams;
    private int maxName = 0;
    private int maxCity = 0;
    Team[] teams = null;

    public League(String league_name, int number_of_teams) {
        this.name = league_name;
        nTeams = number_of_teams;
    }

    public void createTeams() {
        teams = new Team[nTeams];
        String in_name, in_city;
        for (int i = 0; i < nTeams; i++) {
            System.out.print("Team [" + i + "] insert name: ");
            in_name = input.nextLine();
            System.out.print("Team [" + i + "] insert city: ");
            in_city = input.nextLine();
            teams[i] = new Team(in_name, in_city);
            if (in_name.length() > maxName) maxName = in_name.length();
            if (in_city.length() > maxCity) maxCity = in_city.length();
        }
        maxCity += 3; // adds necessary space for separator + parentheses
        maxName += 1; // adds necessary space for separator
    }

    public void listTeams() {
        System.out.println("\t" + name + " team list");
        System.out.printf("%-" + 7 + "s", "Number");
        System.out.printf("%-" + maxName + "s", "Name");
        System.out.printf("%-" + maxCity + "s", "City");
        System.out.println();
        for(int i = 0; i < nTeams; i++) {
            System.out.printf("%-" + 7 + "s", "[" + i + "] ");
            System.out.printf("%-" + maxName + "s", teams[i].getName());
            System.out.printf("%-" + maxCity + "s", "(" + teams[i].getLocation() + ")");
            System.out.println();
        }
    }

    public void scoreboard() {
        System.out.println(maxCity + " " + maxName);
        System.out.println("\t" + name + " team list");
        System.out.printf("%-" + 7 + "s", "Number");
        System.out.printf("%-" + maxName + "s", "Name");
        System.out.printf("%-" + maxCity + "s", "City");
        System.out.printf("%-" + 6 + "s", "Games");
        System.out.printf("%-" + 5 + "s", "Wins");
        System.out.printf("%-" + 7 + "s", "Losses");
        System.out.printf("%-" + 5 + "s", "Ties");
        System.out.printf("Score");
        System.out.println();
        System.out.println();
        for(int i = 0; i < nTeams; i++) {
            System.out.printf("%-" + 7 + "s", "[" + i + "] ");
            System.out.printf("%-" + maxName + "s", teams[i].getName());
            System.out.printf("%-" + maxCity + "s", "(" + teams[i].getLocation() + ")");
            System.out.printf("%-" + 6 + "s", teams[i].getGames());
            System.out.printf("%-" + 5 + "s", teams[i].getWins());
            System.out.printf("%-" + 7 + "s", teams[i].getLosses());
            System.out.printf("%-" + 5 + "s", teams[i].getTies());
            System.out.print(teams[i].getScore());
            System.out.println();
        }
    }

    public void autoSetup() {
        teams = new Team[nTeams];
        String in_name, in_city;
        teams[0] = new Team("Bulls", "Chicago");
        teams[1] = new Team("Lakers", "Los Angeles");
        teams[2] = new Team("Knicks", "New York");
        teams[0].game('w'); teams[1].game('l');
        teams[0].game('w'); teams[2].game('l');
        teams[2].game('w'); teams[1].game('l');
        maxName = 6+1;
        maxCity = 11+1+2;
    }
}
