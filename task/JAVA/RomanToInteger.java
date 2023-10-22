import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> romanInteger = new HashMap<>();
        romanInteger.put('M', 1000);
        romanInteger.put('D', 500);
        romanInteger.put('C', 100);
        romanInteger.put('L', 50);
        romanInteger.put('X', 10);
        romanInteger.put('V', 5);
        romanInteger.put('I', 1);

        Scanner scanner = new Scanner(System.in);
        String inputRoman = "IX" ;                    //scanner.nextLine().toUpperCase(); 

        int result = romanToInteger(inputRoman, romanInteger);
        System.out.println(result);
    }

    public static int romanToInteger(String s, Map<Character, Integer> romanInteger) {
        int current = 0, total = 0, prev = 0;
        for (int i = 0; i < s.length(); i++) {
            current = romanInteger.get(s.charAt(i));
            if (current > prev) {
                total += current - 2 * prev;
            } else {
                total += current;
            }
            prev = current;
        }
        return total;
    }
}
