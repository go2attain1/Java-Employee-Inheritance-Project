// -------------------------------------------------------------------------
/**
 * Represents an average employee that does not work 40 hours per week.
 *
 * @author G.J. Hu
 * @version 2025.07.14
 */
public class PartTimeEmployee extends Employee {
    //~ Fields ................................................................
    
    private int hours;

    //~ Constructors ..........................................................
    /**
     * New PartTimeEmployee object.
     *
     * @param name
     *            Name of PartTimeEmployee
     * @param employeeId
     *            Employee ID of PartTimeEmployee
     * @param hourlyRate
     *            Pay rate of PartTimeEmployee (per hour).
     * @param hours
     *            Number of hours worked per week by PartTimeEmployee.
     */
    public PartTimeEmployee(String name, int employeeId, double hourlyRate,
                            int hours) {
        super(name, employeeId, hourlyRate);
        this.hours = hours;
    }

    //~Public  Methods ........................................................
    
    
    // ----------------------------------------------------------
    /**
     * Gets the part time employee's number of hours worked per week.
     *
     * @return the part time employee's number of hours worked per week
     */
    public int getHoursWorked() {
        return hours;
    }
    
    
    // ----------------------------------------------------------
    /**
     * Amount paid to the part time employee for an average work week based on 
     * hours worked.
     *
     * @return weekly pay for part time employee
     * 
     * @Override
     */ 
    public double weeklyPay() {
        return this.getHourlyRate() * hours;
    }


}
