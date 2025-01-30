import java.util.HashMap;
import java.util.Map.*;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        // Array declaration and definition
        int[] array = {2, -2, 4, 8, -12, 33, 8, 23, 45};
        // Hashmap declaration
        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Total variable for storing the sum all element of array
        int total = 0;
        // Storing the frequency
        frequency.put(0, 0);

        // Iterating over the array
        for(int num : array) {
            // Adding each into the total variable
            total += num;
            // Putting the added value into the hashmap
            frequency.put(total, frequency.getOrDefault(total, 0) + 1);
        }

        // counting the total subarray with zero sum
        int countZeroSum = frequency.get(0);

        for(Entry<Integer, Integer> mp : frequency.entrySet()) {
            if(mp.getValue() > 1 && mp.getKey() != 0) countZeroSum += mp.getValue();
        }

        System.out.println("Number of subarray with zero sum are: " + countZeroSum);
    }
}


