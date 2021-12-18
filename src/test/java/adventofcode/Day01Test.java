package adventofcode;

import adventofcode.day01.SonarSweep;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test {

    @Test
    @DisplayName("Only one element should return 0")
    public void testWithOneElement() {
        assertEquals(0, SonarSweep.measurementIncreases("Day01_testWithOneElement.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Two elements with increase should return 1")
    public void testTwoElementsWithIncrease() {
        assertEquals(1, SonarSweep.measurementIncreases("Day01_testWithTwoElementsWithIncrease.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Two elements with increase should return 0")
    public void testTwoElementsWithOutIncrease() {
        assertEquals(0, SonarSweep.measurementIncreases("Day01_testWithTwoElementsWithOutIncrease.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Ten elements with 7 increases should return 7")
    public void testWithSevenIncreases() {
        assertEquals(7, SonarSweep.measurementIncreases("Day01_testWithSevenIncreases.txt"),
                "Result is not the expected one");
    }

}
