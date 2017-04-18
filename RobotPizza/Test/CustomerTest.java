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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of walkIn method, of class Customer.
     */
    @Test
    public void testWalkIn() {
        System.out.println("walkIn is VOID");
        /*String hostName = "";
        Customer instance = null;
        instance.walkIn(hostName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName is SIMPLE");
        /*Customer instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of order method, of class Customer.
     */
    @Test
    public void testOrder() {
        System.out.println("order");
        Customer instance = new Customer("Mike", 2);
        String expResult = "nope";
        String result = instance.order();
        assertEquals(expResult, result);
    }

    /**
     * Test of scold method, of class Customer.
     */
    @Test
    public void testScold() {
        System.out.println("scold");
        String name = "Cody";
        int i = 0;
        Customer instance = new Customer("Cody's Dad", 2);
        instance.scold(name, i);
    }

    /**
     * Test of pay method, of class Customer.
     */
    @Test
    public void testPay() {
        System.out.println("pay is VOID");
        /*int amount = 50;
        String waiterName = "";
        Customer instance = null;
        instance.pay(amount, waiterName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of getKidNum method, of class Customer.
     */
    @Test
    public void testGetKidNum() {
        System.out.println("getKidNum");
        Customer instance = null;
        int expResult = 0;
        int result = instance.getKidNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
