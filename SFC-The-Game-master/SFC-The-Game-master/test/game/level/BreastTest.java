package game.level;

import game.operator.Game;
import game.operator.GameManager;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import object.structure.MotionCell;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fartas
 */
public class BreastTest {
    
    GameManager manager;
    Breast instance;
            
    public BreastTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        manager = new GameManager();
        instance = new Breast(manager);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class Breast.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int oldCellPos = instance.cell_status[2].getX();        
        instance.update();
        assertNotEquals(oldCellPos, instance.cell_status[2].getX());
    }

    /**
     * Test of draw method, of class Breast.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();
        instance.draw(graph);
        
        assertTrue(instance.drewfine);
    }

    /**
     * Test of resume method, of class Breast.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        instance.paused = true;
        instance.resume();
        assertNotEquals(true, instance.paused);
    }

    /**
     * Test of keyPressed method, of class Breast.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        int key = 0x1B; //esc
        instance.keyPressed(key);
        assertEquals(true, instance.paused);
    }

    /**
     * Test of mouseClickd method, of class Breast.
     */
    @Test
    public void testMouseClickdCell() {
        System.out.println("mouseClickd");
        int x = instance.cell_status[2].getX();
        int y = instance.cell_status[2].getY();
        instance.mouseClickd(x, y);
        assertTrue(instance.cellClicked);
    }
    
        /**
     * Test of mouseClickd method, of class Breast.
     */
    @Test
    public void testMouseClickdTool() {
        System.out.println("mouseClickd");
        int x = instance.tools[2].getX();
        int y = instance.tools[2].getY();
        instance.mouseClickd(x, y);
        assertTrue(instance.toolsClicked);
    }

    /**
     * Test of finalize method, of class Breast.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        instance.finalize();
        assertTrue(instance.isFinalized);
    }
    
}
