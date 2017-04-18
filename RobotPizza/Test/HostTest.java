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
public class HostTest {
    
    public HostTest() {
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
     * Test of getName method, of class Host.
     */
    @Test
    public void testGetName() {
        System.out.println("getName is SIMPLE");
        /*Host instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of greetCustomer method, of class Host.
     */
    @Test
    public void testGreetCustomer() {
        System.out.println("greetCustomer is VOID");
        /*String custName = "";
        Host instance = null;
        instance.greetCustomer(custName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of getTableSize method, of class Host.
     */
    @Test
    public void testGetTableSize() {
        System.out.println("getTableSize");
        Customer cust = new Customer("Mike", 2);
        Host instance = new Host("noName");
        int expResult = 3;
        int result = instance.getTableSize(cust);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seat method, of class Host.
     */
    @Test
    public void testSeat() {
        System.out.println("seat");
        Customer customer = null;
        Host instance = null;
        instance.seat(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyWaiter method, of class Host.
     */
    @Test
    public void testNotifyWaiter() {
        System.out.println("notifyWaiter");
        Waiter waiter = null;
        Host instance = null;
        instance.notifyWaiter(waiter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goodbye method, of class Host.
     */
    @Test
    public void testGoodbye() {
        System.out.println("goodbye");
        Host instance = null;
        instance.goodbye();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
