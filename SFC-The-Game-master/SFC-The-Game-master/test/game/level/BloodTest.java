package game.level;

import game.operator.Game;
import game.operator.GameManager;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author KOmpas
 */
public class BloodTest {
    private GameManager manager;
    public BloodTest() {
    }


    /**
     * Test of update method, of class Blood.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Blood instance = new Blood(manager);
        int y = instance.cell_status[3].getY();
        instance.update();
        
        assertNotEquals(y, instance.cell_status[3].getY());
    }

    /**
     * Test of draw method, of class Blood.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();    
        Blood instance = new Blood(manager);
        instance.draw(graph);
        
        assertTrue(instance.drewfine);
    }

    /**
     * Test of resume method, of class Blood.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        Blood instance = new Blood(manager);
        instance.paused = true;
        instance.resume();
        assertTrue(!instance.paused);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class Blood.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        int key = 27;
        GameManager manag = new GameManager();
        Blood instance = new Blood(manag);
        instance.keyPressed(key);
        assertTrue(instance.paused);
    }
    
    @Test
    public void testKeyPressedWrong() {
        System.out.println("keyPressed");
        int key = 21;
        GameManager manag = new GameManager();
        Blood instance = new Blood(manag);
        instance.keyPressed(key);
        assertTrue(!instance.paused);
    }

    /**
     * Test of mouseClickd method, of class Blood.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        int x = 6;
        int y = 6;
        Blood instance = new Blood(manager);
        instance.cell_status[3].setX(x);
        instance.cell_status[3].setY(y);
        instance.mouseClickd(x, y);
        assertTrue(instance.cellClicked);
    }
    
        @Test
    public void testMouseClickd2() {
        System.out.println("mouseClickd");
        int x = 2;
        int y = 3;
        Blood instance = new Blood(manager);
        instance.cell_status[5].setX(x);
        instance.cell_status[5].setY(y);
        instance.mouseClickd(x, y);
        assertTrue(instance.cellClicked);
    }

    /**
     * Test of finalize method, of class Blood.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        Blood instance = new Blood(manager);
        instance.finalize();
        assertTrue(instance.isFinalized);
       
    }
    
}
