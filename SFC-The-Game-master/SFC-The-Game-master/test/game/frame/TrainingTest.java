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
public class TrainingTest {
    private GameManager manager;
    public TrainingTest() {
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
     * Test of update method, of class Training.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        assertTrue(true);
    }

    /**
     * Test of draw method, of class Training.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();   
        Training instance = new Training(manager);
        instance.now = 2;
        instance.draw(graph);
        
        assertTrue(instance.componentdrawn);
    }

    /**
     * Test of keyPressed method, of class Training.
     */
    @Test
    public void testKeyPressedUp() {
        System.out.println("keyPressed");
        int key = 38;
        Training instance = new Training(manager);
        instance.now = 0;
        instance.keyPressed(key);
        
        assertEquals(2, instance.now);

    }
    @Test
    public void testKeyPressedDown() {
        System.out.println("keyPressed");
        int key = 40;
        Training instance = new Training(manager);
        instance.now = 2;
        instance.keyPressed(key);
        
        assertEquals(0, instance.now);

    }
    @Test
    public void testKeyPressedBackspace() {
        System.out.println("keyPressed");
        int key = 8;
        GameManager temp = new GameManager();
        Training instance = new Training(temp);
        instance.keyPressed(key);
        
        assertEquals(0, temp.currentIndex);   
    }
    @Test 
        public void testKeyPressedEsc() {
        System.out.println("keyPressed");
        int key = 27;
        GameManager temp = new GameManager();
        Training instance = new Training(temp);
        instance.keyPressed(key);
        
        assertEquals(0, temp.currentIndex);
    }

    /**
     * Test of resume method, of class Training.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        assertTrue(true);
    }

    /**
     * Test of mouseClickd method, of class Training.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        int x = 0;
        int y = 340;
        Training instance = new Training(manager);
        instance.now = 5;
        instance.mouseClickd(x, y);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(0, instance.now);
    }

    /**
     * Test of finalize method, of class Training.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        Training instance = new Training(manager);
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.isfinalized);
    }
    
}
