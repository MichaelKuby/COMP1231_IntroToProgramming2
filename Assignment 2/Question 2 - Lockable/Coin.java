
//----------------------------------------------------------------------------------
// Coin.java        Assignment 2: Question 2 - Lockable
//
// Michael Kuby
// October 9, 2021
//----------------------------------------------------------------------------------
public class Coin implements Lockable
{
    private final int HEADS = 0; // tails is 1
    
    private int face; // current side showing

    private int key; // key used to lock and unlock the object's methods. Originally initialized to zero.
    
    private boolean locked; // Tracks whether the object's state is locked or unlocked.
    
    //----------------------------------------------------------------------------------
    // Sets up this coin by flipping it initially.
    //----------------------------------------------------------------------------------
    public Coin()
    {
        flip();
    }

    //----------------------------------------------------------------------------------
    // Flip this coin by randomly choosing a face value.
    //----------------------------------------------------------------------------------
    public void flip()
    {
        if (!locked)
            face = (int) (Math.random() * 2);
        else
            System.out.println ("The coin is locked.");
    }
    
    //----------------------------------------------------------------------------------
    // Returns true if the current face of this coin is heads.
    //----------------------------------------------------------------------------------
    public Boolean isHeads()
    {
        Boolean result;
        
        if (!locked)
            result = (face == HEADS);
        else
            result = null;
        
        return result;
    }
    
    //----------------------------------------------------------------------------------
    // Set the key used to lock and unlock the object
    //----------------------------------------------------------------------------------
    public void setKey (int key)
    {
        this.key = key;
    }
    
    //----------------------------------------------------------------------------------
    // Lock the objects methods
    //----------------------------------------------------------------------------------
    public void lock (int key)
    {
        if (this.key == key)
            locked = true;
    }
    
    //----------------------------------------------------------------------------------
    // Unlock the objects methods
    //----------------------------------------------------------------------------------
    public void unlock (int key)
    {
        if (this.key == key)
            locked = false;
    }
    
    //----------------------------------------------------------------------------------
    // Report whether or not the object is currently locked.
    //----------------------------------------------------------------------------------
    public boolean locked ()
    {
        return locked;
    }
    
    //----------------------------------------------------------------------------------
    // Returns the current face of this coin as a string.
    //----------------------------------------------------------------------------------
    public String toString()
    {
        String str;
        
        if (!locked)
            str = (face == HEADS) ? "Heads" : "Tails";
        else
            str = "The coin is locked.";
            
        return str;
    }
}
