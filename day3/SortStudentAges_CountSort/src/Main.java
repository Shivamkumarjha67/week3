public class Main {
    public static void main(String[] args) {
        // Age of the student
        int[] ages = {11, 10, 10, 14, 18};
        int size = 5;

        // Method calling for sorting using the count sort
        CountSort.sortAges(ages, size);
        System.out.println("After sorting the age: ");

        // Printing the age of the student after sorting
        for(int age : ages) {
            System.out.print(age + " ");
        }
    }
}