public class InsertionSort {
    public static void sortEmployeeIdInAscendingOrder(int[] empId, int size) {
        for(int i=1; i<size; i++) {
            int key = empId[i];
            int j = i-1;

            while(j >= 0 && empId[j] > key) {
                empId[j+1] = empId[j];
                j--;
            }

            empId[j + 1] = key;
        }
    }
}
