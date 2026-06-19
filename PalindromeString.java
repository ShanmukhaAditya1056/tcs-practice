import java.util.Scanner;

public class PalindromeString {

    public static boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;

        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }

            lo++;
            hi--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}