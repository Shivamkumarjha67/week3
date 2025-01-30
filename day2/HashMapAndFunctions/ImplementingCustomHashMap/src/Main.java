public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer, Integer> hashmap = new CustomHashMap<>();

        hashmap.put(12, 4);
        hashmap.put(34, 1);
        hashmap.put(45, 7);
        hashmap.put(56, 21);
        hashmap.put(57, 9);
        hashmap.put(23, 19);
        hashmap.put(67, 1);
        hashmap.put(85, 6);

        System.out.println("Value corresponding to the key 12 is " + hashmap.get(12));

        System.out.println("Displaying the detail of the hashmap: ");
        hashmap.display();
    }
}