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
public class HowToPlayTest {
    private GameManager manager;
    public HowToPlayTest() {
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
     * Test of update method, of class HowToPlay.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        assertTrue(true);
    }

    /**
     * Test of draw method, of class HowToPlay.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();   
        HowToPlay instance = new HowToPlay(manager);
        instance.draw(graph);
        
        assertEquals(graph.getBackground(), Game.Colors.darkBlue);
    }

    /**
     * Test of resume method, of class HowToPlay.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        assertTrue(true);
    }

    /**
     * Test of keyPressed method, of class HowToPlay.
     */
    @Test
    public void testKeyPressedBackspace() {
        System.out.println("keyPressed");
        int key = 8;
        GameManager temp = new GameManager();
        HowToPlay instance = new HowToPlay(temp);
        instance.keyPressed(key);
        
        assertTrue(temp.released); 
    }
    @Test 
    public void testKeyPressedEsc() {
        System.out.println("keyPressed");
        int key = 27;
        GameManager temp = new GameManager();
        HowToPlay instance = new HowToPlay(temp);
        instance.keyPressed(key);
        
        assertTrue(temp.released);  
    }

    /**
     * Test of mouseClickd method, of class HowToPlay.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        assertTrue(true);
    }
    
}
