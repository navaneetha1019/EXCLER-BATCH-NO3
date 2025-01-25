import java.util.Scanner;

class LTCode001 {
    public boolean isPalindrome(int x) {
       
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

      
        return x == rev || x == rev / 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        LTCode001 Lt001 = new LTCode001();
        boolean result = Lt001.isPalindrome(x);

        System.out.println(result);
    }
}
