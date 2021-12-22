package adventofcode.day09;

import adventofcode.common.FileReaderClass;

import java.util.List;

public class SmokeBasin {
    private SmokeBasin() {
    }

    public static int riskLevel(String path){
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();
        int xMax = lines.size();
        int yMax = lines.get(0).length();
        int result = 0;

        for (int x = 0; x < lines.size(); x++) {
            String line = lines.get(x);
            for (int y = 0; y < line.length(); y++) {
                int value = Character.getNumericValue(line.charAt(y));
                int up = 10;
                int down = 10;
                int right = 10;
                int left = 10;
                if (x > 0){
                    up = Character.getNumericValue(lines.get(x-1).charAt(y));
                }
                if (x < xMax - 1){
                    down = Character.getNumericValue(lines.get(x+1).charAt(y));
                }
                if (y < yMax - 1){
                    right = Character.getNumericValue(lines.get(x).charAt(y+1));
                }
                if (y > 0){
                    left = Character.getNumericValue(lines.get(x).charAt(y-1));
                }

                if ((value < up) && (value < down) && (value < right) && (value < left)){
                    result += value +1;
                }
            }
        }

        return result;
    }
}
