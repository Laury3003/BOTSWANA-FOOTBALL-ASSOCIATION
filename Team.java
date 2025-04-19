public class Team extends Sport{
    private String teamName;
    private String teamID;
    private String establishment;
    private String origin;
    private String teamPlayers;
    private int rank;

    public Team(String sportName, String teamName, String teamID, String establishment, String origin, String teamPlayers, int rank){
        super(sportName);
        this.teamName = teamName;
        this.teamID = teamID;
        this.establishment = establishment;
        this.origin = origin;
        this.teamPlayers = teamPlayers;
        this.rank = rank; 
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
    public String getTeamPlayers(){
        return teamPlayers;
    }
    public void setTeamPlayers(String teamPlayers){
    this.teamPlayers = teamPlayers;
}
    public int getRank(){
        return rank;
    }
    public void setRank(int rank){
        this.rank = rank;
    }

}