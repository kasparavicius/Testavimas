package game.frame;

import game.operator.Game;
import game.operator.GameManager;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import object.structure.Sound;
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
public class DashboardTest {
    private GameManager manager;
    public DashboardTest() {
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
     * Test of update method, of class Dashboard.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Dashboard instance = new Dashboard(manager);
        instance.highScore = "0";
        instance.userName = "subject";
        instance.userPoint = 5;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("subject", instance.highScorer);
    }

    /**
     * Test of draw method, of class Dashboard.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();   
        Dashboard instance = new Dashboard(manager);
        instance.draw(graph);
        
        assertEquals(graph.getBackground(), Game.Colors.darkBlue);
    }

    /**
     * Test of resume method, of class Dashboard.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        
        GameManager temp = new GameManager();
        Dashboard instance = new Dashboard(temp);
        Sound instances = new Sound(Game.class.getResourceAsStream("/sound/dashboard.wav"));
        instance.resume();
        assertTrue(instances.loop);
    }

    /**
     * Test of keyPressed method, of class Dashboard.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        int key = 27;
        GameManager temp = new GameManager();
        Dashboard instance = new Dashboard(temp);
        instance.keyPressed(key);
        
        assertEquals(7, temp.currentIndex);
    }

    /**
     * Test of mouseClickd method, of class Dashboard.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        Dashboard instance = new Dashboard(manager);
        int b = instance.userCash;
        int x = instance.toolBt[0].getX();
        int y = instance.toolBt[0].getY();
        instance.mouseClickd(x, y);
        // TODO review the generated test code and remove the default call to fail.
        assertNotEquals(b, instance.userCash);
    }

    /**
     * Test of finalize method, of class Dashboard.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        Dashboard instance = new Dashboard(manager);
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.isfinalized);
    }
    
}
