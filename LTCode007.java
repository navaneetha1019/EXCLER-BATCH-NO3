public class LTCode007 { 
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        LTCode007 solution = new LTCode007();
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};

        System.out.println(java.util.Arrays.toString(solution.plusOne(digits1))); // Output: [1, 2, 4]
        System.out.println(java.util.Arrays.toString(solution.plusOne(digits2))); // Output: [4, 3, 2, 2]
        System.out.println(java.util.Arrays.toString(solution.plusOne(digits3))); // Output: [1, 0]
    }
}