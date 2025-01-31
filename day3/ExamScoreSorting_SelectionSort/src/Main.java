public class Main {
    public static void main(String[] args) {
        // Array declaration having the score of exam
        int[] score = {45, 78, 22, 10, 34};
        int size = 5;

        // Method calling for sorting exam score using the selection sort
        SelectionSort.sortExamScoreUsingSelectionSort(score, size);
        System.out.println("After the performing the selection sort: ");

        // Printing the score after the sorting it
        for(int mark : score) {
            System.out.print(mark + " ");
        }
    }
}