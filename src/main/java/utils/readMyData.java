package utils;
import edu.princeton.cs.algs4.StdIn;
import java.util.regex.Pattern;

public class readMyData {
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");

    public static String[][] readAllLinesStrings() {
        String[] lines = StdIn.readAllLines();
        String[][] splitedLines = new String[lines.length][];
        for (int i = 0; i < lines.length; i++) splitedLines[i] = WHITESPACE_PATTERN.split(lines[i]);

        return splitedLines;
    }

    public static int[][] readAllLinesInts(){
        String[][] lines = readAllLinesStrings();
        int[][] arrays = new int[lines.length][];

        for (int i = 0; i < lines.length; i++){
            arrays[i] = new int[lines[i].length];
            for (int j = 0; j < lines[i].length; j++) {
                arrays[i][j] = Integer.parseInt(lines[i][j]);
            }
        }

        return arrays;
    }

    public static void main(String[] args){

    }
}
