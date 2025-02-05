package WordFromListOfSequence;

// WordSearching class definition
public class WordSearching {
    // Method for searching the sequence that contains the given word
    public static String getSequenceContainingWord(String[] sequences, String word) {
        // Iterating the loop and find the sequence that contains the given word
        for(int i=0; i<sequences.length; i++) {
            // Splitting the word and storing it into the temp array of string type
            String[] temp = sequences[i].split(" ");

            // Iterate the temp array for the checking each word.
            for(int j=0; j<temp.length; j++) {
                // condition for removing the full stop from last word and returning the sequence having the given word
                if(j == temp.length-1) {
                    if(temp[j].substring(0, temp[j].length()-1).equals(word)) return sequences[i];
                } else {
                    if(temp[j].equals(word)) return sequences[i];
                }
            }
        }

        // Returning "Not Found", in case no sequence found
        return "Not Found";
    }
}
