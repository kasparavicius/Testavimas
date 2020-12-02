package object.structure;

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
public class MotionCellTest {
    
    public MotionCellTest() {
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
     * Test of setMotion method, of class MotionCell.
     */
    @Test
    public void testSetMotion() {
        System.out.println("setMotion");
        int endX = 10;
        int endY = 10;
        int speedX = 1;
        int speedY = 1;
        MotionCell instance = new MotionCell(1,1,3,3);
        instance.setMotion(endX, endY, speedX, speedY);
        assertTrue(endX==instance.endX && endY==instance.endY && speedX==instance.speedX && speedY==instance.speedY);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class MotionCell.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        MotionCell instance = new MotionCell(1,1,3,3);
        instance.setMotion(3, 3, 1, 1);
        instance.move();
        assertTrue(instance.getX()==0 && instance.getY()==0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
