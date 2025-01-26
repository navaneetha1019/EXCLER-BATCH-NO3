import java.util.Scanner;

public class Demo014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int incremented = ++number;
        int decremented = --number;
        int negated = -number;
        boolean isPositive = number > 0;

        System.out.println("After pre-increment: " + incremented);
        System.out.println("After pre-decrement: " + decremented);
        System.out.println("Unary minus (negation): " + negated);
        System.out.println("Is the number positive? " + isPositive);

        scanner.close();
    }
}
