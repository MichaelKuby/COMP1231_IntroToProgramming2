
/**
 * TaskDriver.java
 * 
 * Excersises some Task objects. 
 * Produces comparison's where a given task is higher, lower, or equal in priority to some other task.
 *
 * @author Michael Kuby
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Arrays;

public class TaskDriver
{
    public static void main (String [] args)
    {
        char again;     // Controls the do loop
        
        int index = 0;  // Keeps track of the array utilization
        
        Task[] taskArray = new Task[index+1];   // A task array that will hold task objects. Set to intially hold just a single task.
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println ("Let's make a to do list, and set some priorities.\n");
        
        do
        {
            //----------------------------------------------------------------------------------
            // Prompt the user for information about the task
            //----------------------------------------------------------------------------------
            
            System.out.println ("Enter a task: ");
            String task = keyboard.nextLine().trim();
            
            System.out.print ("Enter a priority level between 1 (LOW) - 5 (HIGH): ");
            int priority = keyboard.nextInt();
            
            while (priority < 1 || priority > 5)
            {
                System.out.print ("Please re-enter a priority level for the task, between 1 - 5: ");
                priority = keyboard.nextInt();
            }
            
            //----------------------------------------------------------------------------------
            // Create the task
            //----------------------------------------------------------------------------------
            
            taskArray[index] = new Task (task, priority);
            
            index++;
            
            System.out.print ("\nWould you like to add another task (Y/N)? ");
            keyboard.close();
            keyboard = new Scanner (System.in);
            String response = keyboard.nextLine().toUpperCase();
            again = response.charAt(0);
            
            System.out.println();
            //----------------------------------------------------------------------------------
            // If adding a new task, create space by creating a larger array, transferring over the
            // existing data, and then overwriting the original array with the larger array.
            //----------------------------------------------------------------------------------
            
            if (again == 'Y')
            {
                Task[] temp = new Task[taskArray.length+1];
                
                for (int t = 0; t < taskArray.length; t++)
                    temp[t] = taskArray[t];
                    
                taskArray = temp;
            }
        }
        while (again == 'Y');
        
        //----------------------------------------------------------------------------------
        // Print out the unorganized list of tasks
        //----------------------------------------------------------------------------------
        System.out.println ("Here is the list of the tasks you entered: \n\n");
        for (Task task : taskArray)
        {
            System.out.println (task);
        }
        
        System.out.println("\n\n");
        
        //----------------------------------------------------------------------------------
        // Sort the task array. It will make use of the compareTo method of the tasks.
        //----------------------------------------------------------------------------------
        Arrays.sort(taskArray);
        
        //----------------------------------------------------------------------------------
        // Print out the organized list of tasks
        //----------------------------------------------------------------------------------
        System.out.println ("Here is the list of tasks, organized by priority: \n\n");
        for (int t = taskArray.length-1; t >=0; t--)
        {
            System.out.println (taskArray[t]);
        }
    }
}
