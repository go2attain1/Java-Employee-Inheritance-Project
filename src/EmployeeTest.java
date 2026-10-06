
import student.TestCase;

/**
 * This class tests the Employee class for correct output.
 * It verifies that the methods in the class do what they are expected to do.
 *
 * @author G.J. Hu
 * @version 2025.07.14
 */

public class EmployeeTest extends TestCase {
    // ----------------------------------------------------------
    /**
     * Defines a new Employee object that will be used to test the methods
     */
    private Employee employee1;
    
    // ----------------------------------------------------------
    /**
     * Creates and initializes values for that new Employee object
     */  
      
    public void setUp() {
        employee1 = new Employee("John", 360, 30.5);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getName() method returns the expected output
     */
    public void testGetName() {
        assertEquals("John", employee1.getName());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getEmployeeId() method returns the expected output
     */
    public void testGetEmployeeId() {
        assertEquals(360, employee1.getEmployeeId());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getHourlyRate() method returns the expected output
     */
    public void testGetHourlyRate() {
        assertEquals(30.5, employee1.getHourlyRate(), 0.01);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the weeklyPay() method returns the expected output
     */ 
    public void testWeeklyPay() {
        assertEquals(1220.0, employee1.weeklyPay(), 0.01);
        
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the equals() method returns the expected output
     */
    public void testEquals() {
        Employee employee2;
        employee2 = new Employee("Bob", 20, 29.5);
        assertEquals(false, employee1.equals(employee2));
        Employee employee3;
        employee3 = new Employee("John", 360, 30.5);
        assertEquals(true, employee1.equals(employee3));
        Employee employee4;
        employee4 = new Employee("John", 300, 30.5);
        assertEquals(false, employee1.equals(employee4));
        Employee employee5;
        employee5 = new Employee("Sam", 360, 28.5);
        assertEquals(false, employee1.equals(employee5));
        String s = new String("John");
        assertEquals(false, employee1.equals((Object)s));
    }

    
}