import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        // Array definition
        int[] array = {2, 5, 3, 9, 7, 8, 10};

        // function calling
        getLongestConsecutiveSequence(array);
    }

    // Method definition for getting the longest consecutive sequence
    private static void getLongestConsecutiveSequence(int[] array) {
        // HashMap declaration
        HashMap<Integer, Integer> store = new HashMap<>();

        // Storing array element in hashmap
        for(int num : array) store.put(num, 1);

        // Variable for keeping track of the longest sequence
        int longest = 0;

        // Iterating the array element and finding the longest sequence
        for(int num : array) {
            int curr = 0, val = num;

            while(store.containsKey(val)) {
                curr++;
                val++;
            }

            // Updation
            longest = Math.max(curr, longest);
        }

        // Printing the result
        System.out.println("Longest sequence present is of length: " + longest);
    }
}
