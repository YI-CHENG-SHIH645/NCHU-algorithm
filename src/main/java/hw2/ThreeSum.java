package hw2;
import edu.princeton.cs.algs4.StdOut;
import utils.readMyData;

import java.util.Arrays;


public class ThreeSum {
    private ThreeSum() {}

    public static int combinations(int[] array) {
        Arrays.sort(array);
        int low, high, two_sum, counter = 0, target;
        for (int i = 0; i < array.length-2; i++) {
            low = i+1;
            high = array.length-1;
            target = -array[i];
            if (i == 0 || (array[i] != array[i-1])){
                while (low < high){
                    two_sum = array[low] + array[high];
                    if (two_sum == target){
                        counter++;
                        while (low < high && array[low] == array[++low]);
                        while (low < high && array[high] == array[--high]);
                    }else if(two_sum > target)
                        high--;
                    else
                        low++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[][] arrays = readMyData.readAllLinesInts();
        for (int[] array : arrays) StdOut.println(ThreeSum.combinations(array));
    }
}
