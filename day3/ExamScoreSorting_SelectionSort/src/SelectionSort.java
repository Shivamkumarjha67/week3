public class SelectionSort {
    public static void sortExamScoreUsingSelectionSort(int[] score, int size) {
        // Iterating the array score
        for(int i=0; i<size-1; i++) {
            // In index variable, storing the smaller element index
            int index = i;
            for(int j=i+1; j<size; j++) {
                // Updating the index of smaller element
                if(score[j] < score[index]) {
                    index = j;
                }
            }

            // Updating the smaller element to the current index
            int smaller = score[index];
            score[index] = score[i];
            score[i] = smaller;
        }
    }
}
