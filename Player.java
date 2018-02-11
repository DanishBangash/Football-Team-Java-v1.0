
/**
 * Write a description of class Player here.
 * 
 * @author (Danish Bangash) 
 * @version (v1.0 25-10-2012)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int numberOfAppearnces;
    private int numberOfgoalScored;
    private String name;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
        numberOfAppearnces = 0;
        numberOfgoalScored = 0;
        this.name = name;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void increaseAppearnces()
    {
      this.numberOfAppearnces ++;
    }
    
    public int getAppearnces()
    {
        return numberOfAppearnces;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void increaseGoals()
    {
        this.numberOfgoalScored ++;
    }
    
    public int getGoals()
    {
        return numberOfgoalScored;
    }
    
    public void Setname(String name)
    {
        this.name = name;
    }
    public void getPlayerData()
    {
        System.out.println("  Name Of Player : "  + this.name+ "");
        System.out.println("  Matches Played : " + this.numberOfAppearnces);
        System.out.println("  Goals Scored : " + this.numberOfgoalScored); 
    }
}
