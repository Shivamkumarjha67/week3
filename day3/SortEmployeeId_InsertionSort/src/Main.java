public class Main {
    public static void main(String[] args) {
        int size = 8;
        int[] empId = {110, 102, 103, 101, 109, 106, 121, 108};

        InsertionSort.sortEmployeeIdInAscendingOrder(empId, size);
        System.out.println("After the sorting operation: ");

        for(int id : empId) {
            System.out.print(id + " ");
        }
    }
}