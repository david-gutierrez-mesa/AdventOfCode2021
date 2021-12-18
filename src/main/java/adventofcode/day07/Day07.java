package adventofcode.day07;

public class Day07 {
    public static void main(String[]args) {

        int fuelCost = TreacheryOfWhales.fuelCost("data_day07.txt");
        System.out.println("The result of part I is: " + fuelCost);

        int numberOfLanternfishII =  TreacheryOfWhales.fuelCostExpensive("data_day07.txt");
        System.out.println("The result of part II is: " + numberOfLanternfishII);
    }
}
