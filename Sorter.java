/**
 * Utility class providing sorting methods for football player data.
 * This class contains static methods implementing selection sort algorithms
 * to sort Player arrays based on various criteria.
 */
public class Sorter
{

   /**
    * Sorts an array of Player objects in descending order by their rating.
    * Uses the selection sort algorithm to arrange players from highest
    * to lowest rating.
    */
   public static void selectionSortByRating(Player[] players)
   {
      // Iterate through the array from beginning to second-to-last element
      for (int i = 0; i < players.length - 1; i++) {
         // Assume current position has the maximum rating
         int maxIndex = i;
         
         // Find the player with maximum rating in the remaining unsorted array
         for (int j = i + 1; j < players.length; j++) {
            // If current player has higher rating than our current maximum
            if (players[j].getRating() > players[maxIndex].getRating()) {
               // Update maxIndex to this position
               maxIndex = j;
            }
         }
         
         // Swap the player at current position with the player having maximum rating
         Player temp = players[i];
         players[i] = players[maxIndex];
         players[maxIndex] = temp;
      }
   }

   /**
    * Sorts an array of Player objects in ascending order by their goal count.
    * Uses the selection sort algorithm to arrange players from lowest
    * to highest number of goals.
    */
   
   public static void selectionSortByGoals(Player[] players)
   {
      // Iterate through the array from beginning to second-to-last element
      for (int i = 0; i < players.length - 1; i++) {
         // Assume current position has the minimum goal count
         int minIndex = i;
         
         // Find the player with minimum goal count in the remaining unsorted array
         for (int j = i + 1; j < players.length; j++) {
            // If current player has fewer goals than our current minimum
            if (players[j].getGoals() < players[minIndex].getGoals()) {
               // Update minIndex to this position
               minIndex = j;
            }
         }
         
         // Swap the player at current position with the player having minimum goals
         Player temp = players[i];
         players[i] = players[minIndex];
         players[minIndex] = temp;
      }
   }
}
