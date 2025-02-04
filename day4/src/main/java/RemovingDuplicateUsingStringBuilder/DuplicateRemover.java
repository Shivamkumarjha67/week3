package RemovingDuplicateUsingStringBuilder;

import java.util.HashSet;

// Duplicate remover class definition
public class DuplicateRemover {
    // Static method definition for removing duplicate character
    public static String removeDuplicate(String str) {
        // Hashset declaration for occurred character storage
        HashSet<Character> occurredCharacter = new HashSet<>();
        // Storing the modified string into the string builder object
        StringBuilder modifiedString = new StringBuilder();

        // Iterating the passed string each character and storing the character that have not occurred previously
        for(int i=0; i<str.length(); i++) {
            // storing the character
            char current = str.charAt(i);

            // Condition for checking the occurrence, if not storing and updating the string
            if(!occurredCharacter.contains(current)) {
                occurredCharacter.add(current);
                modifiedString.append(current);
            }
        }

        // passing the modified string
        return modifiedString.toString();
    }
}
