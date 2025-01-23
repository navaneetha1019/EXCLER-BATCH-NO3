public class LTCode002 {
    public int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow case
            }
            
            reversed = reversed * 10 + digit;
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        LTCode002 solution = new LTCode002();
        
        System.out.println(solution.reverse(123)); // Output: 321
        System.out.println(solution.reverse(-123)); // Output: -321
        System.out.println(solution.reverse(120)); // Output: 21
        System.out.println(solution.reverse(0)); // Output: 0
        System.out.println(solution.reverse(1534236469)); // Output: 0 (Overflow case)
    }
}
