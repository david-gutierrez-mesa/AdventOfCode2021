package adventofcode.day01;

public class Day01 {
    public static void main(String[]args) {

        int singleMeasurement = SonarSweep.measurementIncreases("data_day01.txt");
        int threeMeasurement = SonarSweep.threeMeasurementSlidingWindowIncreases("data_day01.txt");
        System.out.println("The result of single-measurement is: " + singleMeasurement);
        System.out.println("The result of three-measurement sliding window is: " + threeMeasurement);

    }
}
