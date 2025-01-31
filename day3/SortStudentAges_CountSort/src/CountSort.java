public class CountSort {
    public static void sortAges(int[] ages, int size) {
        int maximumAge = 0;

        // Getting the maximum age present in the array
        for(int age : ages)
            if(maximumAge < age) maximumAge = age;

        int[] frequency = new int[10];

        // Storing the frequency of each age
        for(int age : ages) {
            frequency[age - 10]++;
        }

        int index = 0;

        // Now storing back in the ascending order on the basis of their frequency
        for(int i=0; i<10; i++) {
            while(frequency[i] > 0) {
                ages[index++] = i + 10;
                frequency[i]--;
            }
        }
    }
}
