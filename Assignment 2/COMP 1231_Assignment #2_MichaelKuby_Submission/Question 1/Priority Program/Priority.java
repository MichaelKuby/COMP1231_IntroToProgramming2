
/**
 * Priority.java
 * 
 * Define's a way to establish priority among a set of objects
 *
 * @author Michael Kuby
 * @version 1.0
 */

public interface Priority
{
    //----------------------------------------------------------------------
    // Define constants in the interface for the relevant priority values
    //----------------------------------------------------------------------
    public static final int VHIGH = 5, HIGH = 4, MEDIUM = 3, LOW = 2, VLOW = 1;
    
    //----------------------------------------------------------------------
    // Set the priority level
    //----------------------------------------------------------------------
    public void setPriority(int val);
    
    //----------------------------------------------------------------------
    // Get the priority level
    //----------------------------------------------------------------------
    public int getPriority();
}
