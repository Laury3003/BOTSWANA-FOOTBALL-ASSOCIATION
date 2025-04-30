public class SearchUtility {
   
   public static int linearSearchByName(Player[] players, String name){
      for (int i = 0; i < players.length; i++) {
         if (players[i].getName().equalsIgnoreCase(name)) {
            return i;
         }
      }
      return -1; //if i is not found
   }
}
