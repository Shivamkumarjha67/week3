package ConcatinatingStringUsingStringBuffer;

public class Main {
    public static void main(String[] args) {
        // Declaration of the string array
        String[] str = {"Raju", "Pankaj", "Sanjay", "Atul", "Vinay"};
        // Method calling the storing the result
        String transformedString = ConcatenateString.concatenateStringByStringBuffer(str);

        // Printing the result
        System.out.println("Resultant of the operation is: " + transformedString);
    }
}
