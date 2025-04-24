// Football.java
// Concrete class that extends TeamDataHandler to provide implementation of all
// required methods: data input, ranking display, and best/favourite player output.

import java.util.Arrays;

public class Football extends TeamDataHandler {

    @Override
    public void inputTeamData() {
        int teamCount = Utility.readInt("Enter number of teams: ");
        teams = new Team[teamCount];

        for (int i = 0; i < teamCount; i++) {
            String teamName = Utility.readLine("Enter name of team " + (i + 1) + ": ");
            teams[i] = new Team(teamName);

            int playerCount = Utility.readInt("Enter number of players in " + teamName + ": ");
            for (int j = 0; j < playerCount; j++) {
                int id = Utility.readInt("  Player ID: ");
                String name = Utility.readLine("  Player Name: ");
                String position = Utility.readLine("  Position: ");
                int goals = Utility.readInt("  Goals: ");
                double rating = Utility.readDouble("  Rating: ");
                boolean isFav = Utility.readBoolean("  Mark as Favourite?");

                Player p = new Player(id, name, position, goals, rating, isFav);
                teams[i].addPlayer(p);
            }
        }
    }

    @Override
    public void displayRankings() {
        Arrays.sort(teams, (a, b) -> Double.compare(b.getAverageRating(), a.getAverageRating()));
        System.out.println("\n--- Team Rankings by Average Rating ---");
        for (Team team : teams) {
            System.out.printf("Team: %-15s | Avg Rating: %.2f\n", team.getName(), team.getAverageRating());
        }
    }

    @Override
    public void showBestAndFavourites() {
        for (Team team : teams) {
            System.out.println("\nTeam: " + team.getName());
            Player best = team.getBestPlayer();
            Player fav = team.getFavouritePlayer();
            System.out.println("  Best Player: " + (best != null ? best.getName() : "N/A"));
            System.out.println("  Favourite Player: " + (fav != null ? fav.getName() : "N/A"));
        }
    }
}
