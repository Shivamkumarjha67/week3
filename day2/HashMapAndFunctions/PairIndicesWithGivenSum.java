import java.util.HashMap;

public class PairIndicesWithGivenSum {
    public static void main(String[] args) {
        // Array definition
        int[] array = {23, 2, 9, 1, 5, 7, 10, 2};
        // Target value
        int target = 4;
        int[] indices = indicesOfProvidedSumPresent(array, target);

        // Function call and printing the result
        if(indices != null)
        System.out.println("Indices of pair of elements with the provided sum?: {" + indices[0] + ", " + indices[1] + "}");
        else System.out.println("No pair found...");
    }

    // Pair of elements present method declaration
    private static int[] indicesOfProvidedSumPresent(int[] array, int target) {
        // HashMap definition
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int[] result = new int[2];

        // For each loop iteration
        for(int i=0; i<array.length; i++) {
            int num = array[i];
            result[0] = i;

            // Checking if (target - num) is present in hashmap or not
            if(numbers.containsKey(target - num)) {
                // If any pair present return true
                result[1] = numbers.get(target - num);
                return result;
            }

            // Putting each number after iteration
            numbers.put(num, i);
        }

        // If no pair found returning false
        return null;
    }
}
