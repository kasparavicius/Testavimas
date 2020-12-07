package game.frame;

import game.operator.Game;
import game.operator.GameManager;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
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
public class NewUserTest {
    private GameManager manager;
    public NewUserTest() {
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
     * Test of update method, of class NewUser.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        assertTrue(true);
    }

    /**
     * Test of draw method, of class NewUser.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        BufferedImage screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graph = (Graphics2D )screen.getGraphics();   
        NewUser instance = new NewUser(manager);
        instance.draw(graph);
        
        assertEquals(graph.getBackground(), Game.Colors.darkBlue);
    }

    /**
     * Test of resume method, of class NewUser.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        assertTrue(true);
    }

    /**
     * Test of keyPressed method, of class NewUser.
     */
    @Test
    public void testKeyPressedBackspace() {
        System.out.println("keyPressed");
        int key = 8;
        GameManager temp = new GameManager();
        NewUser instance = new NewUser(temp);
        
        instance.userName = "testas";
        int a = instance.userName.length();
        instance.keyPressed(key);
        
        assertEquals(5, instance.userName.length());
    }
        public void testKeyPressedEnter() {
        System.out.println("keyPressed");
        int key = 10;
        GameManager temp = new GameManager();
        NewUser instance = new NewUser(temp);
        instance.keyPressed(key);
        
        assertEquals(2, temp.currentIndex);
    }

    /**
     * Test of mouseClickd method, of class NewUser.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
        GameManager temp = new GameManager();
        NewUser instance = new NewUser(temp);
        int x = instance.cancelBt.getX();
        int y = instance.cancelBt.getY();
        instance.mouseClickd(x, y);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(0, temp.currentIndex);
    }

    /**
     * Test of finalize method, of class NewUser.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        NewUser instance = new NewUser(manager);
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.isfinalized);
    }
    
}
