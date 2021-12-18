package adventofcode.day05;

import adventofcode.common.FileReaderClass;

import java.util.List;

import static java.lang.Math.abs;

public class HydrothermalVenture {
    private HydrothermalVenture() {
    }

    public static int findPath(String path, boolean diagonal){
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();
        int [][] diagram = new int[1000][1000];
        for (String line : lines){
            String[] pairs = line.split(" -> ");
            String[] left = pairs[0].split(",");
            String[] right = pairs[1].split(",");
            int x1 = Integer.parseInt(left[0]);
            int y1 = Integer.parseInt(left[1]);
            int x2 = Integer.parseInt(right[0]);
            int y2 = Integer.parseInt(right[1]);
            if (x1 == x2) {
                if (y1 < y2){
                    for (int i = y1; i <= y2; i++) {
                        diagram[x1][i] +=1;
                    }
                } else {
                    for (int i = y1; i >= y2; i--) {
                        diagram[x1][i] +=1;
                    }
                }

            } else if (y1 == y2){
                if (x1 < x2){
                    for (int i = x1; i <= x2; i++) {
                        diagram[i][y1] +=1;
                    }
                } else {
                    for (int i = x1; i >= x2; i--) {
                        diagram[i][y1] +=1;
                    }
                }
            } else if ((diagonal) && (abs((x1 - x2)) == abs((y1 - y2)))){
                int j = y1;
                if (x1 < x2){
                    for (int i = x1; i <= x2; i++) {
                        diagram[i][j] +=1;
                        if (y1 > y2){
                            j--;
                        } else {
                            j++;
                        }
                    }
                } else {
                    for (int i = x1; i >= x2; i--) {
                        diagram[i][j] +=1;
                        if (y1 > y2){
                            j--;
                        } else {
                            j++;
                        }
                    }
                }
            }
        }

        int result = 0;

        for (int[] ints : diagram) {
            for (int anInt : ints) {
                if (anInt >= 2) {
                    result ++;
                }
            }
        }

        return result;
    }
}
