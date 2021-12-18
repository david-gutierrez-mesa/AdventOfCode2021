package adventofcode;

import adventofcode.day07.TreacheryOfWhales;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day07Test {

    @Test
    @DisplayName("Test Part I")
    public void testOnePartI() {
        assertEquals(37, TreacheryOfWhales.fuelCost("Day07_Example.txt"),
                "Result is not the expected one");
    }

   @Test
    @DisplayName("Test Part II")
    public void testTwoPartI() {
        assertEquals(168, TreacheryOfWhales.fuelCostExpensive("Day07_Example.txt"),
                "Result is not the expected one");
    }

}
