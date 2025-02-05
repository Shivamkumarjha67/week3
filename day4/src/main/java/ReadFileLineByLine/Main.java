package ReadFileLineByLine;

// Main class contain all essential commands for performing operations
public class Main {
    // Main method definition
    public static void main(String[] args) {
        // String "file" contains the location of the file as uri
        String file = "C:\\Users\\shivam kumar jha\\OneDrive\\Desktop\\week3\\day4\\src\\main\\java\\ReadFileLineByLine\\capgemini.txt";

        // Method invocation by passing file location and name of it.
        FileReading.readFileLineByLine(file);
    }
}
