
/**
 * Rectangle.java     Represents a rectangle, derived from Shape3D.java
 *
 * @author Michael Kuby
 * @version 1.0
 */
public class Rectangle extends Shape3D
{
    // instance variables related to rectangles
    private double height, width, depth;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double height, double width, double depth)
    {
        super("rectangle");
        
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    /**
     * Set the height
     */
    public void setHeight (double height)
    {
        this.height = height;
    }
    
    /**
     * Get the height
     */
    public double getHeight ()
    {
        return height;
    }
    
    /**
     * Set the width
     */
    public void setWidth (double width)
    {
        this.width = width;
    }
    
    /**
     * Get the width
     */
    public double getWidth ()
    {
        return width;
    }
    
    /**
     * Set the depth
     */
    public void setDepth (double depth)
    {
        this.depth = depth;
    }
    
    /**
     * Get the depth
     */
    public double getDepth ()
    {
        return depth;
    }

    /**
     * Get the Volume of the rectangle
     * Volume is calculated V = height * width * depth
     */
    public double getVolume()
    {
        return height * width * depth;
    }
    
    /**
     * Get the Surface Area of the rectangle
     * Surface area (SA) requires the calculation of all 6 sides.
     * SA = 2 * (height * width + height * depth + width * depth)
     */
    public double getSurfaceArea()
    {
        return 2 * (height * width + height * depth + width * depth);
    }
    
    /**
     * To string method displaying info regarding the shape.
     */
    public String toString ()
    {
        return super.toString() + "\nHeight: " + height + "\nWidth: " + width + "\nDepth: " + depth 
                                + "\nVolume: " + getVolume() + "\nSuface area: " + getSurfaceArea();
    }
    
}
