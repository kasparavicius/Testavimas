package game.frame;

import java.awt.Graphics2D;
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
public class HowToPlayTest {
    
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
        HowToPlay instance = null;
        instance.update();
        assertEquals("mamama", "mamama");
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class HowToPlay.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D graph = null;
        HowToPlay instance = null;
        instance.draw(graph);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resume method, of class HowToPlay.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        HowToPlay instance = null;
        instance.resume();
        assertEquals("Gelo", "Gelo");
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class HowToPlay.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        int key = 0;
        HowToPlay instance = null;
        instance.keyPressed(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseClickd method, of class HowToPlay.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        int x = 0;
        int y = 0;
        HowToPlay instance = null;
        instance.mouseClickd(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
