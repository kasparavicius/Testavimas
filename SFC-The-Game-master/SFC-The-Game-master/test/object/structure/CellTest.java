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
public class CellTest {
    
    public CellTest() {
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
     * Test of setCancer method, of class Cell.
     */
    @Test
    public void testSetCancer() {
        System.out.println("setCancer");
        boolean cancer = false;
        Cell instance = new Cell(1, 1, 3, 3, false);
        instance.setCancer(cancer);
        assertEquals(cancer, instance.isCancer());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isCancer method, of class Cell.
     */
    @Test
    public void testIsCancer() {
        System.out.println("isCancer");
        Cell instance = new Cell(1, 1, 3, 3, false);
        boolean expResult = false;
        boolean result = instance.isCancer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlive method, of class Cell.
     */
    @Test
    public void testSetAlive() {
        System.out.println("setAlive");
        boolean visible = false;
        Cell instance = new Cell();
        instance.setAlive(visible);
        assertEquals(false, instance.isAlive());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isAlive method, of class Cell.
     */
    @Test
    public void testIsAlive() {
        System.out.println("isAlive");
        Cell instance = new Cell();
        boolean expResult = true;
        boolean result = instance.isAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCountDown method, of class Cell.
     */
    @Test
    public void testSetCountDown() {
        System.out.println("setCountDown");
        int sec = 2;
        Cell instance = new Cell();
        instance.setCountDown(sec);
        //Thread.sleep(500);
        long counter = System.currentTimeMillis();
        boolean time = true;
        while(time){
                    //time for 2 second
                    if((System.currentTimeMillis()-counter)/1000 == sec/2){
                        time = false;
                        break;
                    }
                }
        assertTrue(instance.isInCounting());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isInCounting method, of class Cell.
     */
    @Test
    public void testIsInCounting() {
        System.out.println("isInCounting");
        int sec = 2;
        Cell instance = new Cell();
        instance.setCountDown(sec);
        //Thread.sleep(500);
        long counter = System.currentTimeMillis();
        boolean time = true;
        while(time){
                    //time for 1 second
                    if((System.currentTimeMillis()-counter)/1000 == sec/2){
                        time = false;
                        break;
                    }
                }
        assertTrue(instance.isInCounting());
    }

    /**
     * Test of toString method, of class Cell.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cell instance = new Cell(1,1,3,3,true);
        String expResult = String.format("Cell object: x=%d, y=%d, width=%d, height=%d, "
                + "cencer="+true, 1,1,3,3,true);
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
