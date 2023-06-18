package hw5;
import edu.princeton.cs.algs4.StdOut;
import utils.readMyData;
import java.util.Arrays;


public class CheckPoint {
    public static boolean check(int[] point_value) {
        int[][] points = new int[point_value.length/2][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = point_value[i * 2];
            points[i][1] = point_value[i * 2 + 1];
        }
        double[] m_array;
        for (int i = 0; i < points.length; i++){
            m_array = new double[points.length-1-i];
            for (int j = i + 1; j < points.length; j++)
                m_array[j-i-1] = (double)(points[i][1] - points[j][1])/(points[i][0] - points[j][0]);
            Arrays.sort(m_array);
            for (int k = 0; k < m_array.length - 1; k++)
                if (m_array[k] == m_array[k+1]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arrays = readMyData.readAllLinesInts();
        for (int[] array: arrays) StdOut.println(CheckPoint.check(array));
    }
}
