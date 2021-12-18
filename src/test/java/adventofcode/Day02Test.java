package adventofcode;

import adventofcode.day02.Submarine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test {
    @Test
    @DisplayName("Test for Day 2 part I")
    public void testDay2PartI() {
        assertEquals(150, Submarine.Pilot("Day02_Example.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test for Day 2 part II")
    public void testDay2PartII() {
        assertEquals(900, Submarine.PilotManual("Day02_Example.txt"),
                "Result is not the expected one");
    }
}
