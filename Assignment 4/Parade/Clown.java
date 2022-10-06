
/**
 * Represents a Clown in a Parade.
 *
 * @author Michael Kuby
 * @version Oct 28, 2021
 */
public class Clown
{
    private String name;

    /**
     * Constructor for objects of class Clown
     */
    public Clown(String name)
    {
        // initialise instance variables
        this.name = name;
    }

    /**
     * Compares the contents of this Clown with another.
     * 
     * @param       Clown   Clown to be compared
     * @return      boolean Returns true if the contents of both objects are equal.
     */
    public boolean equals(Clown c)
    {
        boolean result;
        
        if (c != null)
            if (this.name.equals(c.toString()))
                result = true;
            else
                result = false;
        else
            result = false;
        
        return result;
    }
    
    /**
     * Get's the name of the Clown object
     *
     * @return    the name of the Clown
     */
    public String toString()
    {
        return name;
    }
}
