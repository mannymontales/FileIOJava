package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try {
                // Create the Scanner object using the file
                // as input
                Scanner fileIn = new Scanner(new File("src/main/java/Step4/input.txt"));

                /* Loop while the file still has lines.
                 * .hasNext() looks to see if a line exists
                 * but it doesn't read the line.
                 */
                int sum = 0;
                while (fileIn.hasNext()) {

                    //use the file as input for scanner object still dont understand why it doesnt need to read the whole line
                    // for input
                    sum += fileIn.nextInt();
                    /*
                    // Reads the entire line as a string
                    String lineIn = fileIn.nextLine();
                    // Split the line into a String array
                    String[] input = lineIn.split(",");
                    int sum = 0;
                    for (int i = 0; i < input.length; i++) {
                        sum += Integer.parseInt(input[i]);
                     */
                }
                System.out.print("Total: " + sum);
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
            // Print out a running total of all the
            // values in the input file.
        }
}