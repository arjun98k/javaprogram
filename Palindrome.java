public class Palindrome {

    public static boolean IsaPalindrome(int n){
        int og = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10 ;
            reversed = reversed * 10 + digit;
            n = n /10;
        }

       return og == reversed;
    }
    public static void main(String[] args) {
        System.out.println(  IsaPalindrome(121));
    }
}
