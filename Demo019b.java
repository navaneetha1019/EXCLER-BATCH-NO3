public class Demo019b{
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int sum = 0;

        System.out.print("Fibonacci Sequence: " + num1 + ", " + num2);

        for (int i = 3; i <= 10; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(", " + sum);
        }
    }
}