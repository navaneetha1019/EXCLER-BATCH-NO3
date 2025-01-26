import java.util.Scanner;

public class Demo015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();
    }
}
