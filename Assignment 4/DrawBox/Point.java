
/**
 * Represents a pair of generic objects
 *
 * @author Michael Kuby
 * @version Oct. 29, 2021
 */
public class Point<T, S>
{
    private T x;
    private S y;

    /**
     * Constructor for objects of class Point
     */
    public Point(T x, S y)
    {
        setX(x);
        setY(y);
    }
    
    /**
     * Sets the object reference variable X to the passed parameter object
     * 
     * @param   T   object to be assigned to the X coordinate
     */
    public void setX(T x)
    {
        this.x = x;
    }
    
    /**
     * Sets the object reference variable Y to the passed parameter object
     * 
     * @param   S   object to be assigned to the Y coordinate
     */
    public void setY(S y)
    {
        this.y = y;
    }
    
    /**
     * Get the generic object assigned to x
     * 
     * @return  T   the object assigned to the x variable
     */
    public T getX()
    {
        return x;
    }
    
    /**
     * Get the generic object assigned to y
     * 
     * @return  S   the object assigned to the y variable
     */
    public S getY()
    {
        return y;
    }
    
    /**
     * Returns a string representation of the point
     *
     * @return  String  A string representation of the point object
     */
    public String toString()
    {
        return "(" + x.toString() +", " + y.toString() + ")";
    }
}
