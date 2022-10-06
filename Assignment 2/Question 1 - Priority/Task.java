
/**
 * Task.java
 * 
 * Represents a task on a to-do list.
 *
 * @author Michael Kuby
 * @version 1.0
 */
public class Task implements Priority, Comparable
{
    //----------------------------------------------------------------------
    // Instance variable which is a string description of the task
    //----------------------------------------------------------------------
    private String description;
    private int priority;

    //----------------------------------------------------------------------
    // Constructor for objects of class Task
    //----------------------------------------------------------------------
    public Task(String description, int priority)
    {
        // initialise instance variables
        this.description = description;
        setPriority(priority);
    }

    //----------------------------------------------------------------------
    // Set the task description
    //----------------------------------------------------------------------
    public void setTask(String task)
    {
        this.description = task;
    }
    
    //----------------------------------------------------------------------
    // Get the task description
    //----------------------------------------------------------------------
    public String getTask()
    {
        return description;
    }
    
    //----------------------------------------------------------------------
    // Set the priority of the task
    //----------------------------------------------------------------------
    public void setPriority (int priority)
    {
        switch (priority)
        {
            case 5:
                this.priority = VHIGH;
                break;
            case 4:
                this.priority = HIGH;
                break;
            case 3:
                this.priority = MEDIUM;
                break;
            case 2:
                this.priority = LOW;
                break;
            case 1:
                this.priority = VLOW;
                break;
            default:
                this.priority = MEDIUM;
                break;
        }
    }       
    
    //----------------------------------------------------------------------
    // Get the priority level of the task
    //----------------------------------------------------------------------
    public int getPriority ()
    {
        return priority;
    }
    
    //----------------------------------------------------------------------
    // Implementation of the compareTo method
    //----------------------------------------------------------------------
    public int compareTo (Object obj)
    {
        int result;
        
        Task compared = (Task) obj;
        
        if (obj != null && getPriority() == compared.getPriority())
            result = 0;
        else
            if (obj != null && getPriority() > compared.getPriority())
                result = 1;
            else
                result = -1;
        
        return result;
    }
    
    //----------------------------------------------------------------------
    // Returns a detailed description of the object.
    //----------------------------------------------------------------------
    public String toString ()
    {
        String str = "Task: " + description + "\nPriority level: " + priority + "\n";
        
        return str;
    }
}
