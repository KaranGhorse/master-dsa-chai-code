package Palindrome;

public class Palindrome2 {
    boolean isPalindrome(int x) {

        if (x < 0) return false;
        int original = x, reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
public static void main(String[] args) {
        Palindrome2 p = new Palindrome2();
        System.out.println(p.isPalindrome(123121));
    }
}

