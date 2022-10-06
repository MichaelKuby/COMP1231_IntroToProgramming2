
/**
 * Curved.java          Defined by the fact that they have a radius.
 *
 * A subclass of generic 3 dimensional shapes are curved shapes with circular elements, such as spheres, cylinder's, cones, etc.
 * A common trait amongst these shapes are the fact that they have a radius. The Curved class is an abstract subclass with superclass 
 * Shape3D, designed with the intent of being the parents to more specific subclasses.
 *
 * @author Michael Kuby
 * @version 1.0
 */
public abstract class Curved extends Shape3D
{
    // instance variables
    protected double radius;
    
    public Curved (String category, double radius)
    {
        super(category);
        
        this.radius = radius;
    }
    
    /** 
     * Set radius
     */
    public void setRadius (double radius)
    {
        this.radius = radius;
    }
    
    /** 
     * Get radius
     */
    public double getRadius ()
    {
        return radius;
    }
    
    /**
     * To string method displaying info regarding the shape.
     */
    public String toString ()
    {
        return super.toString() + "\nRadius: " + radius;
    }
}
