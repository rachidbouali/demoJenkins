/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RB
 */
public class DemoTest {
    
    public DemoTest() {
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
     * Test of sum method, of class Demo.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 5;
        int b = 2;
        Demo instance = new Demo();
        int expResult = 7;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of minus method, of class Demo.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        int a = 5;
        int b = 2;
        Demo instance = new Demo();
        int expResult = 3;
        int result = instance.minus(a, b);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testMinus2() {
        System.out.println("minus");
        int a = 5;
        int b = 2;
        Demo instance = new Demo();
        int expResult = 3;
        int result = instance.minus(a, b);
        assertEquals(expResult, result);
       
    }
    
}
