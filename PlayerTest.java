

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PlayerTest.
 *
 * @author  (Danish Bangash)
 * @version (v1.0 12-10-2012)
 */
public class PlayerTest
{
    /**
     * Default constructor for test class PlayerTest
     */
     private int numberOfAppearnces;
    private int numberOfgoalScored;
    private String name;

    public PlayerTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Test
    public void testPlayer()
    {
        Player player = new Player("default");
        int expectedResult =0;
        int actualResult = player.getAppearnces();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetName()
    {
        Player player = new Player("Dani");
        String expectedResult = "Dani";
        String actualResult = player.getName();
        assertEquals(expectedResult, actualResult);

    }

}
