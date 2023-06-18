import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import hw1.ArrayData;
import hw2.ThreeSum;
import hw3.MaxDifference;
import hw4.PrimeString;
import hw5.CheckPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllTests {

    @Test
    public void testArrayMax() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/test/testData/ArrayData.txt"));
        int[] arr, gt = {3, 3};
        int i = 0;
        for (String line = bf.readLine(); line != null; line = bf.readLine()) {
            arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            Assertions.assertEquals(ArrayData.arrayMax(arr), gt[i++]);
        }
    }

    @Test
    public void testInnerProduct() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/test/testData/ArrayData.txt"));
        int[][] arr = new int[2][];
        int[] gt = {10};
        int i = 0;
        for (String line = bf.readLine(); line != null; line = bf.readLine()) {
            arr[i++] = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            if(i%2==0) Assertions.assertEquals(ArrayData.innerProduct(arr[i-2], arr[i-1]), gt[i-2]);
        }
    }

    @Test
    public void testCombinations() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/test/testData/ThreeSum.txt"));
        int[] arr, gt = {2, 2};
        int i = 0;
        for (String line = bf.readLine(); line != null; line = bf.readLine()) {
            arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            Assertions.assertEquals(ThreeSum.combinations(arr), gt[i++]);
        }
    }

    @Test
    public void testMaxDifference() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/test/testData/MaxDifference.txt"));
        int[] arr, gt = {11, 105};
        int i = 0;
        for (String line = bf.readLine(); line != null; line = bf.readLine()) {
            arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            Assertions.assertEquals(MaxDifference.max_difference(arr), gt[i++]);
        }
    }

    @Test
    public void testPrimeString() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/test/testData/PrimeString.txt"));
        String[] arr;
        int[] gt = {1, 1};
        int i = 0;
        for (String line = bf.readLine(); line != null; line = bf.readLine()) {
            arr = line.split(" ");
            Assertions.assertEquals(PrimeString.howManyPrimeString(arr), gt[i++]);
        }
    }

    @Test
    public void testCheckPoint() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/test/testData/CheckPoint.txt"));
        int[] arr;
        boolean[] gt = {true, false, false};
        int i = 0;
        for (String line = bf.readLine(); line != null; line = bf.readLine()) {
            arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            Assertions.assertEquals(CheckPoint.check(arr), gt[i++]);
        }
    }

}
