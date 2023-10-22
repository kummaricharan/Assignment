import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        // String input = "This is charan";
        String input = "abcdefghijklmnopqrstuvwxyz";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase();

        HashSet<Character> uniqueLetters = new HashSet<>();

        int i = 0;
        while (i < input.length()) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
            i++;
        }

        return uniqueLetters.size() == 26;
    }
}