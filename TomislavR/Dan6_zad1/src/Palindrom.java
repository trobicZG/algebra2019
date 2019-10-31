import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word: ");
        String word = scanner.next();
        if (Palindrom(word))
            System.out.println("Palindrom");
        else
            System.out.println("Nije");

    }

    public static  boolean Palindrom(String s) {
        boolean isPalindrom=true;
        for(int i=0; i<s.length()/2;i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1))
                isPalindrom=false;
        }
        return isPalindrom;
    }
}
