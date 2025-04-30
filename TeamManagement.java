// TeamManager.java
// This interface defines the blueprint for managing teams in the football system.
// It ensures any implementing class provides core functionality for team input,
// displaying team rankings, and showing key player insights.

public interface TeamManagement {
    void inputTeamData();
    void displayRankings();
    void showBestAndFavourites();
}