import java.util.ArrayList;
import java.util.Scanner;
/**
 * DrawDriver.java      
 * 
 * Uses the Box class to represent two boxes: one holds the names of five people, the other the numbers 1-5,
 * representing seats at a table. Draws from each box to determine which seat a person will occupy.
 *
 * @author Michael Kuby
 * @version Oct. 29, 2021
 */
public class DrawDriver
{
    public static void main (String [] args)
    {
        String draw = "";
        
        while (!draw.equalsIgnoreCase("stop"))
        {
            /**
             *  Create two boxes, one with the names of 5 people, and one with the numbers 1-5 inclusive.
             */
            
            Box<String> box1 = new Box<String>("Michael", "Musfiq", "Cayley", "Thoko", "Julianne");
            Box<Integer> box2 = new Box<Integer>(1, 2, 3, 4, 5);
            
            /**
             * Draw from each box to determine which seat a person will occupy at a table.
             * Take the name and number pairings and assign them to a point which holds generic x and y objects.
             * Assign the Point objects to an ArrayList to hold and organize for future processing.
             */
            
            ArrayList<Point> assignments = new ArrayList<Point>(5);
            
            for (int i = 1; i <= 5; i++)
            {
                assignments.add ( new Point ( box1.drawItem(), box2.drawItem() ) );
            }
            
            /**
             * Print out the results
             */
            
            System.out.println ("Each name and their assigned chair is as follows:");
            
            for (Point p : assignments)
                System.out.println (p.toString());
            
            System.out.println();
            
            /**
             * Prompt the user to draw again
             */
            
            System.out.print("Enter any key to draw again, or stop to quit: ");
            Scanner scan = new Scanner (System.in);
            draw = scan.next();
            System.out.println();
        }
    }
}
