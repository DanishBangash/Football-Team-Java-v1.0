import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Team here.
 * 
 * @author (Danish Bangash) 
 * @version (v1.0 25-10-2012)
 */
public class Team
{
    private String teamName;
    private HashSet<Player> players;
    // private Iterator<Player> iterator;
    private Player player;
    private int topScore;
    /**
     * Constructor for objects of class Team
     */
    public Team(String name )
    {
        players = new HashSet<Player> ();
        this.teamName = name;
        this.topScore = -1;
        // this.player = new Player("default");

    }

    public void addPlayers(Player person)
    {
        this.players.add(person);
    }

    public void printPlayersData()
    {
        for(Player player: players)
        {   System.out.println("////////////////////////////////////");
            player.getPlayerData();                     
            System.out.println("//////////////////////////////////");
        }
    }

    public void topScorer()
    { 
        //Player topPlayer = new Player("default")
        for (int i = topPlayerScorer().getGoals(); i > 0 ; i--)
        {
            for (Iterator<Player> it = players.iterator(); it.hasNext();)
            {
                Player player = it.next();
                if(player.getGoals() == i)
                {
                    System.out.println(player.getName() + " "+ player.getGoals() + " "); 
                }
            }
        }
    }

    public Player topPlayerScorer()
    {
        Player topScorer = new Player("default");
        for (Iterator<Player> it = players.iterator() ; it.hasNext();)
        {
            Player player = it.next();

            if(topScorer.getName() =="default")
            {
                topScorer = player;
            }

            if(player.getGoals() >= topScorer.getGoals() && topScorer!= null)
            {
                topScorer = player;
            }
        }
        return topScorer;

    }

    public void topApearnces()
    { 
        //Player topPlayer = new Player("default")
        for (int i = topPlayerApearnces().getAppearnces(); i > 0 ; i--)
        {
            for (Iterator<Player> it = players.iterator(); it.hasNext();)
            {
                Player player = it.next();
                if(player.getAppearnces() == i)
                {
                    System.out.println(player.getName() + " "+ player.getAppearnces() + " "); 
                }
            }
        }
    }

    public Player topPlayerApearnces()
    {
        Player topApearer = new Player("default");
        for (Iterator<Player> it = players.iterator() ; it.hasNext();)
        {
            Player player = it.next();

            if(topApearer.getName() == "default")
            {
                topApearer = player;
            }

            if((player.getAppearnces() >= topApearer.getAppearnces()) && topApearer != null)
            {
                topApearer = player;
            }
        }
        return topApearer;
    }
}

