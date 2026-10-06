
// -------------------------------------------------------------------------
/**
 * Represents an average employee working 40 hours per week.
 *
 * @author G.J. Hu
 * @version 2025.07.14
 */
public class Employee {
    // ~ Fields ................................................................

    private String name;
    private int employeeId;
    private double hourlyRate;
   


    // ~ Constructor ...........................................................
    /**
     * New Employee object.
     *
     * @param name
     *            Name of Employee
     * @param employeeId
     *            Employee ID of Employee
     * @param hourlyRate
     *            Pay rate of Employee (per hour).
     */
    public Employee(String name, int employeeId, double hourlyRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
    }

    // ~ Methods ...............................................................


    // ----------------------------------------------------------
    /**
     * Gets the employee's name.
     *
     * @return the employee's name
     */
    public String getName() {
        return name;
    }


    // ----------------------------------------------------------
    /**
     * Gets the employee's employee identifier.
     *
     * @return the employee's employee identifier
     */
    public int getEmployeeId() {
        return employeeId;
    }


    // ----------------------------------------------------------
    /**
     * Gets the pay rate (per hour).
     *
     * @return the pay rate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }


    // ----------------------------------------------------------
    /**
     * Amount paid to the employee for an average 40 hour work week.
     *
     * @return weekly pay for employee
     */ 
    public double weeklyPay() {
        return hourlyRate * 40;
    }
    
    // ----------------------------------------------------------
    /**
     * Determines whether or not two Employee objects are equal.
     *
     * @return true if the two objects are equal and false if they are not equal
     * 
     * @Override
     * 
     * @param e
     *            Employee Object
     * 
     */
    public boolean equals(Object e) {
        if (e == this) {
            return true;
        }
        if (!(e instanceof Employee)) {
            return false;
        }
        Employee em = (Employee) e;
        return this.employeeId == em.getEmployeeId() &&
               this.name.equals(em.getName());
    }
   
    
}
