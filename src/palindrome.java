public class palindrome {
    public static void main(String[] args) {
        String[] s = {"kayak", "hello", "RACEACAR", "A", "ABCDABCD"};

        for(int i = 0; i < s.length; i++){
            System.out.println(isPalindrome(s[i]));
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
               return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}