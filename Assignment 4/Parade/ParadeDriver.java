import java.util.Scanner;
/**
 * Builds a Parade of various Clown's, and exercises some of the methods of the ArrayList class.
 *
 * @author Michael Kuby
 * @version Oct. 28, 2021
 */
public class ParadeDriver
{
    public static void main (String [] args)
    {    
        System.out.print ("A parade!\n");
        
        Clown michael = new Clown("Michael");
        Clown cF = new Clown("Clownie McClownFace");
        Clown eC = new Clown("Evil clown");
        Clown hC = new Clown("Happy clown");
        
        Parade parade = new Parade (michael, cF, eC, hC);
        
        System.out.println();
        System.out.println("The members of the parade: ");
        System.out.println(parade.toString());
        System.out.println( michael + " is at the front of the parade: " + parade.isFront(michael));
        
        System.out.println ("\nRemoving two members...");
        parade.remove();
        parade.remove();
        
        System.out.println();
        System.out.println("The remaining members of the parade: ");
        System.out.println(parade.toString());
        System.out.println( eC + " is at the front of the parade: " + parade.isFront(eC));
        
        System.out.println ("\nAdding two members...");
        Clown sC = new Clown ("Sad clown");
        Clown vC = new Clown ("Violent clown");
        parade.add(sC);
        parade.add(vC);
        
        System.out.println();
        System.out.println("The updated members of the parade: ");
        System.out.println(parade.toString());
        
        
        System.out.println( michael + " is at the front of the parade: " + parade.isFront(michael));
        System.out.println( cF + " is at the front of the parade: " + parade.isFront(cF));
        System.out.println( eC + " is at the front of the parade: " + parade.isFront(eC));
        
        System.out.println ();
        
        /***********************************************************************************************************
         * This next part I added because I was interested in having the user manipulate the members of the parade. 
         * You may ignore it for marking purposes as the above should fulfill the assignment requirements. I just
         * didn't want to delete it all after it was written it.
         ***********************************************************************************************************/
        
        System.out.println ("Added out of my own interest; the above should fulfill the assignment requirements.\n");
        
        System.out.print ("Add a member to the parade or quit to stop ---> ");
        Scanner keyboard = new Scanner (System.in);
        String member = keyboard.nextLine();
        
        while (!member.equalsIgnoreCase("quit"))
        {
            parade.add(new Clown (member));
            System.out.print ("Add another member to the parade or quit to stop ---> ");
            member = keyboard.nextLine();
        }
        
        System.out.print ("\nType a name to see who's at the front --->");
        keyboard = new Scanner (System.in);
        member = keyboard.nextLine();
        
        while (!member.equalsIgnoreCase("quit"))
        {
            System.out.println ( member + " is at the front of the parade: " + parade.isFront(member));
            System.out.print ("\nType another name to see who's at the front --->");    
            member = keyboard.nextLine();
        }
    }
}
