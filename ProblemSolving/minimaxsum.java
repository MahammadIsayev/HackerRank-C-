import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long minSum = 0, maxSum = 0;
        for (int i = 0; i < 5; i++) {
            minSum += arr.get(i);
            maxSum += arr.get(i);
        }
        System.out.println((minSum - Collections.max(arr)) + " " + (maxSum - Collections.min(arr)));
    }

}

public class minimaxsum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        Result1.miniMaxSum(arr);

        bufferedReader.close();
    }
}
