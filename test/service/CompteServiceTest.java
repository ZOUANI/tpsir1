/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YOUNES
 */
public class CompteServiceTest {
    
    public CompteServiceTest() {
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
     * Test of initBd method, of class CompteService.
     */
//    @Test
//    public void testInitBd() {
//        System.out.println("initBd");
//        CompteService instance = new CompteService();
//        int expResult = 1;
//        int result = instance.initBd();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of debiter method, of class CompteService.
     */
    @Test
    public void testDebiter() {
        System.out.println("debiter");
        String id = "EE1";
        double montant = 10.0;
        CompteService instance = new CompteService();
        int expResult = 1;
        int result = instance.debiter(id, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of crediter method, of class CompteService.
     */
    @Test
    public void testCrediter() {
        System.out.println("crediter");
        String id = "EE2";
        double montant = 3000.0;
        CompteService instance = new CompteService();
        int expResult = -2;
        int result = instance.crediter(id, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
