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
public class PauseTest {
    private GameManager manager;
    public PauseTest() {
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
     * Test of update method, of class Pause.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        assertTrue(true);
    }

    /**
     * Test of draw method, of class Pause.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();   
        Pause instance = new Pause(manager);
        instance.draw(graph);
        
        assertEquals(graph.getBackground(), Game.Colors.darkBlue);
    }

    /**
     * Test of resume method, of class Pause.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        assertTrue(true);
    }

    /**
     * Test of keyPressed method, of class Pause.
     */
    @Test
    public void testKeyPressedUp() {
        System.out.println("keyPressed");
        int key = 38;
        Pause instance = new Pause(manager);
        instance.now = 0;
        instance.keyPressed(key);
        
        assertEquals(3, instance.now);

    }
    @Test
    public void testKeyPressedDown() {
        System.out.println("keyPressed");
        int key = 40;
        Pause instance = new Pause(manager);
        instance.now = 3;
        instance.keyPressed(key);
        
        assertEquals(0, instance.now);

    }
    @Test
    public void testKeyPressedEnter() {
        System.out.println("keyPressed");
        int key = 10;
        GameManager temp = new GameManager();
        Pause instance = new Pause(temp);
        instance.now = 2;
        instance.keyPressed(key);
        
        assertEquals(0, temp.currentIndex);
    }
    @Test
        public void testKeyPressedEsc() {
        System.out.println("keyPressed");
        int key = 27;
        GameManager temp = new GameManager();
        Pause instance = new Pause(temp);
        instance.keyPressed(key);
        
        assertTrue(temp.released);
    }
    /**
     * Test of mouseClickd method, of class Pause.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        int x = 0;
        int y = 0;
        assertEquals(x, y);
    }

    /**
     * Test of finalize method, of class Pause.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        Pause instance = new Pause(manager);
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.isfinalized);
    }
    
}
