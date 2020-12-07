package game.frame;

import game.operator.Game;
import game.operator.GameManager;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ugnius
 */
public class OpeningTest {
    private GameManager manager;
    public OpeningTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class Opening.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        assertTrue(true);
    }

    /**
     * Test of draw method, of class Opening.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();   
        Opening instance = new Opening(manager);
        instance.draw(graph);
        
        assertEquals(graph.getBackground(), Game.Colors.softGray);
    }

    /**
     * Test of resume method, of class Opening.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        assertTrue(true);
    }

    /**
     * Test of keyPressed method, of class Opening.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        assertTrue(true);
    }

    /**
     * Test of mouseClickd method, of class Opening.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        assertTrue(true);
    }
    
}
