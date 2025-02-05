package CountSpecificWordInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// CountWord class definition
public class CountWord {
    public static void countWordInFile(String file, String word) {
        // Declaring the buffered reader object
        BufferedReader reader = null;
        // Declaring the counter object
        int counter = 0;

        try {
            // Initializing the reader object by passing the file reader object in constructor
            reader = new BufferedReader(new FileReader(file));

            // Taking a line at a time
            String line = reader.readLine();

            // If line is not null
            while(line != null) {
                // Splitting the all words and storing into a array of string type
                String[] words = line.split("//s+");

                // If passed word found in the array then incrementing the counter by the number of occurrences.
                for(int i=0; i<words.length; i++) {
                    if(words[i].equals(word)) counter++;
                }
            }
            // Handling the exception
        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // Closing the resource
            try {
                reader.close();
                System.out.println("Closed the resource successfully.");
            } catch (IOException e) {
                System.out.println("Exception occurred while closing the resource.");
            }
        }

        // Printing the result
        System.out.println("Occurrence of the word " + word + " is: " + counter);
    }
}
