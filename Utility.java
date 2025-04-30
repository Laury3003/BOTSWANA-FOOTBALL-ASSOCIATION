/**
 * Utility class providing search methods for football data.
 */

public class SearchUtility 
{
   /**
    * Performs a linear search on an array of Player objects to find a player by name.
    * The search is case-insensitive, so "John" will match "john" or "JOHN".
    */
   
   public static int linearSearchByName(Player[] players, String name)
   {
      // Loop through the entire player array
      for (int i = 0; i < players.length; i++) {
         // Perform case-insensitive comparison of player names
         if (players[i].getName().equalsIgnoreCase(name)) {
            // Return index position when match is found
            return i;
         }
      }
      // Return -1 to indicate that no matching player was found
      return -1;
   }

}
