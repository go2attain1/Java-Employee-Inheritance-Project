// -------------------------------------------------------------------------
/**
 * Represents an average paid contractor working
 *
 * @author G.J. Hu
 * @version 2025.07.14
 */
public class ExternalContractor extends Employee {
    //~ Fields ................................................................

    //~ Constructors ..........................................................
    /**
     * New ExternalContractor object.
     *
     * @param name
     *            Name of ExternalContractor
     * @param employeeId
     *            Employee ID of ExternalContractor
     * @param hourlyRate
     *            Pay rate of External Contractor (per hour).
     * 
     */
    public ExternalContractor(String name, int employeeId, double hourlyRate) {
        super(name, employeeId, hourlyRate);
    }

    //~Public  Methods ........................................................
    

    // ----------------------------------------------------------
    /**
     * Gets the external contractor's hourly rate based on their customer rank
     *
     * @return the external contractor's hourly rate based on their customer
     * rank
     * 
     * @param c
     *            Customer Rank
     */   
    public double getHourlyRate(char c) {
        if (c == 'A') {
            return 45.50;
        } 
        else if (c == 'B') {
            return 41.75;
        }
        else if (c == 'C') {
            return 38.50;
        }
        else {
            return 0.0;
        }
    }
    
    
    // ----------------------------------------------------------
    /**
     * Amount paid to the external contractor for an average work week based on 
     * hours worked and customer rank.
     *
     * @return weekly pay for external contractor
     * 
     * @param hoursWorked
     *            Number of hours worked per week by ExternalContractor.
     * @param rank
     *            Customer Rank
     */ 
    public double weeklyPay(int hoursWorked, char rank) {
        return this.getHourlyRate(rank) * hoursWorked;
    }

}
