package adventofcode;

import adventofcode.day08.SegmentSearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day08Test {

    @Test
    @DisplayName("Test Part I")
    public void testOnePartI() {
        assertEquals(26, SegmentSearch.decode("Day08_Example.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test Part II")
    public void testTwoPartI() {
        assertEquals(61229, SegmentSearch.fullDecode("Day08_Example.txt"),
                "Result is not the expected one");
    }

}
