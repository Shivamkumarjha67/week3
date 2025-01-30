import java.util.HashMap;

public class PairWithGivenSum {
    public static void main(String[] args) {
        // Array definition
        int[] array = {23, 2, 9, 1, 5, 7, 10, 2};
        // Target value
        int target = 4;

        // Function call and printing the result
        System.out.println("Does there exists the pair of elements with the provided sum?: " + isProvidedSumPresent(array, target));
    }

    // Pair of elements present method declaration
    private static boolean isProvidedSumPresent(int[] array, int target) {
        // HashMap definition
        HashMap<Integer, Integer> numbers = new HashMap<>();

        // For each loop iteration
        for(int num : array) {
            // Checking if (target - num) is present in hashmap or not
            if(numbers.containsKey(target - num)) {
                // If any pair present return true
                return true;
            }

            // Putting each number after iteration
            numbers.put(num, 1);
        }

        // If no pair found returning false
        return false;
    }
}
