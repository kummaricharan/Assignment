import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> d = new HashMap<>();
        d.put('M', 1000);
        d.put('D', 500);
        d.put('C', 100);
        d.put('L', 50);
        d.put('X', 10);
        d.put('V', 5);
        d.put('I', 1);

        Scanner scanner = new Scanner(System.in);
        String inputRoman = scanner.nextLine().toUpperCase();

        int result = romanToInteger(inputRoman, d);
        System.out.println(result);
    }

    public static int romanToInteger(String s, Map<Character, Integer> d) {
        int c = 0, t = 0, p = 0;
        for (int i = 0; i < s.length(); i++) {
            c = d.get(s.charAt(i));
            if (c > p) {
                t += c - 2 * p;
            } else {
                t += c;
            }
            p = c;
        }
        return t;
    }
}
