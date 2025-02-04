package ConcatinatingStringUsingStringBuffer;

// Class declaration for handling of the concatenation of strings
public class ConcatenateString {
    public static String concatenateStringByStringBuffer(String[] str) {
        // Declaring the stringbuffer for efficient handling
        StringBuffer transformedString = new StringBuffer();

        // Iterating and storing the result
        for(int i=0; i<str.length; i++) {
            transformedString.append(str[i]);
        }

        // Returning the result obtained
        return transformedString.toString();
    }
}
