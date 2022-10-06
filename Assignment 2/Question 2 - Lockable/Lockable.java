//----------------------------------------------------------------------------------
// Lockable.java            Assignment 2: Question 2 - Lockable
//
// An interface designed to protect the regular methods of an object. If the object
// is locked, it's methods cannot be invoked; if it is unlocked, they may be invoked.
//
// Michael Kuby
// Oct 9 2021
//----------------------------------------------------------------------------------
public interface Lockable
{
    //----------------------------------------------------------------------------------
    // Set the key used to lock and unlock the object
    //----------------------------------------------------------------------------------
    public void setKey (int key);
    
    //----------------------------------------------------------------------------------
    // Lock the objects methods
    //----------------------------------------------------------------------------------
    public void lock (int key);
    
    //----------------------------------------------------------------------------------
    // Unlock the objects methods
    //----------------------------------------------------------------------------------
    public void unlock (int key);
    
    //----------------------------------------------------------------------------------
    // Report whether or not the object is currently locked.
    //----------------------------------------------------------------------------------
    public boolean locked ();
}
