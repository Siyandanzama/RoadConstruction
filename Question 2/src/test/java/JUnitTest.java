/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
public class JUnitTest {
    
    public JUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     public class RoadConstructionReportTest {

    // Test getter methods
    @Test
    public void testGetters() {

        RoadConstructionReport report =
                new RoadConstructionReport("Cape Town", 155);

        assertEquals("Cape Town", report.getCity());
        assertEquals(155, report.getTotalRoadsConstructed());
    }

    // Test another object
    @Test
    public void testSecondCity() {

        RoadConstructionReport report =
                new RoadConstructionReport("Johannesburg", 220);

        assertEquals("Johannesburg", report.getCity());
        assertEquals(220, report.getTotalRoadsConstructed());
    }

    // Test if roads constructed is positive
    @Test
    public void testRoadsConstructedPositive() {

        RoadConstructionReport report =
                new RoadConstructionReport("Durban", 300);

        assertTrue(report.getTotalRoadsConstructed() > 0);
    }

    // Test if city name is not null
    @Test
    public void testCityNotNull() {

        RoadConstructionReport report =
                new RoadConstructionReport("Pretoria", 100);

        assertNotNull(report.getCity());
    }
}
    
}
