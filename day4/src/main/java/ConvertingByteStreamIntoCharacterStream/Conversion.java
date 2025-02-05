package ConvertingByteStreamIntoCharacterStream;

import java.io.*;

// Conversion class definition
public class Conversion {
    // Method for converting the byte stream to character stream
    public static void convertByteToCharacterStream(String file) {
        // Initializing the buffered reader object
        BufferedReader reader = null;

        try {
            // Reading the file as byte stream
            FileInputStream fis = new FileInputStream(file);
            // Converting the byte stream into the character stream
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            // Initializing the reader object
            reader = new BufferedReader(isr);

            // Reading the line
            String line = reader.readLine();

            // Printing the line one by one
            while(line != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Printing the message of the exception
            System.out.println(e.getMessage());
        } finally {
            try {
                // Closing the resource
                reader.close();
            } catch (IOException e) {
                System.out.println("Exception occurred while closing the resource.");
            }
        }
    }
}
