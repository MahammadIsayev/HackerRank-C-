import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gradingstudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            grades.add(sc.nextInt());
        }
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                System.out.println(grades.get(i));
            } else {
                int q = grades.get(i) / 5;
                int rem = grades.get(i) % 5;
                if (rem >= 3) {
                    grades.set(i, (q + 1) * 5);
                    System.out.println(grades.get(i));
                } else {
                    System.out.println(grades.get(i));
                }
            }

        }
    }
}
