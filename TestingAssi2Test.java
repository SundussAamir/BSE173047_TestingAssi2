//FOR TRIANGLE TO BE MADE IF DIVIDED DIAGNOLLY 

package testingassi2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sunduss KD
 */
public class TestingAssi2Test {
    
    private TestingAssi2 quadrilaterial;
    private int height;
    private int width;
    private double angle1;
    private double angle2;
    
    public TestingAssi2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
      
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        height = 0;
        width = 0;
        angle1=0;
        angle2=0;
        quadrilaterial = new TestingAssi2();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void nullValues() throws Exception {

         assertFalse(quadrilaterial.checkingtype(0,0,0,0));

    }
    
    @Test
    public void height_nullValue() throws Exception {

        height=0;
        width=5;
        angle1=90;
        angle2=90;
       assertFalse( quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
     @Test
    public void width_nullValue() throws Exception {

        height=5;
        width=0;
        angle1=90;
        angle2=90;
       assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void angle1_nullvalue() throws Exception {

        height=20;
        width= 20;
        angle1=0;
        angle2=90;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void angle2_nullvalue() throws Exception {

        height=20;
        width= 15;
        angle1=90;
        angle2=0;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void side_equalvalue() throws Exception {

        height=20;
        width= 20;
        angle1=70;
        angle2=100;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
        
   @Test
    public void sideAndAngle_equalvalue() throws Exception {

        height=20;
        width= 20;
        angle1=90;
        angle2=90;
        assertTrue(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
       @Test
    public void Angle_value90() throws Exception {

        height=20;
        width= 20;
        angle1=90;
        angle2=100;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    
    
    
    
    @Test
    public void side_differentvalue() throws Exception {

        height=20;
        width= 25;
        angle1=90;
        angle2=90;
        assertTrue(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void angle1_value90() throws Exception {

        height=20;
        width= 25;
        angle1=100;
        angle2=90;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
    @Test
    public void angleAndSide_differentvalue() throws Exception {

        height=20;
        width= 25;
        angle1=70;
        angle2=100;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
    
        @Test
    public void angle_samevalue() throws Exception {

        height=20;
        width= 25;
        angle1=100;
        angle2=100;
        assertFalse(quadrilaterial.checkingtype(height,width, angle1, angle2));

    }
}
