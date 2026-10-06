
import student.TestCase;

/**
 * This class tests the PartTimeEmployee class for correct output.
 * It verifies that the methods in the class do what they are expected to do.
 *
 * @author G.J. Hu
 * @version 2025.07.14
 */

public class PartTimeEmployeeTest extends TestCase {
    // ----------------------------------------------------------
    /**
     * Defines a new PartTimeEmployee object that will be used to test the 
     * methods
     */
    private PartTimeEmployee pte1;
    
    // ----------------------------------------------------------
    /**
     * Creates and initializes values for that new PartTimeEmployee object
     */  
    
    public void setUp() {
        pte1 = new PartTimeEmployee("Henry", 35, 25.0, 30);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getHoursWorked() method returns the expected output
     */
    public void testGetHoursWorked() {
        assertEquals(30, pte1.getHoursWorked());
    }

    // ----------------------------------------------------------
    /**
     * Tests that the weeklyPay() method returns the expected output
     */ 
    public void testWeeklyPay() {
        assertEquals(750.0, pte1.weeklyPay(), 0.01);
        
    }

}
