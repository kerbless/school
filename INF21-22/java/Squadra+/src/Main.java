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
                    if (league == null) league = createLeague();
                    else System.out.println("You have already created your league!");
                    break;
                case 2:
                    if (league == null) System.out.println("You need to create your league first!");
                    else league.
                    break;
                default:
                    System.out.println("Your choice does not exist!");
            }

        } while(choice != 0);
    }

    private static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. Create your league");
        System.out.println("2. Add game");
        System.out.println("3. Print scoreboard");
        System.out.print("Insert your choice: ");
        return getInt();
    }

    private static League createLeague() {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert a name for your league: ");
        String league_name = input.nextLine();
        System.out.print("Insert the number of teams in your league: ");
        int teams_number = getInt();
        League league = new League(league_name, teams_number);
        league.createTeams();
        return league;
    }

    private static int getInt() {
        Scanner input = new Scanner(System.in);
        int in = 0;
        try {
            in = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException error) {
            System.out.println("Non hai inserito un valore intero");
        }
        return in;
    }
}
