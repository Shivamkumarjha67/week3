package CompareStringBuilderStringBufferFileReaderInputStreamReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comparision {
    public static void comapreStringBufferStringBuilder(String str) {
        // Creating the string builder object
        StringBuilder builder = new StringBuilder();
        // time variable for keeping track
        long start, end;

        // Start time
        start = System.nanoTime();

        // Appending for 1000000 times the given string into builder
        for(int i=0; i<1000000; i++) {
            builder.append(str);
        }

        // End time
        end = System.nanoTime();
        // Printing the result
        System.out.println("The time difference for string builder operation is: " + (end - start));

        // Creating the string buffer
        StringBuffer buffer = new StringBuffer();
        // start time
        start = System.nanoTime();

        // Appending for 1000000 times the given string into buffer
        for(int i=0; i< 1000000; i++) {
            buffer.append(str);
        }

        // End time
        end = System.nanoTime();
        // Printing the result
        System.out.println("The time difference for string builder operation is: " + (end - start));
    }

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
