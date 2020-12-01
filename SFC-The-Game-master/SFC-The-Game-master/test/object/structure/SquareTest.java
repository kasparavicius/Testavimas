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
public class SquareTest {
    
    Square instance;
    
    public SquareTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Square(1, 1, 3, 3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isInside method, of class Square.
     */
    @Test
    public void testIsInside() {
        System.out.println("isInside");
        int x = 2;
        int y = 2;
        boolean expResult = true;
        boolean result = instance.isInside(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Square.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        int expResult = 1;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Square.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int prevx = instance.getX();
        int x = 0;
        instance.setX(x);
        assertNotEquals(prevx, instance.getX());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Square.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        int expResult = 1;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Square.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int prevy = instance.getX();
        int y = 0;
        instance.setY(y);
        assertNotEquals(prevy, instance.getY());
    }

    /**
     * Test of getWidth method, of class Square.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        int expResult = 3;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class Square.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int prevw = instance.getWidth();
        int width = 1;
        instance.setWidth(width);
        assertNotEquals(prevw, instance.getWidth());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Square.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        int expResult = 3;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Square.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int prevh = instance.getHeight();
        int height = 1;
        instance.setHeight(height);
        assertNotEquals(prevh, instance.getHeight());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Square.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = String.format("%s: x=%d, y=%d, width=%d, height=%d",
                "Square object",1,1,3,3);
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
