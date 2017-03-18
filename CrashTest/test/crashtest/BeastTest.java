/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crashtest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josecovarrubias
 */
public class BeastTest {
    
    public BeastTest() {
    }

    /**
     * Test of damagetest method, of class Beast.
     */
    @Test
    public void testDamagetest() {
        System.out.println("damagetest");
        int b2 = 2;
        int b3 = 3;
        Beast instance = new Beast();
        int expResult = 8;
        int result = instance.damagetest(b2, b3);
        assertEquals(expResult, result);
        
    }
    
}
