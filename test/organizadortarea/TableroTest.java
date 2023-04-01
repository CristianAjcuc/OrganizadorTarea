/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizadortarea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crs12
 */
public class TableroTest {
    
    public TableroTest() {
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
     * Test of Vnombre method, of class Tablero.
     */
    @Test
    public void testVnombre() {
        System.out.println("Vnombre");
        Tablero instance = new Tablero("CL01", "Hola", "a");
        boolean expResult = true;
        boolean result = instance.Vnombre();
        assertEquals(expResult, result);

    }

    /**
     * Test of Vdescripcion method, of class Tablero.
     */
    @Test
    public void testVdescripcion() {
        System.out.println("Vdescripcion");
        Tablero instance = new Tablero("CL01", "Hola", "a");
        boolean expResult = true;
        boolean result = instance.Vdescripcion();
        assertEquals(expResult, result);

    }

    /**
     * Test of Vestado method, of class Tablero.
     */
    @Test
    public void testVestado() {
        System.out.println("Vestado");
        Tablero instance = new Tablero ("CL01", "Hola", "a") ;
        boolean expResult = true;
        boolean result = instance.Vestado();
        assertEquals(expResult, result);

    }

    /**
     * Test of RegistrarTablero method, of class Tablero.
     */
    @Test
    public void testRegistrarTablero() {
        System.out.println("RegistrarTablero");
        Tablero instance = new Tablero ("CL01", "Hola", "a");
        String expResult = "Registro Satisfecho";
        String result = instance.RegistrarTablero();
        assertEquals(expResult, result);

    }

    /**
     * Test of OrganizadorTarea method, of class Tablero.
     */
    @Test
    public void testOrganizadorTarea() {
        System.out.println("OrganizadorTarea");
        Tablero instance = null;
        boolean expResult = false;
        boolean result = instance.OrganizadorTarea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
