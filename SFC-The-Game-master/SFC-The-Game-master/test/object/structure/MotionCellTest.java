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
        int endX = 0;
        int endY = 0;
        int speedX = 0;
        int speedY = 0;
        MotionCell instance = new MotionCell();
        instance.setMotion(endX, endY, speedX, speedY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class MotionCell.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        MotionCell instance = new MotionCell();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
