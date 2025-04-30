// soter class which will sort players
public class Sorter{
   public static void selectionSortByRating(Player[] players){ //this sort method will start, compare the first int with the second and so on.
      for (int i = 0; i < players.length - 1; i++) {
         int maxIndex = i;
         
        for (int j = i + 1; j < players.length; j++) {
            if (players[j].getRating() > players[maxIndex].getRating()) {// will check if the current player has higher rating than our current maximum
               maxIndex = j;
              }
         }
         Player temp = players[i];
         players[i] = players[maxIndex];
         players[maxIndex] = temp;
         
      }
   }
//same sorting method but we are using goals to arrange them from lowest to the highest goals
   public static void selectionSortByGoals(Player[] players) {
      
      for (int i = 0; i < players.length - 1; i++) { //current position has the minimum goals
         int minIndex = i;
         for (int j = i + 1; j < players.length; j++) { //player has fewer goals than our current minimum
            if (players[j].getGoals() < players[minIndex].getGoals()) {
               minIndex = j;
            }
         }
         
         Player temp = players[i];
         players[i] = players[minIndex];
         players[minIndex] = temp;
         
      }
   }
}

