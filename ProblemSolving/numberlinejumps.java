import java.util.Scanner;

public class numberlinejumps {
    public static void kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if (x1 < x2 && v1 < v2) {
            System.out.println("NO");
        } else {
            while(x1 <= x2) {
                if(x1 == x2) {
                    System.out.println("YES");
                    System.exit(0);
                }
                x1 += v1;
                x2 += v2;
            }
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        kangaroo(x1, v1, x2, v2);
    }
}
