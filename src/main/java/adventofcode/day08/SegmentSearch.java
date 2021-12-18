package adventofcode.day08;

import adventofcode.common.FileReaderClass;

import java.util.List;

public class SegmentSearch {
    private SegmentSearch() {
    }

    public static int decode(String path) {
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();

        int solution = 0;

        for (String line : lines) {
            String[] message = line.trim().split("\\|");
            String[] output = message[1].trim().split(" ");
            for (String word : output) {
                int wordLength = word.length();
                if ((wordLength == 2) || (wordLength == 4) || (wordLength == 3) || (wordLength == 7)) {
                    solution++;
                }
            }
        }

        return solution;
    }

    public static int fullDecode(String path) {
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();

        int solution = 0;

        for (String line : lines) {
            String[] message = line.trim().split("\\|");
            String[] allWords = line.trim().replace(" \\| ", " ").split(" ");
            String[] output = message[1].trim().split(" ");
            String[] code = new String[10];
            for (String word : allWords) {
                int wordLength = word.length();
                switch (wordLength) {
                    case 2:
                        code[1] = word;
                        break;
                    case 4:
                        code[4] = word;
                        break;
                    case 3:
                        code[7] = word;
                        break;
                    case 7:
                        code[8] = word;
                        break;

                }
            }
            for (String word : allWords) {
                int wordLength = word.length();
                if (wordLength == 6) {
                    if (containsAll(word, code[4])) {
                        code[9] = word;
                    } else if (containsAll(word, code[7])) {
                        code[0] = word;
                    } else {
                        code[6] = word;
                    }
                }
            }
            for (String word : allWords) {
                int wordLength = word.length();
                if (wordLength == 5) {
                    if (containsAll(word, code[1])) {
                        code[3] = word;
                    } else if (containsN(code[6], word, 5)) {
                        code[5] = word;
                    } else {
                        code[2] = word;
                    }
                }
            }
            StringBuilder outputInt = new StringBuilder();
            for (String word : output) {
                for (int i = 0; i < code.length; i++) {
                    if (containsEvery(word, code[i])) {
                        outputInt.append(i);
                    }

                }
            }
            solution += Integer.parseInt(String.valueOf(outputInt));
        }
        return solution;
    }

    private static boolean containsAll(String a, String b) {
        if (b == null) return false;
        String[] charb = b.split("");

        for (String cha : charb) {
            if (!a.contains(cha)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsEvery(String a, String b) {
        if (b == null) return false;
        if (a.length() != b.length()) return false;
        String[] charb = b.split("");

        for (String cha : charb) {
            if (!a.contains(cha)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsN(String a, String b, int n) {
        String[] charb = b.split("");

        int coincidence = 0;
        for (String cha : charb) {
            if (a.contains(cha)) {
                coincidence++;
            }
        }
        return coincidence == n;
    }
}
