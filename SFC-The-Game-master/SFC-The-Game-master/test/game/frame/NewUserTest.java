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
import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author Ugnius
 */
@RunWith(Parameterized.class)
public class NewUserTest {
    GameManager temp;
    NewUser instance;
    
       @Parameterized.Parameters
   public static Collection KeyPresses() {
      return Arrays.asList(new Object[][] {
         { 10, 2 },
         { 6, 1 },
         { 19, 1 },
      });
   }
    @Parameter (value = 0)
    public Integer inputNumber;
    @Parameter (value = 1)
    public int expectedResult;
    public NewUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    public void NewUserTest(Integer inputNumber, int expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    temp = new GameManager();
    instance = new NewUser(temp);
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
        
        instance.userName = "testas";
        int a = instance.userName.length();
        instance.keyPressed(key);
        
        assertEquals(5, instance.userName.length());
    }
    @Test
        public void testKeyPressedEnter() {
        System.out.println("keyPressed");
        temp.currentIndex = 1;
        instance.userName = "testas";
        instance.keyPressed(inputNumber);
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult, temp.currentIndex);
    }

    /**
     * Test of mouseClickd method, of class NewUser.
     */
    @Test
    public void testMouseClickd() {
        System.out.println("mouseClickd");
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
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.isfinalized);
    }
    
}
