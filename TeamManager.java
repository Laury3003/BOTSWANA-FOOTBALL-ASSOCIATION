/**
 * The TeamManager interface defines the core operations for managing sports teams.
 */
public interface TeamManager {
    
    /**
     * Collects and processes team data from a data source.
     */
    void inputTeamData();
    
    /**
     * Displays teams in rank order based on implementation-specific criteria..
     */
    void displayRankings();
    
    /**
     * Shows information about the best-performing teams and user favorites.
     */
    void showBestAndFavourites();
}