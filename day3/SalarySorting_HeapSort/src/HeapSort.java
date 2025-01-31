public class HeapSort {
    public static void sortSalary(int[] salary, int size) {
        // building the array as max heap starting from internal node of the tree
        for(int i=size/2 - 1; i>=0; i--) {
            // Calling the max heapify method
            maxHeapify(salary, size, i);
        }

        // Extracting the top of the heap. i.e, the largest of the heap
        for(int i=size-1; i>=0; i--) {
            // Swapping the largest salary in the last of the array
            int largest = salary[0];
            salary[0] = salary[i];
            salary[i] = largest;

            // Again after swapping the largest again calling the max heapify
            maxHeapify(salary, i, 0);
        }
    }

    // Method definition for the max heapify
    private static void maxHeapify(int[] salary, int size, int i) {
        // Storing thr index of the largest among the parent, left child and right child
        int largestIndex = i;
        // Finding the index of the left child and right child
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // Checking the largest among child and updating the largest index
        if(leftChild < size && salary[leftChild] > salary[largestIndex]) largestIndex = leftChild;
        if(rightChild < size && salary[rightChild] > salary[largestIndex]) largestIndex = rightChild;

        // If largest index is updated means that the subtree is not in max heap order
        if(largestIndex != i) {
            int temp = salary[i];
            salary[i] = salary[largestIndex];
            salary[largestIndex] = temp;

            // Again calling the max heapify on largest index
            maxHeapify(salary, size, largestIndex);
        }
    }
}
