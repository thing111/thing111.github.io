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
public class AnnoyingKidTest {
    
    public AnnoyingKidTest() {
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
     * Test of politelyOrder method, of class AnnoyingKid.
     */
    @Test
    public void testPolitelyOrder() {
        System.out.println("politelyOrder");
        AnnoyingKid instance = new AnnoyingKid("Mike");
        String expResult = "nope";
        String result = instance.politelyOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of misbehave method, of class AnnoyingKid.
     */
    @Test
    public void testMisbehave() {
        System.out.println("misbehave");
        AnnoyingKid instance = new AnnoyingKid("Mike");
        String expResult = "nope";
        String result = instance.misbehave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class AnnoyingKid.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        /*AnnoyingKid instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
}
