/**
 * ShapeDriver.java     Exercises the behaviours of various shape objects.
 *
 * @author Michael Kuby
 * @version 1.0
 * 
 * ShapeDriver instantiates an array that holds 3DShape objects, asks the user to input information regarding various different shapes,
 * then prints out a detailed report regarding the shapes, including their type, volume, surface area, and number of sides. The process may
 * be repeated easily by answering Y or N.
 */

import java.util.Scanner;

public class ShapeDriver
{
    public static void main (String[] args)
    {
        char again;
        
        do 
        {
            // Instantiate a keyboard for user input
            Scanner keyboard = new Scanner(System.in);
        
            // Instantiate an array that is able to contain 3-Dimensional shape elements
            Shape3D[] shapes = new Shape3D[4];
            
            // Ask the user to input some values, so we can fill up the array
            System.out.println ("Lets calculate the values of a variety of 3-dimensional shapes.");
            System.out.println ("First up: a cube.");
            System.out.print ("Enter the length of a side of a cube: ");
            double length = keyboard.nextDouble();
            
            while (length < 0)
            {
                System.out.println ("Please choose a value greater than or equal to zero: ");
                System.out.print ("Re-enter the length of a side of a cube: ");
                length = keyboard.nextDouble();
            }
            
            shapes[0] = new Cube(length);
            
            System.out.println ("\nNext up: a rectangle.");
            System.out.print ("Enter the height: ");
            double height = keyboard.nextDouble();
            
            while (height < 0)
            {
                System.out.println ("Please choose a value greater than or equal to zero.");
                System.out.print ("Re-enter the height: ");
                height = keyboard.nextDouble();
            }
            
            System.out.print ("Enter the width: ");
            double width = keyboard.nextDouble();
            
            while (width < 0)
            {
                System.out.println ("Please choose a value greater than or equal to zero.");
                System.out.print ("Re-enter the width: ");
                width = keyboard.nextDouble();
            }    
            
            System.out.print ("Enter the depth: ");
            double depth = keyboard.nextDouble();
            
            while (depth < 0)
            {
                System.out.println ("Please choose a value greater than or equal to zero.");
                System.out.print ("Re-enter the depth: ");
                depth = keyboard.nextDouble();
            }
            
            shapes[1] = new Rectangle (height, width, depth);
    
            System.out.println ("\nNext up: a sphere.");
            System.out.print ("Enter the radius: ");
            double radius = keyboard.nextDouble();
            
            while (radius < 0)
            {
                System.out.println ("Please choose a value greater than or equal to zero.");
                System.out.print ("Re-enter the radius: ");
                radius = keyboard.nextDouble();
            }
            
            shapes[2] = new Sphere (radius);
            
            System.out.println ("\nLastly: a cylinder.");
            System.out.print ("Enter the radius: ");
            radius = keyboard.nextDouble();
            
            while (radius < 0)
            {
                System.out.println ("Please choose a value greater than or equal to zero.");
                System.out.print ("Re-enter the radius: ");
                radius = keyboard.nextDouble();
            }
            
            System.out.print ("Enter the height: ");
            height = keyboard.nextDouble();
            
            while (height < 0)
            {
                System.out.println ("Please choose a value greater than or equal to zero.");
                System.out.print ("Re-enter the height: ");
                height = keyboard.nextDouble();
            }
            
            shapes[3] = new Cylinder(radius, height);
            
            System.out.println ();
            
            System.out.println ("Some information about the given shapes is as follows:");
            System.out.println ();
            
            for (int index = 0; index < shapes.length; index++)
            {
                System.out.println (shapes[index].toString());
                System.out.println();
            }
        
            System.out.print ("\nWould you like to repeat the process (Y/N)? ");
            keyboard.close();
            keyboard = new Scanner(System.in);
            String answer = keyboard.nextLine().toUpperCase();
            again = answer.charAt(0);
            
            System.out.println();
        }
        while (again != 'N');
    }
}
