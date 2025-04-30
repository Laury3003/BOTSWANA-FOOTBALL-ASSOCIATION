import java.util.ArrayList;
import java.util.Scanner;

public class Football extends TeamDataHandler{
   
   private Scanner scanner = new Scanner(System.in);
   public Football() {
      teams = new ArrayList<Team>();
      
      Team t1 = new Team("Gaborone Stars");
      t1.addPlayer(new Player(1, "John", "Midfielder", 4, 8.5, false));
      t1.addPlayer(new Player(2, "Mark", "Defender", 1, 7.2, true));
      
      Team t2 = new Team("Francistown United");
      t2.addPlayer(new Player(3, "Leo", "Forward", 6, 9.1, true));
      t2.addPlayer(new Player(4, "Peter", "Goalkeeper", 0, 7.9, false));
      
      teams.add(t1);
      teams.add(t2);
   }

   public void inputTeamData() {
      //Get team name from user
      System.out.print("Enter name of new team: ");
      String teamName = scanner.nextLine();
      Team team = new Team(teamName);
      
      //Get number of players for this team
      System.out.print("Enter number of players for " + teamName + ": ");
      int playerCount = Integer.parseInt(scanner.nextLine());
      
      // Loop to gather information for each player
      for (int i = 0; i < playerCount; i++) {
         System.out.println("Player " + (i + 1) + ":");
         
         // Get player ID
         System.out.print("  Player ID: ");
         int id = Integer.parseInt(scanner.nextLine());
         
         //Get player name
         System.out.print("  Name: ");
         String name = scanner.nextLine();
         
         //Get player position
         System.out.print("  Position: ");
         String position = scanner.nextLine();
         
         //Get number of goals scored by player
         System.out.print("  Goals: ");
         int goals = Integer.parseInt(scanner.nextLine());
         
         //Get player rating
         System.out.print("  Rating: ");
         double rating = Double.parseDouble(scanner.nextLine());
         
         //Get favorite status of player
         System.out.print("  Favourite? (true/false): ");
         boolean isFav = Boolean.parseBoolean(scanner.nextLine());
         
         // Create player object and add to team
         Player p = new Player(id, name, position, goals, rating, isFav);
         team.addPlayer(p);
      }
      
      // Add completed team to teams list
      teams.add(team);
   }
   
   public void displayRankings() {
      for (int i = 0; i < teams.size() - 1; i++) {
         for (int j = i + 1; j < teams.size(); j++) {
            if (teams.get(j).getAverageRating() > teams.get(i).getAverageRating()) {
               Team temp = teams.get(i);
               teams.set(i, teams.get(j));
               teams.set(j, temp);
            }
         }
      }
      
      System.out.println("\n--- Team Rankings ---");
      for (int i = 0; i < teams.size(); i++) {
         Team t = teams.get(i);
         System.out.printf("Team: %-20s | Avg Rating: %.2f\n", t.getName(), t.getAverageRating());
      }
   }

   public void showBestAndFavourites() {
      for (int i = 0; i < teams.size(); i++) {
         Team t = teams.get(i);
         System.out.println("\nTeam: " + t.getName());
         
         Player best = t.getBestPlayer();
         Player fav = t.getFavouritePlayer();
         
         // Display best player information or N/A if not available same for favourite
         System.out.println("  Best Player: " + (best != null ? best.toString() : "N/A")); 
         System.out.println("  Favourite Player: " + (fav != null ? fav.toString() : "N/A"));
      }
   }

   public void manageTeamsAndPlayers() {
      boolean running = true;
      while (running) {
         //displayingg management menu options
         System.out.println("\n--- Management Menu ---");
         System.out.println("1. Add New Team");
         System.out.println("2. Delete Team");
         System.out.println("3. Add Player to Team");
         System.out.println("4. Remove Player from Team");
         System.out.println("5. View All Teams");
         System.out.println("6. Exit Management");
         System.out.print("Choose an option: ");
         int choice = Integer.parseInt(scanner.nextLine());
         
         if (choice == 1) {
            // Option 1: Add a new team with players
            inputTeamData();
         } else if (choice == 2) {
            // Option 2: Delete an existing team
            System.out.print("Enter team name to delete: ");
            String name = scanner.nextLine();
            boolean removed = false;
            // Search for team by name
            for (int i = 0; i < teams.size(); i++) {
               if (teams.get(i).getName().equalsIgnoreCase(name)) {
                  teams.remove(i);
                  removed = true;
                  break;
               }
            }
            // Display result of team deletion attempt
            if (removed) {
               System.out.println("Team deleted.");
            } else {
               System.out.println("Team not found.");
            }
         } else if (choice == 3) {
            // Option 3: Add a player to an existing team
            System.out.print("Enter team name to add player: ");
            String teamName = scanner.nextLine();
            Team team = findTeam(teamName);
            if (team != null) {
               // Collect player information
               System.out.print("Enter player ID: ");
               int id = Integer.parseInt(scanner.nextLine());
               System.out.print("Enter name: ");
               String name = scanner.nextLine();
               System.out.print("Enter position: ");
               String position = scanner.nextLine();
               System.out.print("Enter goals: ");
               int goals = Integer.parseInt(scanner.nextLine());
               System.out.print("Enter rating: ");
               double rating = Double.parseDouble(scanner.nextLine());
               System.out.print("Is favourite (true/false): ");
               boolean isFav = Boolean.parseBoolean(scanner.nextLine());
               
               // Create and add player to the team
               team.addPlayer(new Player(id, name, position, goals, rating, isFav));
               System.out.println("Player added.");
            } else {
               System.out.println("Team not found.");
            }
         } else if (choice == 4) {
            // Option 4: Remove a player from a team
            System.out.print("Enter team name: ");
            String teamName = scanner.nextLine();
            Team team = findTeam(teamName);
            if (team != null) {
               // Get player ID to remove
               System.out.print("Enter player ID to remove: ");
               int id = Integer.parseInt(scanner.nextLine());
               boolean removed = false;
               // Search for player by ID
               for (int i = 0; i < team.getPlayers().size(); i++) {
                  if (team.getPlayers().get(i).getPlayerId() == id) {
                     team.getPlayers().remove(i);
                     removed = true;
                     break;
                  }
               }
               // Display result of player removal attempt
               if (removed) {
                  System.out.println("Player removed.");
               } else {
                  System.out.println("Player not found.");
               }
            } else {
               System.out.println("Team not found.");
            }
         } else if (choice == 5) {
            // Option 5: View information for all teams
            for (int i = 0; i < teams.size(); i++) {
               teams.get(i).displayTeamInfo();
            }
         } else if (choice == 6) {
            // Option 6: Exit management menu
            running = false;
         } else {
            // Handle invalid menu options
            System.out.println("Invalid option.");
         }
      }
   }
   
   private Team findTeam(String name) {
      for (int i = 0; i < teams.size(); i++) {
         if (teams.get(i).getName().equalsIgnoreCase(name)) {
            return teams.get(i);
         }
      }
      // Return null if no matching team is found
      return null;
   }
}
