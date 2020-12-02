package object.structure;

import game.operator.Game;
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
public class SoundTest {
    
    Sound instance;
    
    public SoundTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Sound(Game.class.getResourceAsStream("/sound/dashboard.wav"));
        instance.clip.stop();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class Sound.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        instance.play();
        System.out.println(instance.clip);
        assertTrue(instance.clip.isRunning());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class Sound.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        instance.play();
        instance.pause();
        System.out.println(instance.clip);
        assertFalse(instance.clip.isRunning());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resume method, of class Sound.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        instance.play();
        instance.pause();
        instance.resume();
        System.out.println(instance.clip);
        assertTrue(instance.clip.isRunning());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class Sound.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        instance.play();
        instance.stop();
        System.out.println(instance.clip);
        assertFalse(instance.clip.isRunning());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loop method, of class Sound.
     */
    @Test
    public void testLoop() {
        System.out.println("loop");
        instance.loop();
        assertTrue(instance.loop);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isResumed method, of class Sound.
     */
    @Test
    public void testIsResumed() {
        System.out.println("isResumed");
        boolean expResult = true;
        instance.play();
        System.out.println(instance.clip);
        instance.pause();
        System.out.println(instance.clip);
        instance.resume();
        System.out.println(instance.clip);
        
        assertEquals(expResult, instance.clip.isRunning());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
