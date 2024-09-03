import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of players
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Player[] players = new Player[n];

        // Read player details
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            players[i] = new Player(name, score);
        }

        // Sort the players array using the compareTo method
        Arrays.sort(players);

        // Output sorted players
        for (Player player : players) {
            System.out.println(player);
        }

        scanner.close();
    }
}
