public class Main {
    public static void main(String[] args) {
        // Declaration of the salary and it's size
        int[] salary = {23000, 12000, 23500, 85000, 9300, 23455};
        int size = 6;

        // Method calling for sorting the salary using the heap sort
        HeapSort.sortSalary(salary, size);
        System.out.println("After the sorting the salary: ");

        // Iterating the sorted array and printing the result
        for(int sal : salary) {
            System.out.print(sal + " ");
        }
    }
}