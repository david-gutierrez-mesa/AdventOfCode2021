package adventofcode.day08;

public class Day08 {
    public static void main(String[]args) {

        int result = SegmentSearch.decode("data_day08.txt");
        System.out.println("The result of part I is: " + result);

        int resultII = SegmentSearch.fullDecode("data_day08.txt");
        System.out.println("The result of part II is: " + resultII);
    }
}
