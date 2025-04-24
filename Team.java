import java.util.ArrayList;

public class Team extends Sport{
    private String teamName;
    private String teamID;
    private String establishment;
    private String origin;
    private int rank;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String sportName, String teamName, String teamID, String establishment, String origin, int rank){
        super(sportName);
        this.teamName = teamName;
        this.teamID = teamID;
        this.establishment = establishment;
        this.origin = origin; 
    }

    public void addPlayer(Player player) {
        players.add(player);
        calculateRank();
    }
    
    public void calculateRank() {
        if (players == null || players.isEmpty()) {
            this.rank = 0;
            return;
        }
        double total = 0;
        for (Player p : players) {
            total += p.getRating();
        }
        this.rank = (int)(total / players.size());
    }
    
    public String getTeamName(){
        return teamName;
    }
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }
    public String getTeamID(){
        return teamID;
    }
    public void setTeamID(String teamID){
        this.teamID = teamID;
    }
    public String getEstablishment(){
        return establishment;
    }
    public void setEstablishment(String establishment){
        this.establishment = establishment;
    }
    public String getOrigin(){
        return origin;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }
    public int getRank(){
        return rank;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public ArrayList <Player> getPlayers() {
        return players;
    }

}
