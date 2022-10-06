import java.util.ArrayList;
import java.util.Objects;
public class TestEquals {
    public static void main(String[] args) {
        ArrayList<Clown> clowns = new ArrayList<>();
        
        Clown c1 = new Clown("Clown1", 23);
        Clown c2 = new Clown("Clown2", 35);
        Clown c3 = new Clown("Clown1", 23);
        
        clowns.add(c1);
        clowns.add(c2);
        clowns.add(c3);
        //clowns.add(c1);
        
        
        // When you create a new Clown with the same content (i.e., c1),
        // the object is cretaed in a differnt memory location.  
        Clown clownToFind = new Clown("Clown1", 23);
        //Clown clownToFind = null;
        // Comparing two Clowns using '==' and .equals
        
        // The == operator compares the memory locations of two objects.
        // Since, c1 and clownToFind both points to different memory locations,
        // the result of comparing them using '==' should be False.
        // Check it out!
        
        if(c1 == clownToFind)
            System.out.println("True! Both c1 and clownToFind are refering to the same object.");
        else
            System.out.println("False! The memory locations of c1 and clownToFind are different.");
        
        
        // If the Clown class does not override the .equals method,  
        // then the default .equals method from the Object class will be called, 
        // in that case, the result will be the same as comparing two objects using '==' operator.
        // Therefore, if you want c1 and clownToCompare to return a true value,
        // you need to override .equals method. 
        
        
        if(c1.equals(clownToFind))
            System.out.println("The content of two objects are the same!");
        else
        {
            System.out.print("It is still comparing the memory locations of the objects! ");
            System.out.println("Override \".equals\" method, if you want diffrent result!");
        }
        
        // Second part: uncomment the .equals methoid in the Clown class, and then run
        // the code again to see what happens!
    }
    
}
