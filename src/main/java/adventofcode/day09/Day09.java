package adventofcode.day09;

public class Day09 {
    public static void main(String[]args) {

        int result = SmokeBasin.riskLevel("data_day09.txt");
        System.out.println("The result of part I is: " + result);

        int resultII = SmokeBasin.riskLevel("data_day09.txt");
        System.out.println("The result of part II is: " + resultII);
    }
}
