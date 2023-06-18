package hw4;
import edu.princeton.cs.algs4.StdOut;
import utils.readMyData;


public class PrimeString {
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static int howManyPrimeString(String[] array){
        int counter = 0, sum;
        for (String s: array){
            sum = 0;
            for (char c: s.toCharArray())
                sum += c;
//            StdOut.println(sum);
            if (isPrime(sum)) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String[][] splitedLines = readMyData.readAllLinesStrings();
        for (String[] array: splitedLines) StdOut.printf("%d\n", PrimeString.howManyPrimeString(array));
    }
}
