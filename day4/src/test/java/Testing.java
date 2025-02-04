import static org.junit.jupiter.api.Assertions.*;

import ReverseString.Reverse;
import org.junit.jupiter.api.Test;

public class Testing {
    @Test
    void reverseing() {
        assertEquals("olleh", Reverse.reverseString("hello"));
    }
}