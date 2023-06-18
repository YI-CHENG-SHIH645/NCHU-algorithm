package hw1;
import edu.princeton.cs.algs4.StdOut;
import utils.readMyData;

public class ArrayData {
    public static int arrayMax(int[] a) {
        int argmax = 0;
        for (int i = 1; i < a.length; i++)
            if (a[i] > a[argmax])
                argmax = i;
        return a[argmax];
    }

    public static int innerProduct(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++)
            result += a[i] * b[i];
        return result;
    }

    public static void main(String[] args) {
        int[][] arrays = readMyData.readAllLinesInts();
        StdOut.println(arrayMax(arrays[0]));
        StdOut.println(innerProduct(arrays[0], arrays[1]));
    }
}
