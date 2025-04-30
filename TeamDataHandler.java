import java.util.ArrayList;

/**
 * Abstract class that implements the TeamManager interface.
 * This class provides a base implementation structure for team management operations.
 * It contains a protected ArrayList of teams that can be manipulated by subclasses.
 */
public abstract class TeamDataHandler implements TeamManager {
    /**
     * Protected ArrayList to store the team objects.
     * This data structure is accessible to all subclasses.
     */
    protected ArrayList<Team> teams;
    
}