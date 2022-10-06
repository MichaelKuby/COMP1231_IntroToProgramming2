
/**
 * Cylinder.java      Represents a cylinder and derived from Curved.java
 *
 * @author Michael Kuby
 * @version 1.0
 */
public class Cylinder extends Curved
{
    // instance variables specific to a cylinder
    private double height;

    /**
     * Constructor for objects of class Cylinder
     */
    public Cylinder(double radius, double height)
    {
        super("cylinder", radius);
        
        this.height = height;
    }

    /**
     * Set height of cylinder
     */
    public void setHeight (double height)
    {
        this.height = height;
    }
    
    /**
     * Get height of cylinder
     */
    public double getHeight ()
    {
        return height;
    }
    
    /**
     * Get volume of a cylinder. 
     * Volume of a cylinder is calculated V = pi * h * r^2
     */
    public double getVolume()
    {
        return Math.PI * height * Math.pow(radius, 2);
    }
    
    /**
     * Get surface area of a cylinder. Surface area of a cylinder is calculated A = (2 * pi * r * h) + (2 * pi * r^2) = 2 * pi * r * (h + r)
     */
    public double getSurfaceArea()
    {
        return 2 * Math.PI * radius * (height + radius);
    }
    
    /**
     * To string method displaying info regarding the shape.
     */
    public String toString()
    {
        return super.toString() + "\nHeight: " + height + "\nVolume: " + getVolume() + "\nSurface area: " + getSurfaceArea();
    }
}
