package RemovingDuplicateUsingStringBuilder;

// Main class definition
public class Main {
    public static void main(String[] args) {
        // string declaration
        String str = "Capgemini is a well reputed multinational company";
        // Method calling and printing the returned result
        System.out.println("After modification the string will be: " + DuplicateRemover.removeDuplicate(str));
    }
}
