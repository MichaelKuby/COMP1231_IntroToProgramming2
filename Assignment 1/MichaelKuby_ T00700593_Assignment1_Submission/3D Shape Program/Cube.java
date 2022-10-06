
/**
 * Cube.java      Represents a cube, derived from Shape3D.java
 *
 * @author Michael Kuby
 * @version 1.0
 */
public class Cube extends Shape3D
{
    // Instance variables related to cube's
    private double sideLength;
    
    /**
     * Constructor for objects of class Cube
     */
    public Cube(double sideLength)
    {
        super("cube");
        
        this.sideLength = sideLength;
    }

    /**
     * Get side length of the cube
     */
    public double getSideLen ()
    {
        return sideLength;
    }
    
    /**
     * Set side length of the cube
     */
    public void setSideLen (double sideLength)
    {
        this.sideLength = sideLength;
    }
    
    /**
     * Get volume of a cube. Volume of a cube is V = sideLength^3
     */
    public double getVolume()
    {
        return Math.pow(sideLength, 3);
    }
    
    /**
     * Get surface area of a cube. Surface area of a cube is SA = sideLength^2 * 6
     */
    public double getSurfaceArea()
    {
        return 6 * Math.pow(sideLength, 2);
    }
    
    /**
     * To string method displaying info regarding the shape.
     */
    public String toString()
    {
        return super.toString() + "\nSide length: " + sideLength + "\nVolume: " + getVolume() + "\nSurface Area: " + getSurfaceArea();
    }
}
