package adventofcode.day03;

public class Day03 {
    public static void main(String[]args) {

        int powerConsumption = Diagnostic.powerConsumption("data_day03.txt");
        System.out.println("The result of part I is: " + powerConsumption);

        int lifeSupportRating = Diagnostic.lifeSupportRating("data_day03.txt");
        System.out.println("The result of part II is: " + lifeSupportRating);

    }
}
