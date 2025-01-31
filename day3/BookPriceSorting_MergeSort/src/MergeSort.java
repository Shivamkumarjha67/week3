public class MergeSort {
    public static void sortBookPriceInAscendingOrder(int[] prices, int size) {
        // Declaring the start and end index
        int start = 0;
        int end = size - 1;

        // Function calling for dividing the array
        divideArray(prices, start, end);
    }

    // Function for dividing the array
    public static void divideArray(int[] prices, int start, int end) {
        // Base condition
        if(start < end) {
            // Finding the mid point
            int mid = start + (end - start) / 2;

            // Further dividing the array into sub-array
            divideArray(prices, start, mid);
            divideArray(prices, mid+1, end);
            // Merging the divided array in sorted order
            merge(prices, start, mid, end);
        }
    }

    // Method for merging the two part of array into sorted manner
    private static void merge(int[] prices, int start, int mid, int end) {
        // Declaring the new array for storing the sorted form using extra memory
        int[] merged = new int[end - start + 1];
        // Two starting point of the different part is initialized and compared further
        int i=start, j=mid+1, index = 0;

        // Using the loop the comparision is made and stored into merged array
        while(i <= mid && j <= end) {
            if(prices[i] < prices[j]) {
                merged[index++] = prices[i];
                i++;
            } else {
                merged[index++] = prices[j];
                j++;
            }
        }

        while(i <= mid) {
            merged[index++] = prices[i++];
        }

        while(j <= end) {
            merged[index++] = prices[j++];
        }

        // At the end order is maintained into the original array in the sorted order
        for(i=0, j=start; i<merged.length; i++, j++) {
            prices[j] = merged[i];
        }
    }
}
