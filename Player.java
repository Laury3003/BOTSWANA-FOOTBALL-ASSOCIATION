public class Player extends Sport
{
    private String playerName;
    private int playerID;
    private int age;
    private String position;
    private double rating;

    public Player(String playerName, int playerID,int age, String position,double rating, String sportName)
    {
        super(sportName);
        this.playerName = playerName;
        this.playerID = playerID;
        this.age = age;
        this.position = position;
        this.rating = rating;
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


}
