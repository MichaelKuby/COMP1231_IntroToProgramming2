import java.util.ArrayList;
import java.util.Random;
/**
 * Box.java     A generic class that simulates drawing an item at random out of a box.
 *
 * @author Michael Kuby
 * @version Oct. 29, 2021
 */
public class Box<T>
{
    private ArrayList<T> box = new ArrayList<T>();

    /**
     * Constructor for objects of class Box
     */
    public Box(T ... obj)
    {
        for (T thing : obj)
        {
            box.add(thing);
        }
    }

    /**
     * Add an object of the specified type to the box
     *
     * @param   T   object to be added
     * @return  void
     */
    public void add(T obj)
    {
        box.add(obj);
    }
    
    /**
     * Check to see if the box is empty
     * 
     * @return   boolean returns true if the box is empty, false otherwise.
     */
    public boolean isEmpty()
    {
        return box.isEmpty();
    }
    
    /**
     * Randomly select an object from the box and return it.
     * Eliminates the drawn item from the box.
     * 
     * @return  T   Returns a random object from the box; null if the box is empty
     */
    public T drawItem()
    {
        T result;
        Random rng = new Random();
        
        if (!box.isEmpty())
        {
            // choose a random number between 0 and the number of objects in the box
            // to simulate choosing an object at random
            int i = rng.nextInt(box.size());
            result = box.get(i);
            
            // remove the drawn item from the box
            box.remove(i);
        }
        else
        {
            // if the box is empty, return null
            result = null;    
        }
            
        return result;
    }
    
    /**
     * Outputs the currect contents of the box
     * 
     * @return   String  A string displaying the current contents of the box
     */
    public String toString()
    {
        String str = "";
        
        for (T obj : box)
            str += obj.toString();
            
        return str;
    }
}
