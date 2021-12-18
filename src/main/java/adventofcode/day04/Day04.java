package adventofcode.day04;

public class Day04 {
    public static void main(String[]args) {

        int bingoWinner = Bingo.findWinner("data_day04.txt");
        System.out.println("The result of part I is: " + bingoWinner);

        int bingoLoser = Bingo.findLoser("data_day04.txt");
        System.out.println("The result of part II is: " + bingoLoser);

    }
}
