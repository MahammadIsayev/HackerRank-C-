import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class betweentwosets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
        getTotalX(a, b, n, m);
    }

    public static void getTotalX(List<Integer> a, List<Integer> b, int n, int m) {
        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            boolean flag = true;
            for (int j = 0; j < n && flag; j++) {
                if (i % a.get(j) != 0) {
                    flag = false;
                }
            }
            for (int k = 0; k < m && flag; k++) {
                if (b.get(k) % i != 0) {
                    flag = false;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
