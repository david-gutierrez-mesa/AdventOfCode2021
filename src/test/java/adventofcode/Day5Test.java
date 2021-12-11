package adventofcode;

import adventofcode.day5.HydrothermalVenture;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day5Test {

    @Test
    @DisplayName("Test Part I")
    public void testPartI() {
        assertEquals(5, HydrothermalVenture.findPath("Day5_Example.txt", false),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test Part II")
    public void testPartII() {
        assertEquals(12, HydrothermalVenture.findPath("Day5_Example.txt", true),
                "Result is not the expected one");
    }
}
