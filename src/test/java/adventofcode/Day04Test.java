package adventofcode;

import adventofcode.day04.Bingo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day04Test {

    @Test
    @DisplayName("Test Part I")
    public void testPartI() {
        assertEquals(4512, Bingo.findWinner("Day04_Example.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test Part II")
    public void testPartII() {
        assertEquals(1924, Bingo.findLoser("Day04_Example.txt"),
                "Result is not the expected one");
    }
}
