public class Main {
    public static void main(String[] args) {
        // prices of the books and size declaration
        int[] prices = {230, 563, 422, 102, 132, 99};
        int size = 6;

        // Calling function
        MergeSort.sortBookPriceInAscendingOrder(prices, size);
        System.out.println("After performing the merge sort");

        // Printing the result after the sorting
        for(int price : prices) {
            System.out.print(price + " ");
        }
    }
}