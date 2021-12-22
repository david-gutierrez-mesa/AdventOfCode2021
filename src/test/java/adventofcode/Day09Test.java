package adventofcode;

import adventofcode.day09.SmokeBasin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day09Test {

    @Test
    @DisplayName("Test Part I")
    public void testOnePartI() {
        assertEquals(15, SmokeBasin.riskLevel("Day09_Example.txt"),
                "Result is not the expected one");
    }

/*    @Test
    @DisplayName("Test Part II")
    public void testTwoPartI() {
        assertEquals(61229, SmokeBasin.riskLevel("Day09_Example.txt"),
                "Result is not the expected one");
    }*/

}
