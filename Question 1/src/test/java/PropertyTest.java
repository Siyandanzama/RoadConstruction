/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.propertymodel.PropertyModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Siyanda
 */
public class PropertyTest {
    
    public PropertyTest() {
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
     * Test of main method, of class PropertyModel.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PropertyModel.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMenu method, of class PropertyModel.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        PropertyModel.displayMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enterProperty method, of class PropertyModel.
     */
    @Test
    public void testEnterProperty() {
        System.out.println("enterProperty");
        PropertyModel.enterProperty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of propertyAmountValidation method, of class PropertyModel.
     */
    @Test
    public void testPropertyAmountValidation() {
        System.out.println("propertyAmountValidation");
        double expResult = 0.0;
        double result = PropertyModel.propertyAmountValidation();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchProperty method, of class PropertyModel.
     */
    @Test
    public void testSearchProperty() {
        System.out.println("searchProperty");
        PropertyModel.searchProperty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProperty method, of class PropertyModel.
     */
    @Test
    public void testUpdateProperty() {
        System.out.println("updateProperty");
        PropertyModel.updateProperty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProperty method, of class PropertyModel.
     */
    @Test
    public void testDeleteProperty() {
        System.out.println("deleteProperty");
        PropertyModel.deleteProperty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of propertyRentalReport method, of class PropertyModel.
     */
    @Test
    public void testPropertyRentalReport() {
        System.out.println("propertyRentalReport");
        PropertyModel.propertyRentalReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exitPropertyApplication method, of class PropertyModel.
     */
    @Test
    public void testExitPropertyApplication() {
        System.out.println("exitPropertyApplication");
        PropertyModel.exitPropertyApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
