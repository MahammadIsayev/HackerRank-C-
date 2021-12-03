import java.util.ArrayList;
import java.util.Scanner;

public class appleandorange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int appleCounter = 0;
        int orangeCounter = 0;

        ArrayList<Integer> apples = new ArrayList<>();
        ArrayList<Integer> oranges = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            apples.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            oranges.add(sc.nextInt());
        }

        for (int i = 0; i < apples.size(); i++) {
            apples.set(i, apples.get(i) + a);
            if (apples.get(i) >= s && apples.get(i) <= t) {
                appleCounter += 1;
            }
        }

        for (int i = 0; i < oranges.size(); i++) {
            oranges.set(i, oranges.get(i) + b);
            if (oranges.get(i) >= s && oranges.get(i) <= t) {
                orangeCounter += 1;
            }
        }

        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
}
