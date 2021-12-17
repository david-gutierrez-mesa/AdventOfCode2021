package adventofcode;

import adventofcode.day8.SegmentSearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day8Test {

    @Test
    @DisplayName("Test Part I")
    public void testOnePartI() {
        assertEquals(26, SegmentSearch.decode("Day8_Example.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test Part II")
    public void testTwoPartI() {
        assertEquals(61229, SegmentSearch.fullDecode("Day8_Example.txt"),
                "Result is not the expected one");
    }

}
