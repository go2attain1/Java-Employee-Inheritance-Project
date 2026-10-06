
import student.TestCase;

/**
 * This class tests the ExternalContractor class for correct output.
 * It verifies that the methods in the class do what they are expected to do.
 *
 * @author G.J. Hu
 * @version 2025.07.14
 */

public class ExternalContractorTest extends TestCase {
    // ----------------------------------------------------------
    /**
     * Defines a new ExternalContractor object that will be used to test the 
     * methods
     */
    private ExternalContractor ec1;
    private ExternalContractor ec2;
    private ExternalContractor ec3;
    private ExternalContractor ec4;
    
    // ----------------------------------------------------------
    /**
     * Creates and initializes values for that new ExternalContractor object
     */  
    
    public void setUp() {
        ec1 = new ExternalContractor("Alex", 50, 41.75);
        ec2 = new ExternalContractor("Grace", 25, 38.50);
        ec3 = new ExternalContractor("Robert", 15, 45.50);
        ec4 = new ExternalContractor("Jordan", 10, 0.0);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getHourlyRate() method returns the expected output
     */
    public void testGetHourlyRate() {
        assertEquals(45.50, ec3.getHourlyRate('A'), 0.01);
        assertEquals(41.75, ec1.getHourlyRate('B'), 0.01);
        assertEquals(38.50, ec2.getHourlyRate('C'), 0.01);
        assertEquals(0.0, ec4.getHourlyRate('D'), 0.01);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the weeklyPay() method returns the expected output
     */
    public void testWeeklyPay() {
        assertEquals(1670.0, ec1.weeklyPay(40, 'B'), 0.01);
        assertEquals(1155.0, ec2.weeklyPay(30, 'C'), 0.01);
        assertEquals(1820.0, ec3.weeklyPay(40, 'A'), 0.01);
        assertEquals(0.0, ec4.weeklyPay(33, 'D'), 0.01);    
    }

}
