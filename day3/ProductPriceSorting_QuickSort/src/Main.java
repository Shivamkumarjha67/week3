public class Main {
    public static void main(String[] args) {
        // Array declaration having the prices
        int[] prices = {23, 56, 22, 19, 88, 25};
        // Size of the array
        int size = 6;

        // Method calling for sorting the prices using the quick sort
        QuickSort.sortProductPriceUsingQuickSort(prices, size);
        System.out.println("After the sorting the price: ");

        // iterating the price array after sorting
        for(int price: prices) {
            System.out.print(price + " ");
        }
    }
}