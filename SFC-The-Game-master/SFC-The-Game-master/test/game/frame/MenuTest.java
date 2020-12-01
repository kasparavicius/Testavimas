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
 * @author KOmpas
 */
public class MenuTest {
    private GameManager manager;
    public MenuTest() {
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
     * Test of update method, of class Menu.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        assertTrue(true);
    }

    /**
     * Test of draw method, of class Menu.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();   
        Menu instance = new Menu(manager);
        instance.draw(graph);
        
        assertEquals(graph.getBackground(), Game.Colors.darkBlue);
    }

    /**
     * Test of resume method, of class Menu.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        assertTrue(true);
    }

    /**
     * Test of keyPressed method, of class Menu.
     */
    @Test
    public void testKeyPressedUp() {
        System.out.println("keyPressed");
        int key = 38;
        Menu instance = new Menu(manager);
        instance.now = 0;
        instance.keyPressed(key);
        
        assertEquals(4, instance.now);

    }
    
    
    /**
     * Test of keyPressed method, of class Menu.
     */
    @Test
    public void testKeyPressedDown() {
        System.out.println("keyPressed");
        int key = 40;
        Menu instance = new Menu(manager);
        instance.now = 4;
        instance.keyPressed(key);
        
        assertEquals(0, instance.now);

    }
    
    
    
    /**
     * Test of keyPressed method, of class Menu.
     */
    @Test
    public void testKeyPressedEnter() {
        System.out.println("keyPressed");
        int key = 10;
        GameManager temp = new GameManager();
        Menu instance = new Menu(temp);
        instance.now = 4;
        instance.keyPressed(key);
        
        assertTrue(temp.exitClicked);
    }
   

    /**
     * Test of mouseClickd method, of class Menu.
     */
    @Test
    public void testMouseClickdDown() {
        System.out.println("mouseClickd");
        int x = 0;
        int y = 0;
        assertEquals(x, y);
    }

    /**
     * Test of finalize method, of class Menu.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        Menu instance = new Menu(manager);
        instance.finalize();
        assertTrue(instance.isFinalized);
    }
    
}
