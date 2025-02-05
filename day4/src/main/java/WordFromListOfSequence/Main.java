package WordFromListOfSequence;

public class Main {
    public static void main(String[] args) {
        // Array of the sequences
        String[] sequences = {"This is good way of doing it.", "Shiv is eternal truth.", "He is behind the creation."};
        // Word that is going to be searched
        String word = "eternal";

        // Method call and storing the answer
        String result = WordSearching.getSequenceContainingWord(sequences, word);
        // Printing the result
        System.out.println("Word " + word + " is found in: " + result);
    }
}
