
/************************************************************************************************************
 * DuplicateTitles.java         Module 3: Exceptions; Assignment 3: Question 2
 *
 * Michael Kuby
 * Oct. 20, 2021
 * 
 * Reads all of the titles from an input file, determines for which titles there are duplicates, then
 * writes the names of the duplicate titles to an output file.
 ************************************************************************************************************/
 
 import java.io.*;
 
 public class DuplicateTitles
{
    public static void main (String [] args) throws IOException
    {
        //---------------------------------------------------------------------------------------------------------
        // Prepare for input stream by denoting the file name, creating a buffer, and a FileReader.
        //---------------------------------------------------------------------------------------------------------
        String fileNameIn = "bookTitles.inp.txt";
        BufferedReader in = new BufferedReader ( new FileReader (fileNameIn) );
        String currentTitle = in.readLine();
        
        //---------------------------------------------------------------------------------------------------------
        // Prepare for output stream by denoting the file name, creating a PrintWriter, buffer, and a FileWriter.
        //---------------------------------------------------------------------------------------------------------
        String fileNameOut = "duplicateTitles.out.txt";
        PrintWriter print = new PrintWriter ( new BufferedWriter ( new FileWriter (fileNameOut) ) );
        
        //---------------------------------------------------------------------------------------------------------
        // Create two strings. The first, an index to track all titles from the file.
        // The second, to track all instances of a title being read twice.
        //---------------------------------------------------------------------------------------------------------
        String index = "", multiple = "";
        
        while (currentTitle != null) // While not the end of the file
        {
            // Check to see if the current title in question is already listed in the index
            if (index.contains(currentTitle))
            {
                // Check to see that the current title in question is not already listed in multiple
                if (!multiple.contains(currentTitle))
                {    
                    // If both conditions are true, add the current title to multiple
                    multiple += currentTitle + "\n";
                }
            }
            // When a title is read for the first time by the FileReader, add it to the index.
            else
            {
                index += currentTitle + "\n";    
            }
        
            currentTitle = in.readLine(); // Read the next line from the input stream.
        }
        in.close();
        print.println (multiple);
        print.close();
        
        System.out.println ("Output file has been created: " + fileNameOut);
    }
}
