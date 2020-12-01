package game.operator;

import game.frame.Menu;
import game.frame.Training;
import game.frame.Window;
import game.level.Blood;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author KOmpas
 */
public class GameManagerTest {
    
    public GameManagerTest() {
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
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow0() {
        System.out.println("loadWindow");
        int name = 0;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
    
    /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow1() {
        System.out.println("loadWindow");
        int name = 1;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
        /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow2() {
        System.out.println("loadWindow");
        int name = 2;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
            /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow3() {
        System.out.println("loadWindow");
        int name = 3;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
            /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow4() {
        System.out.println("loadWindow");
        int name = 4;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
            /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow5() {
        System.out.println("loadWindow");
        int name = 5;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
            /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow6() {
        System.out.println("loadWindow");
        int name = 6;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
                /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow7() {
        System.out.println("loadWindow");
        int name = 7;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
                    /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow8() {
        System.out.println("loadWindow");
        int name = 8;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }
    
                    /**
     * Test of loadWindow method, of class GameManager.
     */
    @Test
    public void testLoadWindow9() {
        System.out.println("loadWindow");
        int name = 9;
        GameManager instance = new GameManager();
        instance.loadWindow(name);
        assertEquals(name, instance.currentIndex);
    }

    /**
     * Test of loadReleased method, of class GameManager.
     */
    @Test
    public void testLoadReleased() {
        System.out.println("loadReleased");
        GameManager instance = new GameManager();
        Window temp = new Training(instance);
        instance.loadWindow(3);
        
        instance.loadReleased();
        assertEquals(temp.getClass(), instance.releasedWindow.getClass());
    }

    /**
     * Test of update method, of class GameManager.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        GameManager instance = new GameManager();
        instance.update();
        assertTrue(instance.updateSent);
    }

    /**
     * Test of draw method, of class GameManager.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();   
        GameManager instance = new GameManager();
        
        instance.draw(graph);
        
        assertEquals(graph.getBackground(), Game.Colors.darkBlue);
    }

    /**
     * Test of keyPressed method, of class GameManager.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        int key = 0;
        GameManager instance = new GameManager();
        instance.keyPressed(key);
        assertTrue(instance.keypressed);
    }

    /**
     * Test of mouseClicked method, of class GameManager.
     */
    @Test
    public void testMouseClicked() {
        System.out.println("mouseClickd");
       
        GameManager instance = new GameManager();
        
        instance.mouseClicked(2, 2);
        
        assertEquals(instance.mousex, 2);
        
    }

    /**
     * Test of gameExit method, of class GameManager.
     */
    @Test
    public void testGameExit() {
        System.out.println("gameExit");
        GameManager instance = new GameManager();
        instance.gameExit();
        assertTrue(instance.exitClicked);
    }

    /**
     * Test of isExit method, of class GameManager.
     */
    @Test
    public void testIsExit() {
        System.out.println("isExit");
        GameManager instance = new GameManager();

        boolean result = instance.isExit();
        assertEquals(instance.exitClicked, result);
        
    }
    
}
