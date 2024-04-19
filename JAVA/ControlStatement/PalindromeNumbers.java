public class PalindromeNumbers{
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 500:");

        for (int i = 1; i <= 500; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
