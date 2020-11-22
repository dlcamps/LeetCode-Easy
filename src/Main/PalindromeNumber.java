package Main;

public class PalindromeNumber {

    int testInt = 121;

    public static void main(String[] args) {
        new PalindromeNumber();
    }

    public PalindromeNumber() {
        isPalindrome(testInt);
    }

    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) { return false; }

        int reverseInt = 0;
        while (x > reverseInt) {
            reverseInt = (reverseInt * 10) + (x % 10);
            x = x / 10;
        }
        return (x == reverseInt || x == reverseInt / 10);
    }
}
