//TODO Ranked scoreboard
//TODO Goals

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        League league = null;
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    if (league == null) {
                        System.out.print("Insert a name for your league: ");
                        String league_name = input.nextLine();
                        System.out.print("Insert the number of teams in your league: ");
                        int teams_number = getInt();
                        league = new League(league_name, teams_number);
                        league.createTeams();
                    }
                    else System.out.println("You have already created your league!");
                    break;
                case 2:
                    if (league == null) {
                        league = new League("NBA", 3);
                        league.autoSetup();
                        System.out.println("Success");
                    }
                    else System.out.println("You have already created your league!");
                    break;
                case 3:
                    if (league == null) System.out.println("You need to create your league first!");
                    else {
                        int teamA, teamB, scoreA, scoreB;
                        league.listTeams();
                        System.out.println("Create a new game");
                        System.out.print("Insert team A number: ");
                        teamA = getInt();
                        System.out.print("Insert team B number: ");
                        teamB = getInt();
                        System.out.print("Insert team A result: ");
                        scoreA = getInt();
                        System.out.print("Insert team B result: ");
                        scoreB = getInt();
                        char resultA = 'l', resultB = 'l'; // default "lose" for both teams //TODO shorter?
                        if (scoreA > scoreB) resultA = 'w'; // update the winner or change to tie by score
                        else if (scoreB > scoreA) resultB = 'w';
                        else resultA = resultB = 't';
                        league.teams[teamA].game(resultA); // send game result to team instances
                        league.teams[teamB].game(resultB);
                    }
                    break;
                case 4:
                    if (league == null) System.out.println("You need to create your league first!");
                    else league.listTeams();
                    break;
                case 5:
                    if (league == null) System.out.println("You need to create your league first!");
                    else league.scoreboard();
                    break;
                default:
                    System.out.println("Your choice does not exist!");
            }

        } while(choice != 0);
    }

    private static int menu() {
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. Create your league");
        System.out.println("2. Create default league");
        System.out.println("3. Add game");
        System.out.println("4. Print team list");
        System.out.println("5. Print scoreboard");
        System.out.print("Insert your choice: ");
        return getInt();
    }

    private static int getInt() {
        Scanner input = new Scanner(System.in);
        int in = 0;
        try {
            in = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException error) {
            System.out.println("You did not enter an integer value");
        }
        return in;
    }
}
