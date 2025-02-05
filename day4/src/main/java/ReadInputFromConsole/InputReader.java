package ReadInputFromConsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    public static void readFromConsole(String file) {
        try {
            // Input stream reader object declaration for taking input from the console
            InputStreamReader isr = new InputStreamReader(System.in);
            // Buffered reader for efficient reading
            BufferedReader br = new BufferedReader(isr);

            // Printing the input
            System.out.println("Entered the content on console: ");

            // Declaring the file writer object for the modification in the input
            FileWriter writer = new FileWriter(file);
            String line;

            // Taking the input and checking the given condition
            while(!(line = br.readLine()).equalsIgnoreCase("exit")) {
                // Modifying the file content
                writer.append(line + "\n");
            }

           // Printing the modified result
            System.out.println("After writing the file is: " + file);

            // Catching the IO exception
        } catch (IOException e) {
            System.out.println("Exception occurred while writing the in the file.");
        }
    }
}
