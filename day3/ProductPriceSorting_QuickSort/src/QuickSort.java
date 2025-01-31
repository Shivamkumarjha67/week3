class QuickSort {
    public static void sortProductPriceUsingQuickSort(int[] prices, int size) {
        // Declaring the low and high
        int low = 0;
        int high = size - 1;

        // Method call for the quicksort
        quickSort(prices, low, high);
    }

    // Method for sorting the using the quick sort
    private static void quickSort(int[] prices, int low, int high) {
        // Base condition
        if(low < high) {
            // Dividing the array on the basis of the pivot, having smaller on the left and greater on the right side of pivot
            int pivot = partition(prices, low, high);

            // Again calling quicksort function for the part earlier to pivot point
            quickSort(prices, low, pivot - 1);
            // Method calling for after pivot point
            quickSort(prices, pivot + 1, high);
        }
    }

    // Method definition for getting partition point by sorting at the both side of it.
    private static int partition(int[] prices, int low, int high) {
        // Considering the last element of the array as the pivot
        int pivot = prices[high];
        int i = low - 1;

        // Iterating over the array and putting the element on its position with respect to the pivot
        for(int j=low; j<high; j++) {
            if(prices[j] < pivot) {
                i++;
                int temp = prices[j];
                prices[j] = prices[i];
                prices[i] = temp;
            }
        }

        // updating the pivot to its position at the end
        i++;
        prices[high] = prices[i];
        prices[i] = pivot;

        // Returning the pivot point
        return i;
    }
}
