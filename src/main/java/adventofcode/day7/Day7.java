package adventofcode.day7;

public class Day7 {
    public static void main(String[]args) {

        int fuelCost = TreacheryOfWhales.fuelCost("data_day7.txt");
        System.out.println("The result of part I is: " + fuelCost);

        int numberOfLanternfishII =  TreacheryOfWhales.fuelCostExpensive("data_day7.txt");
        System.out.println("The result of part II is: " + numberOfLanternfishII);
    }
}
