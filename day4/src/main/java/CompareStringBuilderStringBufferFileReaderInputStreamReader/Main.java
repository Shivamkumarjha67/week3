package CompareStringBuilderStringBufferFileReaderInputStreamReader;


public class Main {
    public static void main(String[] args) {
        // Creating the uri for the file
        String file = "C:\\Users\\shivam kumar jha\\OneDrive\\Desktop\\week3\\day4\\src\\main\\java\\CountSpecificWordInFile.txt";
        // Declaring the word that needs to be searched
        String text = "basant";

        // Method invocation for the comparison of string builder and string buffer
        Comparision.comapreStringBufferStringBuilder(text);
        // Method for counting the word
        Comparision.countWordInFile(file, text);
    }
}
