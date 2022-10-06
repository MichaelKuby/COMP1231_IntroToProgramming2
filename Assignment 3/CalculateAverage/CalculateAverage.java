
/**********************************************************************************************************
 * CalculteAverage.java     Module 3: Exceptions; Assignment 3: Question 1
 *
 * Michael Kuby
 * Oct. 20, 2021
 * 
 * Reads a series of integers from the user and continually prints their average after every reading. 
 * Input stops when the user enters "stop" as the input value. Input value is read as a string and
 * converted to int form using Integer.parseInt method. Catches a NumberFormatException if the input 
 * is not a valid integer.
 **********************************************************************************************************/

import java.util.Scanner;

public class CalculateAverage
{
    public static void main (String[] args)
    {
        //--------------------------------------------------------------------------------------------
        // Set up variables for summing and calculating a running average. Ask the user to enter
        // an integer, or quit the program.
        //--------------------------------------------------------------------------------------------
        Scanner keyboard = new Scanner (System.in);
        int count = 0, sum = 0;
        double average = 0;
        String input;
        
        System.out.print ("Enter an integer (STOP to quit): ");
        input = keyboard.nextLine().trim();
        
        while (!input.equalsIgnoreCase("STOP"))
        {
            try // might throw a NumberFormatException if the user's input cannot be converted to an int
            {
                sum += Integer.parseInt(input);
                count++;
                average = (double) sum / count;
            }
            catch (NumberFormatException exception)
            {
                System.out.println ("Input cannot be converted to an integer: " + input);
            }
            
            System.out.println ("The running average is " + average);
            
            System.out.print ("\nEnter an integer (STOP to quit): ");
            input = keyboard.nextLine().trim();
        }
    }
}
