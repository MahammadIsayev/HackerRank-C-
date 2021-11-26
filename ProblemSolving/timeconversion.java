import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String first = s.substring(0, 2); // "12"
        String second = s.substring(3, 5); // "01"
        String third = s.substring(6, 8); // "00"
        int firstVal = Integer.parseInt(first); // 12
        int secondVal = Integer.parseInt(second); // 01
        int thirdVal = Integer.parseInt(third); // 00
        if (s.contains("A") && firstVal == 12) {
            firstVal = 0;
        } else if (s.contains("P") && firstVal < 12) {
            firstVal += 12;
        }
        //System.out.printf("%02d:%02d:%02d", firstVal, secondVal, thirdVal);
        String result = "" + String.format("%02d", firstVal) + ":" + String.format("%02d", secondVal) + ":" + String.format("%02d", thirdVal) + "";
        System.out.println(result);
    }
}
