package ReadFileLineByLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// FileReading class definition
public class FileReading {
    // method for reading the reading file line by line
    public static void readFileLineByLine(String file) {
        // Declaring the buffered reader variable
        BufferedReader readFile = null;

        // Using try-catch for potential exception handling
        try {
            // Initializing the buffered reader object by passing the file reader object into the constructor
            readFile = new BufferedReader(new FileReader(file));
            // Taking a line in the string at a time
            String line = readFile.readLine();

            // While loop is true perform the operation of reading the file line by line
            while(true) {
                // Breaking the loop of line contains null
                if(line == null) break;
                // Printing each line
                System.out.println(line);

                // Reading the next line of the file
                line = readFile.readLine();
            }

            // Catching the occurred IO exception
        } catch (IOException e) {
            // Printing the exception message
            System.out.println(e.getMessage());
        } finally {
            try {
                // Closing the resource
                if(readFile != null) {
                    readFile.close();
                    System.out.println("Successfully close the file resource.");
                }
            } catch (IOException e) {
                System.out.println("Exception occurred while closing the file.");
            }
        }
    }
}
