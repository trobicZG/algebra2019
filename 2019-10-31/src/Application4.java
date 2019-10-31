import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi rijec:");
        String word = scanner.next();

        if (isPalindrome(word)) {
            System.out.println("Palindom je!");
        } else {
            System.out.println("Nije palindrom!");
        }
    }

    private static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
