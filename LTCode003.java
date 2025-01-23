public class LTCode003 {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long result = 0;

        // Step 1: Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check the sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;

            // Step 4: Handle overflow
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        // Step 5: Return the result with sign
        return (int) (result * sign);
    }

    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();
        
        System.out.println(solution.myAtoi("42")); // Output: 42
        System.out.println(solution.myAtoi(" -042")); // Output: -42
        System.out.println(solution.myAtoi("1337c0d3")); // Output: 1337
        System.out.println(solution.myAtoi("0-1")); // Output: 0
        System.out.println(solution.myAtoi("words and 987")); // Output: 0
    }
}

