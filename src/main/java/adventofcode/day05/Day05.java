package adventofcode.day05;

public class Day05 {
    public static void main(String[]args) {

        int savePath = HydrothermalVenture.findPath("data_day05.txt", false);
        System.out.println("The result of part I is: " + savePath);

        int lifeSupportRating = HydrothermalVenture.findPath("data_day05.txt", true);
        System.out.println("The result of part II is: " + lifeSupportRating);

    }
}
