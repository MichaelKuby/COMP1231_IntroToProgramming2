
/**
 * Sphere.java      Represents a sphere and derived from Curved.java
 *
 * @author Michael Kuby
 * @version 1.0
 */
public class Sphere extends Curved
{
    // Note that the sphere has no instance variables that are specific to it; however, it does have override method's required
    // to determine the surface area and volume unique to spheres.
    
    /**
     * Constructor for objects of class Sphere
     */
    public Sphere(double radius)
    {
        super("sphere", radius);
    }

    /**
     * Get volume of a sphere. Volume of a sphere is calculated 4/3 * pi * r^3
     */
    public double getVolume()
    {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Get surface area of a sphere. Surface area of a sphere is calculated A = 4 * pi * r^2
     */
    public double getSurfaceArea()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * To string method displaying info regarding the shape.
     */
    public String toString()
    {
        return super.toString() + "\nVolume: " + getVolume() + "\nSurface area: " + getSurfaceArea();
    }
}
