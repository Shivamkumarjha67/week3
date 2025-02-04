
package ReverseString;

// Reverse class definition
public class Reverse {
    // Method for reversing the string
    public static String reverseString(String str) {
        // Creating the stringbuilder class object
        StringBuilder sb = new StringBuilder();
        // Appending the passed string into the stringbuilder object "sb"
        sb.append(str);
        // Reversing the stringbuilder content and storing back into the sb reference
        sb = sb.reverse();

        // Returning the modified result as the string the object
        return sb.toString();
    }
}
