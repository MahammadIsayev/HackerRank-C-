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

class Result {

    public static void plusMinus(List<Integer> arr) {

        double pcnt = 0, ncnt = 0, zcnt = 0;
        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) > 0) {
                pcnt++;
            } 
            else if (arr.get(i) < 0) {
                ncnt++;
            } 
            else {
                zcnt++;
            }
        }
        DecimalFormat dF = new DecimalFormat("#.######");
        System.out.println(dF.format(pcnt / arr.size()));
        System.out.println(dF.format(ncnt / arr.size()));
        System.out.println(dF.format(zcnt / arr.size()));
    }

}

public class plusminus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
