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
public class ChefTest {
    
    public ChefTest() {
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
     * Test of getName method, of class Chef.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Chef instance = new Chef("Emeril");
        String expResult = "nope";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of cook method, of class Chef.
     */
    @Test
    public void testCook() {
        System.out.println("cook");
        String item = "Cheese Pizza";
        Chef instance = new Chef("Emeril");
        String expResult = "done";
        String result = instance.cook(item);
        assertEquals(expResult, result);
    }
    
}
