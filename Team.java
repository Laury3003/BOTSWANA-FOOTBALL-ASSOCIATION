public class Team extends Sport {
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

}