package game.level;

import java.awt.Graphics2D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import game.operator.GameManager;
import game.operator.Game;
import java.awt.image.BufferedImage;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ugnius
 */
public class LungTest {
    
    private GameManager manager;
    Lung instance;
    public LungTest() {
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
        instance = new Lung(manager);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class Lung.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");       
        instance.update();
        assertTrue(instance.updatedone);
    }

    /**
     * Test of draw method, of class Lung.
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
     * Test of resume method, of class Lung.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        instance.paused = true;
        instance.resume();
        assertTrue(!instance.paused);
    }

    /**
     * Test of keyPressed method, of class Lung.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        int key = 27;
        instance.keyPressed(key);
        assertTrue(instance.paused);
    }

    /**
     * Test of mouseClickd method, of class Lung.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        int x = 3;
        int y = 3;
        instance.cell_status[4].setX(x);
        instance.cell_status[4].setY(y);
        instance.mouseClickd(x, y);
        assertTrue(instance.cellClicked);
    }

    /**
     * Test of finalize method, of class Lung.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        instance.finalize();
        assertTrue(instance.isFinalized);
    }
    
}
