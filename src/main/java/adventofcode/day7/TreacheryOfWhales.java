package adventofcode.day7;

import adventofcode.common.FileReaderClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

public class TreacheryOfWhales {
    private TreacheryOfWhales() {
    }

    public static int fuelCost(String path){
        FileReaderClass fileReader = new FileReaderClass(path);
        List<Integer> crabs = Arrays.stream(fileReader.readStrings().get(0).trim().split(",")).map(Integer::parseInt).collect(Collectors.toList());

        Integer max = Collections.max(crabs);

        Integer[] fuelCostToPosition = new Integer[max];

        for(int i = 0; i < fuelCostToPosition.length; i++){
            int fuelCost = 0;
            for (int crab : crabs){
                fuelCost += abs(crab - i);
            }
            fuelCostToPosition[i] = fuelCost;
        }

        List<Integer> list=Arrays.asList(fuelCostToPosition);
        return Collections.min(list);
    }

    public static int fuelCostExpensive(String path){
        FileReaderClass fileReader = new FileReaderClass(path);
        List<Integer> crabs = Arrays.stream(fileReader.readStrings().get(0).trim().split(",")).map(Integer::parseInt).collect(Collectors.toList());

        Integer max = Collections.max(crabs);

        Integer[] fuelCostToPosition = new Integer[max];

        for(int i = 0; i < fuelCostToPosition.length; i++){
            int fuelCost = 0;
            for (int crab : crabs){
                fuelCost += (abs(crab - i) * (1 + abs(crab - i))) / 2;
            }
            fuelCostToPosition[i] = fuelCost;
        }

        List<Integer> list=Arrays.asList(fuelCostToPosition);
        return Collections.min(list);
    }
}
