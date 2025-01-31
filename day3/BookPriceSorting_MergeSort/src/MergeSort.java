public class MergeSort {
    public static void sortBookPriceInAscendingOrder(int[] prices, int size) {
        int start = 0;
        int end = size - 1;

        divideArray(prices, start, end);
    }

    public static void divideArray(int[] prices, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;

            divideArray(prices, start, mid);
            divideArray(prices, mid+1, end);
            merge(prices, start, mid, end);
        }
    }

    private static void merge(int[] prices, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int i=start, j=mid+1, index = 0;

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

        for(i=0, j=start; i<merged.length; i++, j++) {
            prices[j] = merged[i];
        }
    }
}
