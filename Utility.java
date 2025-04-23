public class Utility implements TeamManagement
{
    public static void selectionSort(Teams[] teams)
    {
        for(int i = 0; i < teams.length -1; i++)
        {
            int minIndex = i;

           for(int j = i + 1; j < teams.length; j++)
            {
                if(teams[j].ranking < teams[minIndex].ranking)
                {
                    minIndex = j;
                }
            } 

         Teams temp = teams [minIndex];
         teams [minIndex] = teams [i];
         teams [i] = temp;

        }
    }

    @Override 
    public int ratingcalculator(int wins, int gamesPlayed)
    {
        return(wins / gamesPlayed) * 100;
    }

}