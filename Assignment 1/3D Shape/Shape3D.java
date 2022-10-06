
/**
 * Shape3D.java     Represents an abstract 3-Dimensional geometric shape.
 * 
 * All shapes have some common characteristics, such as a "name" or category they fall into, and
 * all 3-dimensional shapes can be characterized as having 0 or more "flat" sides. The class Shape3D
 * is designed to be an abstract class that houses these common variables, and is designed with the intention
 * of being a parent to future derivative classes.
 *
 * @author Michael Kuby
 * @version 1.0
 */
public abstract class Shape3D
{
    // instance variables
    private String category;
    private int sides;

    /**
     * Constructor for objects of class Shape3D
     */
    public Shape3D(String category)
    {
        this.category = category;
        
        switch (category)
        {
            case "sphere":
                sides = 0;
                break;
            case "cylinder":
                sides = 2;
                break;
            case "cube":
                
            case "rectangle":
                sides = 4;
                break;
        }
    }

    /**
     * Get volume of shape. To be fully defined in subclasses.
     */
    abstract double getVolume();
    
    /**
     * Get surface area of shape. To be fully defined in subclasses.
     */
    abstract double getSurfaceArea();
    
    /**
     * toString method specified
     */
    public String toString()
    {
        return "Shape type: " + category + "\nSides: " + sides;
    }
}
