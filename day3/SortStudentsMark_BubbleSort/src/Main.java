public class Main {
    public static void main(String[] args) {
        int size = 10;
        int[] marks = {12, 34, 67, 11, 99, 38, 77, 89, 10, 1};

        BubbleSort.sortMarksInAscendingOrder(marks, size);

        for(int i=0; i<size; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}