/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tyler Masthay
 */
public class GoodKidTest {
    
    public GoodKidTest() {
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
     * Test of getName method, of class GoodKid.
     */
    @Test
    public void testGetName() {
        System.out.println("getName is SIMPLE");
        /*GoodKid instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of order method, of class GoodKid.
     */
    @Test
    public void testOrder() {
        System.out.println("order");
        GoodKid instance = new GoodKid("Jonathan");
        String expResult = "nope";
        String result = instance.order();
        assertEquals(expResult, result);
    }
    
}
