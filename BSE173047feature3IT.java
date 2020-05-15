/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bse173047feature3;

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
public class BSE173047feature3IT {
    private BSE173047feature3 quadrilaterial;
    private int height;
    private int width;
    
    public BSE173047feature3IT() {
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
        quadrilaterial = new BSE173047feature3();
    }

    
    @After
    public void tearDown() {
    }

  @Test
    public void nullValues() throws Exception {

         assertFalse(quadrilaterial.SimilarTriangle(0,0));

    }
    
    @Test
    public void height_nullValue() throws Exception {

        height=0;
        width=5;
       assertFalse( quadrilaterial.SimilarTriangle(height,width));

    }
    
     @Test
    public void width_nullValue() throws Exception {

        height=5;
        width=0;
       assertFalse( quadrilaterial.SimilarTriangle(height,width));

    }
    
    @Test
    public void equalSides() throws Exception {

        height=20;
        width= 20;
        assertTrue(quadrilaterial.SimilarTriangle(height, width));

    }
    
    @Test
    public void unequalSides() throws Exception {

        height=20;
        width= 15;
        assertFalse(quadrilaterial.SimilarTriangle(height, width));

    }

    

    
}
