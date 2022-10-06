import java.util.*;

/**
 * Parade.java      A collection of Clown objects that represents a Parade
 *
 * @author Michael Kuby
 * @version Oct. 28, 2021
 */
public class Parade
{
    /***********************************************************************************************
     * NOTE: I recognize that, with regards to the exceptions below, I could have used normal logic. 
     * I just wanted practice writing exceptions.
     **********************************************************************************************/
    
    private ArrayList<Clown> parade = new ArrayList<Clown>();

    /**
     * Constructor for objects of class Parade
     * 
     * @param   ... c   variable length list of clown objects
     */
    public Parade(Clown ... c)
    {
        // Add each clown passed as a parameter to the ArrayList
        for (Clown member : c)
        {
            parade.add(0, member);
        }
    }
    
    /**
     * Adds a member to the back of the parade
     * 
     * @param   Clown   A clown object
     * @return  void
     */
    public void add(Clown c)
    {
        parade.add(0, c);
    }
    
    /**
     * Removes the member at the front of the parade. Catches IndexOutOfBoundsException situations where
     * a clown is attempted to be removed from an empty parade.
     * 
     * @return  void
     */
    public void remove()
    {
        try
        {
            Clown temp = parade.get(size()-1);
            parade.remove(parade.size()-1);
            System.out.println (temp.toString() + " removed from the parade.");
        }
        catch (IndexOutOfBoundsException exc)
        {
            System.out.println("Nobody to remove, the parade is empty :(");
        }
    }
    
    /**
     * Gets the size of the parade
     * 
     * @return  int size of parade
     */
    public int size()
    {
        return parade.size();
    }
    
    /**
     * Checks to see if a clown is at the front of the parade. Catches IndexOutOfBoundsException situations caused
     * by the parade being empty.
     *
     * @param       Clown       A clown to be checked for
     * @return      boolean     Returns true if the clown is at the front
     */
    public boolean isFront(Clown c)
    {
        boolean result;
        
        try
        {
            if (parade.get(parade.size()-1) == c)
            result = true;
            else
            result = false;
        }
        catch (IndexOutOfBoundsException exc)
        {
            result = false;
        }
            
        return result;
    }
    
    /**
     * Check to see if a clown is at the front of the parade. Catches IndexOutOfBoundsException situations caused
     * by the parade being empty.
     * 
     * Note: I added this method out of my own interest so that user input could search for
     * who is at the front of the parade.
     * 
     * @param       String      The name of the clown to be checked for
     * @return      boolean     Returns true if the clown is at the front
     */
    public boolean isFront(String name)
    {
        boolean result;
        
        try
        {
            if (name.equalsIgnoreCase(parade.get(parade.size()-1).toString()))
                result = true;
            else
                result = false;
        }
        catch (IndexOutOfBoundsException exc)
        {
            result = false;
        }
            
        return result;
    }
    
    /**
     * Prints out each member of the parade
     * 
     * @return  String  A list of the members of the parade
     */
    public String toString()
    {
        String str = "";
        for (Clown c : parade)
        {
            str += c + "\n";
        }
        return str;
    }
}