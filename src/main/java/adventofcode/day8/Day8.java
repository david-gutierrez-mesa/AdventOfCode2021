package adventofcode.day8;

public class Day8 {
    public static void main(String[]args) {

        int result = SegmentSearch.decode("data_day8.txt");
        System.out.println("The result of part I is: " + result);

        int resultII = SegmentSearch.fullDecode("data_day8.txt");
        System.out.println("The result of part II is: " + resultII);
    }
}
