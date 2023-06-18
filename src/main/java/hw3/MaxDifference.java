package hw3;
import edu.princeton.cs.algs4.StdOut;
import utils.readMyData;

public class MaxDifference {
    public static int max_difference(int[] array){
        int argmin = 0, argmax = 0;
        for (int i = 1; i < array.length; i++){
            if (array[argmin] > array[i])
                argmin = i;
            if (array[argmax] < array[i])
                argmax = i;
        }
        return Math.abs(array[argmax] - array[argmin]);
    }

    public static void main(String[] args) {
        int[][] arrays = readMyData.readAllLinesInts();
        for (int[] array : arrays) StdOut.println(MaxDifference.max_difference(array));
    }
}
