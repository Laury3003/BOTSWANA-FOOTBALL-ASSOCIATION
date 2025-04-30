import java.util.ArrayList;

public class Team {
   private ArrayList<Player> players;
  
   public Team(String name) {
      this.name = name;
      this.players = new ArrayList<Player>();
   }

   public void addPlayer(Player player) {
      players.add(player);
   }

   public double getAverageRating() { // caculates the average of all player rating
      double total = 0;
      for (Player p : players) {
         total += p.getRating();
      }
         if (players.size() > 0) {
         return total / players.size();
         
      } else {
         return 0;
      }
   }
   public Player getBestPlayer(){ /// gets the player with highe rating
      
      if (players.isEmpty()) 
         return null;

      Player best = players.get(0); ///first player
      for (Player p : players) {

      if (p.getRating() > best.getRating()) {
            best = p;
         }
      }
      return best;
   }

   public Player getFavouritePlayer() {
      for (Player p : players) {
         if (p.isFavourite()) {
            return p;
         }
      }
      //return null if no favorite player is found
      return null;
   }

   public void displayTeamInfo() {
      System.out.println("Team: " + name);
      //displays the information for each player in the team
      for (Player p : players) {
         System.out.println("- " + p.toString());
      }
   }

   public String getName() {
      return name;
   }

   public ArrayList<Player> getPlayers() {
      return players;
   }
}
