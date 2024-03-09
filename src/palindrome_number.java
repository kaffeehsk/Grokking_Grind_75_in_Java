public class palindrome_number {
    public static void main(String[] args) {
        int[] n1 = {1221, 345, 2112, 8998, 200};
        for(int i = 0; i < n1.length; i++){
            System.out.println(isPalindrome(n1[i]));
        }
    }
    static boolean isPalindrome(int n) {
       int n1 = n;
       int start = 0;
       while(n1 > 0) {
           int last_num = n1 % 10;
           n1 = n1 / 10;
           start = start * 10 + last_num;
       }
       return start == n;
    }
}
