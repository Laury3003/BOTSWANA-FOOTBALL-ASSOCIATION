public class Player
{
    private String playerName;
    private int playerID;
    private int age;
    private String position;
    private double rating;
    private int goals;
    private boolean isFavourite;

    public Player(String playerName, int playerID,int age, String position,double rating,int goals,boolean isFavourite )
    {
        this.playerName = playerName;
        this.playerID = playerID;
        this.age = age;
        this.position = position;
        this.rating = rating;
        this.goals = goals;
        this.isFavourite = isFavourite; 
    }

    //Getters and setters
    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

     public String getPlayerID() 
    {
        return playerID;
    }

    public void setPlayerID(String playerID)
    {
        this.playerID = playerID;
    }

     public int getAge() 
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

     public String getPosition() 
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

     public String getRating() 
    {
        return rating;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }
    
    public int getGoals()
    {
        return goals;
    }

    public void setGoals(int goals)
    {
        this.goals = goals
    }

    public boolean getIsFavourite()
    {
        return isFavourite;
    }

    public void setIsFavourite()
    {
        this.isFavourite = isFavourite;      
    }
    @Override
    public String toString() {
        return "Player ID: " + playerId + ", Name: " + playerName + ", Position: " + position +
               ", Goals: " + goals + ", Rating: " + rating + ", Favourite: " + isFavourite;
 }
}