package adventofcode.day06;

public class Day06 {
    public static void main(String[]args) {

        Long numberOfLanternfish = Lanternfish.calculateNumber("data_day06.txt", 80);
        System.out.println("The result of part I is: " + numberOfLanternfish);

        Long numberOfLanternfishII =  Lanternfish.calculateNumber("data_day06.txt", 256);
        System.out.println("The result of part II is: " + numberOfLanternfishII);

    }
}
