package adventofcode.day5;

public class Day5 {
    public static void main(String[]args) {

        int savePath = HydrothermalVenture.findPath("data_day5.txt", false);
        System.out.println("The result of part I is: " + savePath);

        int lifeSupportRating = HydrothermalVenture.findPath("data_day5.txt", true);
        System.out.println("The result of part II is: " + lifeSupportRating);

    }
}
